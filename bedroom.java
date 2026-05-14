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
        Atlas atlas = new Atlas();
        if (Transition.protaPosition==0){
            addObject(protagonist,386,445);
            if (Atlas.dogFed)  {addObject(atlas,390,429);}
        }
        else if (Transition.protaPosition>0){
            addObject(protagonist,650,418);
            if (Atlas.dogFed)  {addObject(atlas,670,404);}

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
        protagonist.setLocation(390,429);

        Walls walls = new Walls(200, 300);
        addObject(walls,606,163);
        walls.setLocation(624,93);
        Walls walls2 = new Walls(40, 500);
        addObject(walls2,138,280);
        walls2.setLocation(149,262);
        walls2.setLocation(158,242);
        walls2.setLocation(152,243);
        walls2.setLocation(162,246);
        walls2.setLocation(156,247);
        Walls walls3 = new Walls(200, 70);
        addObject(walls3,274,296);
        walls3.changeHeight(30);
        walls3.setLocation(311,274);
        walls3.setLocation(272,277);
        walls3.changeColor(greenfoot.Color.RED);
        walls3.changeHeight(20);
        walls3.setLocation(328,267);
        walls3.setLocation(272,275);
        walls3.changeColor(greenfoot.Color.RED);

        Walls walls4 = new Walls(100, 150);
        addObject(walls4,260,405);
        walls4.setLocation(245,419);
        Walls walls5 = new Walls(400, 30);
        addObject(walls5,337,94);
        walls5.setLocation(429,112);
        walls5.setLocation(327,104);
        walls5.setLocation(304,102);
        walls5.setLocation(341,103);
        walls5.setLocation(397,80);
        walls5.setLocation(367,78);
        walls5.setLocation(403,79);
        walls5.setLocation(371,75);
        Walls walls6 = new Walls(100, 10);
        addObject(walls6,361,136);
        walls6.setLocation(515,114);
        Walls walls7 = new Walls(200, 10);
        addObject(walls7,359,111);
        walls7.setLocation(403,110);
        walls7.changeWidth(180);
        walls7.setLocation(351,110);
        walls7.changeWidth(160);
        walls7.setLocation(394,112);
        walls7.setLocation(358,112);
        walls7.setLocation(353,107);
        walls7.setLocation(353,108);
        walls6.setLocation(511,95);
        Walls walls8 = new Walls(30, 30);
        addObject(walls8,202,235);
        walls8.setLocation(214,232);
        walls8.setLocation(207,233);
        walls8.setLocation(213,232);
        walls8.setLocation(210,232);
        walls3.setLocation(289,266);
        walls3.setLocation(272,270);
        Walls walls9 = new Walls(600, 10);
        addObject(walls9,374,494);
        toLivingR2.setLocation(433,503);
        toLivingR2.setLocation(434,496);
        walls9.setLocation(327,499);
        walls9.setLocation(395,491);
        walls9.setLocation(396,499);
        sinkDialogue sinkDialogue = new sinkDialogue(40, 10);
        addObject(sinkDialogue,494,99);
        walls6.setLocation(493,99);
        walls.setLocation(526,96);
        walls.setLocation(509,91);
        Dialogue dialogue = new Dialogue();
        addObject(dialogue,397,447);
        walls.setLocation(681,252);
        walls.setLocation(594,108);
        walls.setLocation(628,88);
        walls.setLocation(618,91);
        walls.setLocation(624,90);
        walls6.setLocation(516,93);
        walls.getClass();
        walls.hashCode();
        walls.toString();
        walls.setLocation(628,204);
        walls.setLocation(621,98);
        walls.setLocation(621,95);
        walls.changeTransparancy(0);
        walls5.changeTransparancy(0);
        sinkDialogue.changeTransparancy(0);
        walls6.changeTransparancy(0);
        walls7.changeTransparancy(0);
        walls3.changeTransparancy(0);
        walls8.changeTransparancy(0);
        walls4.changeTransparancy(0);
        walls2.changeTransparancy(0);
        toLivingR2.changeTransparancy(0);
        toBathroom.changeTransparancy(0);
        toLivingR2.changeTransparancy(0);
        walls9.changeTransparancy(0);
        removeObject(sinkDialogue);
        keyToBasement keyToBasement = new keyToBasement(30, 30);
        addObject(keyToBasement,489,106);
        keyToBasement.setLocation(496,102);
        keyToBasement.setLocation(491,109);
    }
}
