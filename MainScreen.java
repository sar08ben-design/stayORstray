import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class MainScreen extends World
{
    private GreenfootSound gfs_MainScreen;

    /**
     * Constructor for objects of class MyWorld.
     */
    public MainScreen()
    {
        super(450, 450, 1);
        gfs_MainScreen =  new GreenfootSound("Innocent Halloween.wav");
        prepare();
    }

    /**
     * 
     */
    public void started()
    {
        gfs_MainScreen.play();
    }

    /**
     * 
     */
    public void stopped()
    {
        gfs_MainScreen.stop();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Play_Button play_Button = new Play_Button();
        addObject(play_Button,500,500);
        Protagonist protagonist = new Protagonist();
        addObject(protagonist,298,392);
        play_Button.setLocation(238,195);
        play_Button.setLocation(306,238);
        play_Button.setLocation(296,205);
        protagonist.setLocation(300,319);
        removeObject(protagonist);
        play_Button.setLocation(264,310);
        play_Button.setLocation(55,131);
        play_Button.setLocation(228,60);
        play_Button.setLocation(243,74);
        play_Button.setLocation(220,60);
    }

}
