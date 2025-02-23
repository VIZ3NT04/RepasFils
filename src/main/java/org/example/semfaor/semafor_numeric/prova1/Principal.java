package org.example.semfaor.semafor_numeric.prova1;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        SemaforCompatador semaforCompatador = new SemaforCompatador(3);
        Puerto puerto = new Puerto(semaforCompatador);

        Barco b1 = new Barco(puerto);
        Barco b2 = new Barco(puerto);
        Barco b3 = new Barco(puerto);
        Barco b4 = new Barco(puerto);
        Barco b5 = new Barco(puerto);
        Barco b6 = new Barco(puerto);
        Barco b7 = new Barco(puerto);
        Barco b8 = new Barco(puerto);
        Barco b9 = new Barco(puerto);
        Barco b10 = new Barco(puerto);

        Thread fil1 = new Thread(b1,"BARCO 1");
        Thread fil2 = new Thread(b2,"BARCO 2");
        Thread fil3 = new Thread(b3,"BARCO 3");
        Thread fil4 = new Thread(b4,"BARCO 4");
        Thread fil5 = new Thread(b5,"BARCO 5");
        Thread fil6 = new Thread(b6,"BARCO 6");
        Thread fil7 = new Thread(b7,"BARCO 7");
        Thread fil8 = new Thread(b8,"BARCO 8");
        Thread fil9 = new Thread(b9,"BARCO 9");
        Thread fil10 = new Thread(b10,"BARCO 10");

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
