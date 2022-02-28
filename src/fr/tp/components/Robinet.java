package fr.tp.components;

public class Robinet implements Runnable{

    private Baignoire baignoire;
    private int volumeDebite;
    private boolean isOpen;

    public Robinet(Baignoire baignoire, int volumeDebite){
        this.baignoire = baignoire;
        this.volumeDebite = volumeDebite;
    }

    public int getVolumeDebite() {
        return volumeDebite;
    }

    public void debite() {
        this.baignoire.setCurrentVolume(this.baignoire.getCurrentVolume() + this.volumeDebite);
        System.out.println("La baignoire contient " + this.baignoire.getCurrentVolume() + "L sur un maximum de " + this.baignoire.getMAX_VOLUME() + "L.");
    }

    @Override
    public void run() {
        System.out.println("Thread du robinet");
        while ((this.baignoire.getCurrentVolume() < this.baignoire.getMAX_VOLUME() - this.volumeDebite) || (this.baignoire.getCurrentVolume() == 0)) {
            debite();
        }
    }
}
