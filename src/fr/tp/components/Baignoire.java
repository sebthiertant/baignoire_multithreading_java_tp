package fr.tp.components;

public class Baignoire implements Runnable {
    final int MAX_VOLUME;
    private int currentVolume;

    public Baignoire(int MAX_VOLUME) {
        this.MAX_VOLUME = MAX_VOLUME;
        this.currentVolume = 0;
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

    @Override
    public void run() {
        System.out.println("Yo baignoire");
    }
}
