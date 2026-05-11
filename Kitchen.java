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
        super(700, 500, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Walls walls = new Walls(200, 400);
        addObject(walls,584,206);
        walls.setLocation(637,178);
        walls.setLocation(624,139);
        walls.setLocation(628,135);
        Walls walls2 = new Walls(15, 500);
        addObject(walls2,160,321);
        walls2.setLocation(160,261);
        walls2.setLocation(162,251);
        walls2.setLocation(168,261);
        walls2.changeWidth(200);
        walls2.setLocation(48,114);
        walls2.setLocation(92,235);
        walls2.setLocation(71,62);
        Walls walls3 = new Walls(50, 50);
        addObject(walls3,644,366);
        walls3.setLocation(684,348);
        walls3.setLocation(671,367);
        walls3.setLocation(676,357);

        Walls walls4 = new Walls(700, 5);
        addObject(walls4,332,487);
        walls4.setLocation(368,492);
        walls4.setLocation(338,495);
        walls4.setLocation(271,497);
        walls4.setLocation(271,497);
        walls4.setLocation(359,493);
        walls4.setLocation(328,431);
        walls4.changeHeight(20);
        walls4.setLocation(700, 500);
        walls4.setLocation(0, 500);
        walls4.setLocation(231,474);
        walls4.setLocation(350, 500);
        walls4.changeHeight(15);
        walls4.changeHeight(10);
        walls4.changeHeight(5);
        walls3.setLocation(586,395);
        removeObject(walls3);
        Walls walls5 = new Walls(400, 20);
        addObject(walls5,293,44);
        walls5.setLocation(414,53);
        walls5.setLocation(365,61);
        walls5.setLocation(352,81);
        Walls walls6 = new Walls(50, 100);
        addObject(walls6,214,202);
        walls6.setLocation(486,127);
        walls6.setLocation(495,128);
        Walls walls7 = new Walls(50, 100);
        addObject(walls7,193,170);
        walls7.setLocation(212,170);
        walls7.setLocation(204,152);
        walls6.changeWidth(30);
        walls7.setLocation(199,101);
        walls7.setLocation(205,117);
        Walls walls8 = new Walls(50, 20);
        addObject(walls8,358,309);
        walls8.changeWidth(100);
        walls8.setLocation(348,309);
        walls8.changeWidth(175);
        walls8.setLocation(395,299);
        walls8.setLocation(332,312);
        walls8.setLocation(357,303);
        walls8.setLocation(346,310);
        walls8.changeWidth(150);
        walls8.changeWidth(130);
        Walls walls9 = new Walls(20, 10);
        addObject(walls9,424,317);
        walls9.setLocation(416,307);
        walls9.setLocation(424,311);
        Walls walls10 = new Walls(20, 10);
        addObject(walls10,275,313);
        walls8.getHeight();
        walls8.changeHeight(50);
        walls8.changeHeight(30);
        walls8.setLocation(396,293);
        walls8.changeHeight(35);
        walls8.setLocation(330,353);
        walls8.setLocation(368,330);
        walls8.setLocation(345,291);
        walls8.setLocation(347,298);
        Walls walls11 = new Walls(30, 30);
        addObject(walls11,345,265);
        walls11.changeHeight(35);
        walls11.setLocation(350,251);
        walls11.setLocation(346,259);
        Interactive interactive = new Interactive(50, 50);
        addObject(interactive,509,196);
        interactive.setLocation(502,172);
        walls6.setLocation(518,155);
        interactive.setLocation(506,166);
        walls6.setLocation(514,158);
        interactive.setLocation(508,158);
        walls6.setLocation(512,196);
        walls6.setLocation(524,177);
        walls6.setLocation(510,184);
        walls6.setLocation(507,132);
        walls6.setLocation(404,224);
        walls6.setLocation(313,180);
        interactive.setLocation(517,178);
        interactive.setLocation(509,182);
        walls6.setLocation(285,188);
        interactive.setLocation(511,173);
        interactive.setLocation(511,166);
        interactive.setLocation(506,177);
        interactive.setLocation(511,174);
        toBasement toBasement = new toBasement(15, 75);
        addObject(toBasement,692,465);
        toLivingR toLivingR = new toLivingR(15, 100);
        addObject(toLivingR,0,456);
        toLivingR.setLocation(7,456);
        toLivingR.setLocation(4,456);

        removeObject(toLivingR);
        toLivingR1 toLivingR1 = new toLivingR1(15, 100);
        addObject(toLivingR1,2,461);
        toLivingR1.setLocation(4,460);
        Protagonist protagonist = new Protagonist();

        if (Transition.protaPosition==0){
            addObject(protagonist,47,424);
        }
        else if(Transition.protaPosition==1){
            addObject(protagonist,606,439);
        }

        walls6.setLocation(228,429);
        removeObject(walls6);
        walls8.setLocation(333,298);
        walls2.changeTransparancy(0);
        walls8.setLocation(323,300);
        walls8.changeTransparancy(0);
        walls.changeTransparancy(0);
        toLivingR1.changeTransparancy(0);
        toBasement.changeTransparancy(0);
        walls4.changeTransparancy(0);
        interactive.setLocation(524,157);
        interactive.setLocation(515,153);
        interactive.setLocation(514,159);
        fridgeDialogue fridgeDialogue = new fridgeDialogue(20, 20);
        addObject(fridgeDialogue,288,80);
        walls5.setLocation(262,92);
        fridgeDialogue fridgeDialogue2 = new fridgeDialogue(50, 20);
        addObject(fridgeDialogue2,405,97);
        fridgeDialogue2.setLocation(407,91);
        fridgeDialogue2.setLocation(407,97);
        fridgeDialogue.changeWidth(70);
        fridgeDialogue fridgeDialogue3 = new fridgeDialogue(60, 60);
        addObject(fridgeDialogue3,507,164);
        interactive.setLocation(520,156);
        walls5.setLocation(427,41);
        walls5.setLocation(370,41);
        fridgeDialogue2.setLocation(385,75);
        fridgeDialogue2.setLocation(402,83);
        fridgeDialogue2.setLocation(407,87);
        fridgeDialogue2.setLocation(406,84);
        Dialogue dialogue = new Dialogue();
        addObject(dialogue,345,456);
        walls5.setLocation(359,57);
        walls5.setLocation(365,51);
        walls5.setLocation(370,53);
        walls5.setLocation(370,59);
        fridgeDialogue.setLocation(279,90);
        fridgeDialogue.setLocation(293,84);
    }
}
