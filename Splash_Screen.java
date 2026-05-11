import greenfoot.*; 

/**
 * Write a description of class Splash_Screen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Splash_Screen extends World
{
    double splashTime = System.currentTimeMillis();

    public Splash_Screen()
    {    
        super(700, 500, 1);

        prepare();
    }

    public void act()
    {
        if (System.currentTimeMillis() >= (splashTime + 4000))
        {
            goToMainMenu();
        }
    }

    public void goToMainMenu()
    {
        World MainScreen= new MainScreen();
        MainScreen.started();
        Greenfoot.setWorld(MainScreen);
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        SplashScreen_info splashScreen_info = new SplashScreen_info();
        addObject(splashScreen_info,350,350);
        SplachLogo splachLogo = new SplachLogo();
        addObject(splachLogo,350,150);


    }
}