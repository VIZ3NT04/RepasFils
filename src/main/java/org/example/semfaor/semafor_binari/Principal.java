package org.example.semfaor.semafor_binari;

public class Principal {
    public static void main(String[] args) throws InterruptedException {
        SemaforBinari semaforBinari = new SemaforBinari();
        Vater vater = new Vater(semaforBinari);

        Persona n1 = new Persona(vater);
        Persona n2 = new Persona(vater);
        Persona n3 = new Persona(vater);

        Thread f1 = new Thread(n1, "Jonathan");
        Thread f2 = new Thread(n2, "Pau");
        Thread f3 = new Thread(n3, "Vicentet");

        f1.start();
        Thread.sleep(1000);
        f2.start();
        Thread.sleep(1000);
        f3.start();


    }
}
