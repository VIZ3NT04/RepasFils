package org.example.semfaor.semafor_numeric.prova1;

public class Barco implements Runnable{
    private Puerto puerto;

    public Barco(Puerto puerto) {
        this.puerto = puerto;
    }

    @Override
    public void run() {
        try {
            puerto.atracarBarco();
            puerto.repostarBarco();
            puerto.eixir();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
