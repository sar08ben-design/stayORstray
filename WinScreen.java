import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class WinScreen extends World
{
    private GreenfootSound gfs_WinScreen;

    /**
     * Constructor for objects of class WinWorld.
     */
    public WinScreen()
    {
        super(1000, 700, 1);
        gfs_WinScreen =  new GreenfootSound("The Bells that Ring the Next Level.wav");
        prepare();
    }

    /**
     * 
     */
    public void started()
    {
        gfs_WinScreen.play();
    }

    /**
     * 
     */
    public void stopped()
    {
        gfs_WinScreen.stop();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
}
