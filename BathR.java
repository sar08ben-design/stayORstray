import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BathR here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BathR extends World
{

    /**
     * Constructor for objects of class BathR.
     * 
     */
    public BathR()
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

        toBedroom1 toBedroom1 = new toBedroom1(10, 100);
        addObject(toBedroom1,6,429);

        Atlas atlas = new Atlas();
        if (Atlas.dogFed){addObject(atlas,73,428);}

        Protagonist protagonist = new Protagonist();
        addObject(protagonist,66,421);
        Walls walls = new Walls(700, 30);
        addObject(walls,410,135);
        walls.setLocation(359,51);
        Walls walls2 = new Walls(30, 500);
        addObject(walls2,608,259);
        Walls walls3 = new Walls(30, 400);
        addObject(walls3,87,170);
        Walls walls4 = new Walls(700, 20);
        addObject(walls4,351,485);
        Walls walls5 = new Walls(100, 15);
        addObject(walls5,50,287);

        walls3.setLocation(80,138);
        walls3.setLocation(86,83);
        walls.setLocation(358,154);
        walls.setLocation(355,153);
        Walls walls6 = new Walls(50, 20);
        addObject(walls6,134,189);
        walls6.setLocation(124,191);
        Walls walls7 = new Walls(100, 15);
        addObject(walls7,330,184);
        Money money = new Money(100, 15);
        addObject(money,336,194);
        money.setLocation(328,192);
        money.setLocation(334,192);
        walls7.setLocation(329,188);
        walls6.setLocation(123,190);
        stoveDialogue stoveDialogue = new stoveDialogue(50, 30);
        addObject(stoveDialogue,123,190);
        Dialogue dialogue = new Dialogue();
        addObject(dialogue,320,442);
    }
}
