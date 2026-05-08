import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Kitchen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kitchen extends World
{

    /**
     * Constructor for objects of class Kitchen.
     * 
     */
    public Kitchen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(222, 320, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        kitchenDoor kitchenDoor = new kitchenDoor();
        addObject(kitchenDoor,20,101);
        Walls walls = new Walls(300, 150);
        addObject(walls,141,59);
        walls.setLocation(191,80);
        Walls walls2 = new Walls(80, 40);
        addObject(walls2,20,109);
        kitchenDoor.setLocation(22,115);
        Walls walls3 = new Walls(100, 50);
        addObject(walls3,109,229);
        walls3.setLocation(116,231);
        walls3.setLocation(104,226);
        walls3.setLocation(119,245);
        walls3.setLocation(107,222);
        walls3.setLocation(111,230);
        Walls walls4 = new Walls(50, 100);
        addObject(walls4,97,230);
        walls3.setLocation(115,286);
        walls4.changeWidth(70);
        walls4.changeHeight(80);
        walls3.setLocation(109,227);
        walls4.setLocation(120,260);
        walls4.setLocation(110,231);
        kitchenDoor.setLocation(19,138);
        Protagonist protagonist = new Protagonist();
        addObject(protagonist,19,138);
        walls2.setLocation(23,88);
        walls2.setLocation(26,94);
        walls.setLocation(143,68);
        walls.setLocation(161,86);
        walls.setLocation(162,87);
        walls.setLocation(213,78);
        walls.setLocation(198,77);
        walls.setLocation(201,74);
        walls.setLocation(196,80);
        walls.setLocation(197,71);
        walls.setLocation(194,74);
        Dog_Food dog_Food = new Dog_Food();
        addObject(dog_Food,41,292);
        dog_Food.setLocation(179,291);
    }
}
