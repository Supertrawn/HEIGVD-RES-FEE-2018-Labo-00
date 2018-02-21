package ch.heigvd.res.lab00;

/**
 * Created by Kevin on 19.02.2018.
 */
public class Harmonica implements IInstrument{

    String sound;
    String color;
    int soundVolume;

    public Harmonica (){
        sound = "dap dap";
        color = "";
        soundVolume = 22;
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
