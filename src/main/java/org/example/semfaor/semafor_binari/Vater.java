package org.example.semfaor.semafor_binari;

public class Vater {
    private SemaforBinari semafor;

    public Vater(SemaforBinari semafor) {
        this.semafor = semafor;
    }

    public void entrar() throws InterruptedException {
        semafor.metodoWait();
    }

    public void cagar() throws InterruptedException {
        System.out.println("["+Thread.currentThread().getName()+"] Estic cagant ...");
        Thread.sleep(2000);
    }

    public void eixir() {
        semafor.metodoWake();
    }
}
