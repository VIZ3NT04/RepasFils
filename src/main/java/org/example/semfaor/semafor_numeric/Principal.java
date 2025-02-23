package org.example.semfaor.semafor_numeric;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        int puntsDeCarrega = 3; //Es pot canviar el número de punts de carrega

        SemaforComptador semafor = new SemaforComptador(puntsDeCarrega);
        EstacioCarrega estacioCarrega = new EstacioCarrega(semafor);

        Cotxe cotxe1 = new Cotxe(estacioCarrega);
        Cotxe cotxe2 = new Cotxe(estacioCarrega);
        Cotxe cotxe3 = new Cotxe(estacioCarrega);
        Cotxe cotxe4 = new Cotxe(estacioCarrega);
        Cotxe cotxe5 = new Cotxe(estacioCarrega);
        Cotxe cotxe6 = new Cotxe(estacioCarrega);
        Cotxe cotxe7 = new Cotxe(estacioCarrega);
        Cotxe cotxe8 = new Cotxe(estacioCarrega);
        Cotxe cotxe9 = new Cotxe(estacioCarrega);
        Cotxe cotxe10 = new Cotxe(estacioCarrega);

        Thread fil1 = new Thread(cotxe1, "Coche 1");
        Thread fil2 = new Thread(cotxe2, "Coche 2");
        Thread fil3 = new Thread(cotxe3, "Coche 3");
        Thread fil4 = new Thread(cotxe4, "Coche 4");
        Thread fil5 = new Thread(cotxe5, "Coche 5");
        Thread fil6 = new Thread(cotxe6, "Coche 6");
        Thread fil7 = new Thread(cotxe7, "Coche 7");
        Thread fil8 = new Thread(cotxe8, "Coche 8");
        Thread fil9 = new Thread(cotxe9, "Coche 9");
        Thread fil10 = new Thread(cotxe10, "Coche 10");

        ArrayList<Thread> fils = new ArrayList<>();
        fils.add(fil1);
        fils.add(fil2);
        fils.add(fil3);
        fils.add(fil4);
        fils.add(fil5);
        fils.add(fil6);
        fils.add(fil7);
        fils.add(fil8);
        fils.add(fil9);
        fils.add(fil10);

        try {
            for (Thread fil : fils) {
                fil.start();
                Thread.sleep((int) (Math.random() * 2000));
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}