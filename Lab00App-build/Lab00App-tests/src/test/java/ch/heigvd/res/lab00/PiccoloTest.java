package ch.heigvd.res.lab00;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Created by Kevin on 27.02.2018.
 */
public class PiccoloTest {
    @Test
    public void thereShouldBeAPiccoloClass() {
        IInstrument piccolo = new Piccolo();
        assertNotNull(piccolo);
    }

    @Test
    public void itShouldBePossibleToPlayAClavier() {
        IInstrument piccolo = new Piccolo();
        String sound = piccolo.play();
        assertNotNull(sound);
    }

    @Test
    public void aClavierShouldMakeDayyyn() {
        IInstrument piccolo = new Piccolo();
        String sound = piccolo.play();
        Assert.assertEquals("flute", sound);
    }

    @Test
    public void aClavierShouldNotBeMute() {
        IInstrument piccolo = new Piccolo();
        int piccoloVolume = piccolo.getSoundVolume();
        Assert.assertTrue(piccoloVolume > 0);
    }

    @Test
    public void aClavierShouldBeIvory() {
        IInstrument piccolo = new Piccolo();
        String color = piccolo.getColor();
        Assert.assertEquals("black", color);
    }
}
