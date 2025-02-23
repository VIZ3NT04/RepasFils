package org.example.semfaor.semafor_numeric;

public class SemaforComptador {
    private int puntsDisponibles;

    public SemaforComptador(int puntsDisponibles) {
        this.puntsDisponibles = puntsDisponibles;
    }

    public int getPuntsDisponibles() {
        return puntsDisponibles;
    }

    public synchronized void metodoWait() {
        try {
            while (puntsDisponibles == 0) {
                System.out.println("No hi ha cap estació de càrrega disponible. Esperant al control d'accés.");
                wait();
            }
            puntsDisponibles--;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void metodoWake() {
        puntsDisponibles++;
        System.out.println("[" + Thread.currentThread().getName() + "] Ha deixar lliure la seua estació. Hi ha " + getPuntsDisponibles() + " punts disponibles.");
        notify();
    }
}