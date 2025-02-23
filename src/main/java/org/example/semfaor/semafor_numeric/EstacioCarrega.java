package org.example.semfaor.semafor_numeric;

public class EstacioCarrega {
    private SemaforComptador semafor;

    public EstacioCarrega(SemaforComptador semafor) {
        this.semafor = semafor;
        System.out.println("La disponibilitat de càrrega ara per a l'estació és de " + semafor.getPuntsDisponibles() + " punts de càrrega disponibles.");
    }

    public void arribarEstacio() {
        System.out.println("[" + Thread.currentThread().getName() + "] Arriba a l'estació de càrrega elèctrica.");
        semafor.metodoWait();
    }

    public void carregarCotxe() {
        try {
            System.out.println("[" + Thread.currentThread().getName() + "] Comença a carregar; tardarà entre 3 i 6 segons en carregar.");
            Thread.sleep((int) (Math.random() * 3000 + 3000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void alliberarPuntCarrega() {
        System.out.println("[" + Thread.currentThread().getName() + "] Finalitza la càrrega i deixa lliure el lloc per a un altre cotxe.");
        semafor.metodoWake();
    }
}