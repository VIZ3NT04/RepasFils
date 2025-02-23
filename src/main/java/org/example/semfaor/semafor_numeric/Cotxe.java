package org.example.semfaor.semafor_numeric;

public class Cotxe extends Thread {
    private EstacioCarrega estacioCarrega;

    public Cotxe(EstacioCarrega estacioCarrega) {
        this.estacioCarrega = estacioCarrega;
    }

    public void run() {
        estacioCarrega.arribarEstacio();
        estacioCarrega.carregarCotxe();
        estacioCarrega.alliberarPuntCarrega();
    }
}