import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SplashScreen_info here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SplashScreen_info extends Actor
{
    /**
     * Act - do whatever the SplashScreen_info wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public  SplashScreen_info()
    {
        
        GreenfootImage img = new GreenfootImage(700, 900);
        img.setColor(new Color(0, 0, 0, 255));
        img.fillRect(0, 0, 700, 900);
        
        img.setColor(Color.LIGHT_GRAY);
        img.setFont(new Font("Arial", true, false, 50));
        img.drawString("Game Programing 1", 120, 450);
        
        img.setColor(Color.LIGHT_GRAY);
        img.setFont(new Font("Arial", false, true, 30));
        img.drawString("Sarra Benhamrouche", 200, 520);
        
        
        setImage(img);
        
    }
}
