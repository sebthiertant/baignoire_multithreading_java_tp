package fr.tp.components;

public class Baignoire implements Runnable {
    final int MAX_VOLUME;
    public int currentVolume;
    private int volumeDeFuite;

    public Baignoire(int MAX_VOLUME, int volumeDeFuite) {
        this.MAX_VOLUME = MAX_VOLUME;
        this.currentVolume = 0;
        this.volumeDeFuite = volumeDeFuite;
    }

    public int getMAX_VOLUME() {
        return MAX_VOLUME;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public synchronized void fuite() {
        setCurrentVolume(this.getCurrentVolume() - this.volumeDeFuite);
        System.out.println("La baignoire fuit, il reste " + this.currentVolume +"L dedans !");
    }

    @Override
    public void run() {
        while(this.currentVolume > 0) {
           fuite();
        }
        if (this.currentVolume == 0) {
            System.out.println("La baignoire a trop fuit ! Elle est désormais vide.");
        }
    }
}
