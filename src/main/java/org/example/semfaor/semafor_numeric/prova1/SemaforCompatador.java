package org.example.semfaor.semafor_numeric.prova1;

public class SemaforCompatador {
    private int n_places;

    public SemaforCompatador(int n_places) {
        this.n_places = n_places;
    }

    public synchronized void metodoWait() throws InterruptedException {
        while (n_places == 0) {
            System.out.println("["+Thread.currentThread().getName()+"] Esta esperant antes de entrar al port");
            wait();
        }
        n_places--;
    }

    public synchronized void metodoWake() {
        n_places--;
        System.out.println("["+Thread.currentThread().getName()+"] Ha alliberant una plaça");
        notify();
    }
}
