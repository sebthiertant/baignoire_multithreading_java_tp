package fr.tp;

import fr.tp.components.Baignoire;
import fr.tp.components.Robinet;

public class Main {
    public static void main(String[] args) {

        Baignoire baignoire = new Baignoire(1000);

        //Thread threadBagnoire = new Thread(baignoire);
        //threadBagnoire.start();

        Robinet robinet = new Robinet(baignoire, 50);
        //robinet.setOpen(true);
        //robinet.debite();

       // Thread threadRobinet = new Thread(robinet);
        //threadRobinet.start();
    }
}