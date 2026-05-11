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
        Walls walls = new Walls(40, 500);
        addObject(walls,657,267);
        walls.setLocation(684,317);
        walls.setLocation(614,247);
        walls.setLocation(628,251);
        walls.setLocation(615,249);
        walls.setLocation(624,249);
        walls.setLocation(613,254);
        walls.setLocation(618,254);
        walls.setLocation(630,259);
        walls.setLocation(632,259);
        walls.setLocation(620,255);
        Walls walls2 = new Walls(600, 20);
        addObject(walls2,317,493);
        walls2.setLocation(299,495);
        walls2.setLocation(303,496);
        Walls walls3 = new Walls(50, 300);
        addObject(walls3,43,198);
        walls3.setLocation(58,137);
        walls3.changeWidth(100);
        walls3.setLocation(66,175);
        walls3.setLocation(46,151);
        Walls walls4 = new Walls(600, 50);
        addObject(walls4,322,94);
        walls4.setLocation(323,88);
        Protagonist protagonist = new Protagonist();
        addObject(protagonist,86,409);
        walls2.setLocation(100,485);
        walls2.setLocation(298,496);
        walls4.setLocation(296,143);
        walls4.setLocation(338,140);
        Walls walls5 = new Walls(30, 10);
        addObject(walls5,132,194);
        Walls walls6 = new Walls(30, 10);
        addObject(walls6,203,176);
        walls6.setLocation(190,184);
        Walls walls7 = new Walls(40, 10);
        addObject(walls7,332,188);
        walls7.getWidth();
        walls7.changeWidth(70);
        Walls walls8 = new Walls(100, 20);
        addObject(walls8,506,180);
        walls8.setLocation(511,184);
        walls8.changeWidth(200);
        walls8.setLocation(565,175);
        walls8.setLocation(538,184);
        walls8.setLocation(534,184);
        walls5.setLocation(133,188);
        walls2.setLocation(243,488);
        walls2.setLocation(246,481);
        walls2.setLocation(295,490);
        walls5.changeColor(greenfoot.Color.BLUE);
        walls7.changeColor(greenfoot.Color.BLUE);
        toBedroom1 toBedroom1 = new toBedroom1(10, 100);
        addObject(toBedroom1,14,429);
        toBedroom1.setLocation(6,429);
        Money money = new Money();
        addObject(money,366,351);
    }
}
