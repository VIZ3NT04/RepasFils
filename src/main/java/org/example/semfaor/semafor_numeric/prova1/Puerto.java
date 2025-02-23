package org.example.semfaor.semafor_numeric.prova1;

public class Puerto {
    public SemaforCompatador semaforo;

    public Puerto(SemaforCompatador semaforo) {
        this.semaforo = semaforo;
    }


    public void atracarBarco() throws InterruptedException {
        System.out.println("["+Thread.currentThread().getName()+"] Esta atracant el Barco en el Puerto");
        semaforo.metodoWait();
    }

    public void repostarBarco() {
        try {

            int temps = (int) (Math.random() * 3000) + 3000;
            Thread.sleep(temps);
            System.out.println("["+Thread.currentThread().getName()+"] Esta esperant "+temps/1000 + " segons");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void eixir() {
        System.out.println("["+Thread.currentThread().getName()+"] Esta exint el Barco del Puerto");
        semaforo.metodoWake();
    }
}
