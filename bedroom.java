import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rooms here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bedroom extends World
{

    /**
     * Constructor for objects of class Rooms.
     * 
     */
    public Bedroom()
    {    
        //  a new world with 600x400 cells with a cell size of 1x1 pixels.
    super(700, 500, 1);         ;
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Protagonist protagonist = new Protagonist();
        if (Transition.protaPosition==0){
            addObject(protagonist,386,445);
        }
        else if (Transition.protaPosition>0){
            addObject(protagonist,622,418);

        }

        toLivingR2 toLivingR2 = new toLivingR2(75, 15);
        addObject(toLivingR2,390,481);
        toLivingR2.setLocation(399,493);
        toLivingR2.setLocation(391,493);
        toLivingR2.setLocation(385,495);
        toLivingR2.setLocation(391,495);
        toBathroom toBathroom = new toBathroom(15, 200);
        addObject(toBathroom,680,403);
        toBathroom.setLocation(693,425);
        toBathroom.setLocation(692,409);
    }
}
