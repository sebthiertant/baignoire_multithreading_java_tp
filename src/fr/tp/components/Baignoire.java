package fr.tp.components;

public class Baignoire implements Runnable {
    final int MAX_VOLUME;
    private int currentVolume;
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

    public void fuite() {
        if (this.currentVolume > 0) {
            this.currentVolume = this.getCurrentVolume() - this.volumeDeFuite;
            System.out.println(this.currentVolume);
        }
    }

    @Override
    public void run() {
        System.out.println("Yo baignoire");
    }
}
