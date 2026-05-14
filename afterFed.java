import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class afterFed here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class afterFed extends Interactive

{
    /**
     * Act - do whatever the afterFed wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int myMin = 16;
    private int myMax = 41;
    public afterFed(int width, int height){
        super(width, height);
    

    }
        public void act()
    {
        if (Atlas.dogFed)
        {
            dialogueTrigger.arrayMin = myMin;
            dialogueTrigger.arrayMax = myMax;
            interact();
        }
        
    
    }


}