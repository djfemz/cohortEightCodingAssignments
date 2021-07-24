import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MusicPlayerTest {

    @Test
    public void turnMusicPlayerOnTest(){
        MusicPlayer myMp3=new MusicPlayer();
        assertFalse(myMp3.isOn());
        myMp3.startUp();
       assertTrue(myMp3.isOn());
    }

    @Test
    public void turnMusicPlayerOffTest() {
        MusicPlayer myMp3= new MusicPlayer();
        assertFalse(myMp3.isOn());
        myMp3.startUp();
       assertTrue(myMp3.isOn());
        myMp3.startUp();
        assertFalse(myMp3.isOn());
    }

    @Test
    public void playButtonTest() {
        MusicPlayer myMp3= new MusicPlayer();
        myMp3.startUp();
        assertFalse(myMp3.isPlaying());
        myMp3.play();
        assertTrue(myMp3.isPlaying());
    }

    @Test
   public void nextButtonTest() {
        MusicPlayer myMp3 = new MusicPlayer();
        myMp3.startUp();
        myMp3.play();
        myMp3.next();
        assertEquals(2, myMp3.getTrack());
        myMp3.next();
        myMp3.pause();
        assertEquals(3, myMp3.getTrack());
        assertFalse(myMp3.isPlaying());
    }

    @Test
    public void previousButtonTest() {
        MusicPlayer myMp3 = new MusicPlayer();
        myMp3.startUp();
        myMp3.play();
        myMp3.next();
        myMp3.next();
        myMp3.previous();
        myMp3.previous();
        myMp3.previous();
        assertEquals(1, myMp3.getTrack());
    }

    @Test
    public void stopButtonTest() {
        MusicPlayer myMp3=new MusicPlayer();
        myMp3.startUp();
        myMp3.play();
        myMp3.stop();
        assertEquals(0, myMp3.getTrack());
        assertFalse(myMp3.isPlaying());
    }

    @Test
    public void pauseButtonTest() {
        MusicPlayer myMp3 = new MusicPlayer();
        myMp3.startUp();
        myMp3.play();
        myMp3.next();
        myMp3.pause();
        assertEquals(2, myMp3.getTrack());
        assertFalse(myMp3.isPlaying());

    }
}