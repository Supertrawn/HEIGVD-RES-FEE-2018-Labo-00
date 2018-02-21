package ch.heigvd.res.lab00;

/**
 * Created by Kevin on 19.02.2018.
 */
public class Trumpet implements IInstrument {

    String sound;
    String color;
    int soundVolume;

    public Trumpet() {
        sound = "pouet";
        color = "golden";
        soundVolume = 50;
    }

    @Override
    public String play() {
        return sound;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public int getSoundVolume() {
        return soundVolume;
    }
}
