package org.example.semfaor.semafor_binari;

public class Persona implements Runnable{
    private Vater vater;

    public Persona(Vater vater) {
        this.vater = vater;
    }

    @Override
    public void run() {

        try {
            vater.entrar();
            vater.cagar();
            vater.eixir();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
