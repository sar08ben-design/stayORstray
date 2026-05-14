import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LivingRoom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LivingRoom extends World
{

    /**
     * Constructor for objects of class LivingRoom.
     * 
     */
    public LivingRoom()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 500, 1);
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        

        Walls walls = new Walls(150, 400);
        addObject(walls, 650, 96);

        Walls walls2 = new Walls(150, 400);
        addObject(walls2, 48, 91);

        Walls walls3 = new Walls(400, 50);
        addObject(walls3, 399, 11);

        Walls walls4 = new Walls(5, 200);
        addObject(walls4, 201, 144);

        Walls walls5 = new Walls(40, 45);
        addObject(walls5, 292, 227);

        Walls walls6 = new Walls(40, 1);
        addObject(walls6, 394, 140);

        Walls walls7 = new Walls(10, 4);
        addObject(walls7, 362, 331);

        Walls walls8 = new Walls(50, 2);
        addObject(walls8, 394, 337);

        Walls walls9 = new Walls(50, 1);
        addObject(walls9, 402, 249);

        Walls walls10 = new Walls(40, 40);
        addObject(walls10, 552, 214);

        Walls walls11 = new Walls(30, 30);
        addObject(walls11, 566, 185);


       
        Atlas atlas = new Atlas();
        addObject(atlas,318,154);
       
        toKitchen toKitchen = new toKitchen(20, 100);
        addObject(toKitchen,672,395);
        toKitchen.setLocation(688,437);
        toKitchen.changeHeight(150);
        
        toKitchen.changeColor(greenfoot.Color.WHITE);
       
        toKitchen.setLocation(690,457);
        toKitchen.setLocation(688,449);
        toKitchen.setLocation(690,449);
        toOutside toOutside = new toOutside(20, 150);
        addObject(toOutside,7,448);

        Protagonist protagonist = new Protagonist();

        if (toLivingR.protaPosition==0)
        {
            addObject(protagonist,86,443);
            if (Atlas.dogFed)  {addObject(atlas,60,440);}
        }

        else if (toLivingR.protaPosition==1){
            addObject(protagonist,599,439);
            if (Atlas.dogFed)  {addObject(atlas,625,435);}
        }
        else if (toLivingR.protaPosition==2){
            addObject(protagonist,156,73);
            if (Atlas.dogFed)  {addObject(atlas,156,60);}
        }
        toBedroom toBedroom = new toBedroom(100, 15);
        addObject(toBedroom,152,19);
        toBedroom.setLocation(172,6);
        toBedroom.setLocation(159,9);

        walls5.changeTransparancy(0);
        walls2.changeTransparancy(0);
        walls.changeTransparancy(0);
       
        walls10.changeTransparancy(0);
        walls11.changeTransparancy(0);
        walls3.changeTransparancy(0);
        walls4.changeTransparancy(0);
        toBedroom.changeTransparancy(0);
        toOutside.changeTransparancy(0);
        toKitchen.changeTransparancy(0);
        atlas.setLocation(239,341);
        firstInteractionDog firstInteractionDog = new firstInteractionDog(10, 10);
        addObject(firstInteractionDog,238,333);
        if (Atlas.dogFed){
            removeObject(firstInteractionDog);    
        }

        atlas.setLocation(238,322);
        atlas.setLocation(238,317);
        Dialogue dialogue = new Dialogue();
        addObject(dialogue,350,442);
        atlas.setLocation(235,286);
      
        atlas.setLocation(238,347);
        Walls walls12 = new Walls(700, 15);
        addObject(walls12,318,490);
        walls12.setLocation(363,499);
       
        walls12.changeTransparancy(0);
    
        walls8.changeTransparancy(0);
        walls7.changeTransparancy(0);
        walls9.changeTransparancy(0);
        walls6.changeTransparancy(0);
    }
}
