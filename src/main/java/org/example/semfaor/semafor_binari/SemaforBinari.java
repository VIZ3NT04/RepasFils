package org.example.semfaor.semafor_binari;

public class SemaforBinari {
    private boolean ocupat;

    public SemaforBinari() {
         ocupat = false;
    }


    public synchronized void metodoWait() throws InterruptedException {
        System.out.println("["+Thread.currentThread().getName()+"] Vuic entrar al vater");
        while (ocupat) {
            System.out.println("["+Thread.currentThread().getName()+"] Me estic cagant i esta ocupat , merda!");
            wait();
        }
        System.out.println("["+Thread.currentThread().getName()+"] Perfi he entrat al vater");
        ocupat = true;
    }

    public synchronized void metodoWake() {
        System.out.println("["+Thread.currentThread().getName()+"] Vaya trincho he soltat");
        ocupat = false;
        notify();
    }
}
