package fr.tp.components;

public class Robinet implements Runnable{

    private Baignoire baignoire;
    private int volumeDebite;
    private boolean isOpen;

    public Robinet(Baignoire baignoire, int volumeDebite){
        this.baignoire = baignoire;
        this.volumeDebite = volumeDebite;
        this.isOpen = false;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public void debite() {
        if (this.isOpen) {
            while (this.baignoire.getCurrentVolume() < this.baignoire.getMAX_VOLUME() - this.volumeDebite) {
                this.baignoire.setCurrentVolume(this.baignoire.getCurrentVolume() + this.volumeDebite);
                //System.out.println("La baignoire contient " + this.baignoire.getCurrentVolume() + "L sur un maximum de " + this.baignoire.getMAX_VOLUME() + "L.");
            }
        }
        else {
            System.out.println("Le robinet n'est pas ouvert");
        }
    }

    @Override
    public void run() {
        System.out.println("yo");
    }
}
