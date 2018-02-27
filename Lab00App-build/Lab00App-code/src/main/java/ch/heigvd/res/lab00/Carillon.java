package ch.heigvd.res.lab00;

/**
 * Created by Kevin on 27.02.2018.
 */
public class Carillon implements IInstrument {

    String sound;
    String color;
    int soundVolume;


    public Carillon() {
        sound = "Ding-Dong";
        color = "copper";
        soundVolume = 200;
    }

    public String play(){
        return sound;
    }

    public String getColor(){
        return color;
    }

    public int getSoundVolume(){
        return soundVolume;
    }
}
