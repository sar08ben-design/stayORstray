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
        super(315, 250, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        LivingroomDoor livingroomDoor = new LivingroomDoor();
        addObject(livingroomDoor,19,216);
        livingroomDoor.setLocation(25,222);
        livingroomDoor.setLocation(11,235);
        livingroomDoor.setLocation(16,229);
        Protagonist protagonist = new Protagonist();
        addObject(protagonist,57,218);
        Walls walls = new Walls(50, 100);
        addObject(walls,176,142);
        walls.setLocation(183,151);
        walls.changeHeight(300);
        walls.setLocation(299,143);
        walls.setLocation(319,122);
        walls.setLocation(292,124);
        walls.setLocation(300,126);
        Walls walls2 = new Walls(300, 40);
        addObject(walls2,170,31);
        walls2.setLocation(332,19);
        walls2.setLocation(229,48);
        walls2.changeHeight(80);
        walls2.setLocation(212,16);
        walls2.setLocation(217,22);
        walls2.setLocation(224,33);
        walls2.setLocation(224,28);
        Walls walls3 = new Walls(90, 100);
        addObject(walls3,174,145);
        walls3.setLocation(196,147);
        walls3.changeHeight(90);
        walls3.setLocation(192,174);
        walls3.changeWidth(80);
        walls3.setLocation(176,149);
        walls3.setLocation(184,152);
        walls3.changeWidth(75);
        walls3.setLocation(193,165);
        walls3.setLocation(182,137);
        walls3.setLocation(178,144);
        walls3.setLocation(180,152);
        Walls walls4 = new Walls(15, 40);
        addObject(walls4,266,139);
        walls4.setLocation(119,156);
        walls4.changeHeight(60);
        walls4.setLocation(112,142);
        walls4.changeHeight(70);
        walls4.setLocation(116,142);
        walls4.setLocation(107,145);
        walls4.setLocation(109,151);
        walls4.setLocation(115,145);
        Walls walls5 = new Walls(20, 20);
        addObject(walls5,131,163);
        walls5.setLocation(131,173);
        walls5.setLocation(135,168);
        walls5.setLocation(128,170);
        walls5.setLocation(137,170);
        walls5.setLocation(130,170);
        Walls walls6 = new Walls(20, 20);
        addObject(walls6,129,118);
        walls6.setLocation(132,118);
        Walls walls7 = new Walls(35, 20);
        addObject(walls7,183,201);
        walls7.setLocation(176,205);
        walls7.changeWidth(45);
        walls7.setLocation(192,204);
        walls7.setLocation(178,206);
        Walls walls8 = new Walls(40, 40);
        addObject(walls8,182,96);
        walls8.setLocation(182,96);
        Walls walls9 = new Walls(20, 50);
        addObject(walls9,266,146);
        walls9.setLocation(264,138);
        Walls walls10 = new Walls(50, 250);
        addObject(walls10,13,128);
        walls10.setLocation(17,146);
        walls10.changeHeight(150);
        walls10.setLocation(17,112);
        walls10.changeHeight(200);
        walls10.setLocation(14,107);
        walls10.setLocation(7,97);
        walls10.setLocation(7,96);
        Atlas atlas = new Atlas();
        addObject(atlas,249,190);
        toFinalDoor toFinalDoor = new toFinalDoor();
        addObject(toFinalDoor,48,26);
        toFinalDoor.setLocation(46,40);
        toFinalDoor.setLocation(57,47);
        toFinalDoor.setLocation(49,44);
    }
}
