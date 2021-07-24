import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TelevisionTest {

    @Test
    public void televisionIsTurnedOnTest(){
        //given
        Television mytv= new Television();
        //when
        mytv.turnTelevisionOn();
        //assert
        assertEquals(true, mytv.isOn());
    }

    @Test
    public void televisionIsTurnedOffTest(){
        //given
        Television mytv=new Television();
        mytv.turnTelevisionOn();
        //when
        mytv.turnTelevisionOff();
        //assert
        assertEquals(false,mytv.isOn());
    }

    @Test
    public void channelChangedIncrementallyTest(){
        //given
        Television mytv = new Television();
        mytv.turnTelevisionOn();
        //when
        mytv.changeChannelUpwards();
        //assert
        assertEquals(2, mytv.getTelevisionChannel());
    }

    @Test
    public void  channelChangedDecrementally(){
        //given
        Television mytv = new Television();
        mytv.turnTelevisionOn();
        //when
        mytv.changeChannelDownwards();
        //assert
        assertEquals(1,mytv.getTelevisionChannel());
    }

    @Test
    public void setTelevisionChannelTest(){
        //given
        Television myTv = new Television();
        myTv.turnTelevisionOn();
        //when
        myTv.setTelevisionChannel(10);
        //assert
        assertEquals(10, myTv.getTelevisionChannel());
    }

    @Test
    public void volumeIncreaseTest(){
        //given
        Television myTv = new Television();
        myTv.turnTelevisionOn();
        //when
        myTv.increaseTelevisionVolume();
        //assert
        assertEquals(1, myTv.getTelevisionVolume());
    }

    @Test
    public void volumeDecreaseTest(){
        //given
        Television myTv =new Television();
        myTv.turnTelevisionOn();
        //when
        myTv.decreaseTelevisionVolume();
        //assert
        assertEquals(-1, myTv.getTelevisionVolume());
    }

    @Test
    public void channelCantGoBelowOneTest(){
        //given
        Television myTv = new Television();
        myTv.turnTelevisionOn();
        myTv.setTelevisionChannel(1);
        //when
        myTv.changeChannelDownwards();
        //assert
        assertEquals(1, myTv.getTelevisionChannel());
    }

    @Test
    public void volumeCantGoAboveHundred(){

        Television myTv = new Television();
        myTv.turnTelevisionOn();


        myTv.increaseTelevisionVolume();
        myTv.increaseTelevisionVolume();
        myTv.increaseTelevisionVolume();
        myTv.increaseTelevisionVolume();
        myTv.increaseTelevisionVolume();
        myTv.increaseTelevisionVolume();
        myTv.increaseTelevisionVolume();
        myTv.increaseTelevisionVolume();
        myTv.increaseTelevisionVolume();
        myTv.increaseTelevisionVolume();
        myTv.increaseTelevisionVolume();
        myTv.increaseTelevisionVolume();
        myTv.increaseTelevisionVolume();
        myTv.increaseTelevisionVolume();
        myTv.increaseTelevisionVolume();
        myTv.increaseTelevisionVolume();
        myTv.increaseTelevisionVolume();
        myTv.increaseTelevisionVolume();
        myTv.increaseTelevisionVolume();
        myTv.increaseTelevisionVolume();
        myTv.increaseTelevisionVolume();
        myTv.increaseTelevisionVolume();
        myTv.increaseTelevisionVolume();
        myTv.increaseTelevisionVolume();
        myTv.increaseTelevisionVolume();
        myTv.increaseTelevisionVolume();
        myTv.increaseTelevisionVolume();
        myTv.increaseTelevisionVolume();
        myTv.increaseTelevisionVolume();
        myTv.increaseTelevisionVolume();
        myTv.increaseTelevisionVolume();
        myTv.increaseTelevisionVolume();
        myTv.increaseTelevisionVolume();
        myTv.increaseTelevisionVolume();
        myTv.increaseTelevisionVolume();
        myTv.increaseTelevisionVolume();
        myTv.increaseTelevisionVolume();
        myTv.increaseTelevisionVolume();
        myTv.increaseTelevisionVolume();
        myTv.increaseTelevisionVolume();

        myTv.increaseTelevisionVolume();
        myTv.increaseTelevisionVolume();
        myTv.increaseTelevisionVolume();
        myTv.increaseTelevisionVolume();
        myTv.increaseTelevisionVolume();
        myTv.increaseTelevisionVolume();
        myTv.increaseTelevisionVolume();
        myTv.increaseTelevisionVolume();
        myTv.increaseTelevisionVolume();
        myTv.increaseTelevisionVolume();
        myTv.increaseTelevisionVolume();
        myTv.increaseTelevisionVolume();
        myTv.increaseTelevisionVolume();
        myTv.increaseTelevisionVolume();
        myTv.increaseTelevisionVolume();
        myTv.increaseTelevisionVolume();
        myTv.increaseTelevisionVolume();
        myTv.increaseTelevisionVolume();
        myTv.increaseTelevisionVolume();
        myTv.increaseTelevisionVolume();

        myTv.increaseTelevisionVolume();
        myTv.increaseTelevisionVolume();
        myTv.increaseTelevisionVolume();
        myTv.increaseTelevisionVolume();
        myTv.increaseTelevisionVolume();
        myTv.increaseTelevisionVolume();
        myTv.increaseTelevisionVolume();
        myTv.increaseTelevisionVolume();
        myTv.increaseTelevisionVolume();
        myTv.increaseTelevisionVolume();
        myTv.increaseTelevisionVolume();
        myTv.increaseTelevisionVolume();
        myTv.increaseTelevisionVolume();
        myTv.increaseTelevisionVolume();
        myTv.increaseTelevisionVolume();
        myTv.increaseTelevisionVolume();
        myTv.increaseTelevisionVolume();
        myTv.increaseTelevisionVolume();
        myTv.increaseTelevisionVolume();
        myTv.increaseTelevisionVolume();
        myTv.increaseTelevisionVolume();
        myTv.increaseTelevisionVolume();
        myTv.increaseTelevisionVolume();
        myTv.increaseTelevisionVolume();
        myTv.increaseTelevisionVolume();
        myTv.increaseTelevisionVolume();
        myTv.increaseTelevisionVolume();
        myTv.increaseTelevisionVolume();
        myTv.increaseTelevisionVolume();
        myTv.increaseTelevisionVolume();
        myTv.increaseTelevisionVolume();
        myTv.increaseTelevisionVolume();
        myTv.increaseTelevisionVolume();
        myTv.increaseTelevisionVolume();
        myTv.increaseTelevisionVolume();
        myTv.increaseTelevisionVolume();
        myTv.increaseTelevisionVolume();
        myTv.increaseTelevisionVolume();
        myTv.increaseTelevisionVolume();
        myTv.increaseTelevisionVolume();

        assertEquals(100, myTv.getTelevisionVolume());
        myTv.increaseTelevisionVolume();
        assertEquals(100, myTv.getTelevisionVolume());

    }

    @Test
    public void channelCantBeSetBelowOneOrAbove99(){
        Television myTv = new Television();
        myTv.turnTelevisionOn();
        myTv.setTelevisionChannel(1);
        myTv.changeChannelDownwards();
        assertEquals(1, myTv.getTelevisionChannel());

        myTv.setTelevisionChannel(99);
        myTv.changeChannelUpwards();
        assertEquals(99, myTv.getTelevisionChannel());
    }
}