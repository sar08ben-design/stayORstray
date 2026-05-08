import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class finalRoom extends World
{

    /**
     * Constructor for objects of class MyWorld.
     */
    public finalRoom()
    {
        super(1000, 700, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Goal goal = new Goal();
        addObject(goal,491,353);
        goal.setLocation(905,647);
        goal.setLocation(918,648);
        Atlas atlas = new Atlas();
        addObject(atlas,72,72);
        Protagonist protagonist = new Protagonist();
        addObject(protagonist,139,94);
        Walls walls = new Walls(300, 5);
        addObject(walls,570,498);
        walls.setLocation(207,147);
        walls.setLocation(164,145);
        Walls walls2 = new Walls(5, 100);
        addObject(walls2,323,231);
        walls2.setLocation(310,193);
        walls2.setLocation(312,194);
        Walls walls3 = new Walls(5, 345);
        addObject(walls3,417,143);
        walls3.setLocation(420,197);
        walls3.setLocation(422,342);
        walls3.setLocation(413,185);
        Walls walls4 = new Walls(5, 100);
        addObject(walls4,802,555);
        walls4.setLocation(875,548);
        Walls walls5 = new Walls(80, 5);
        addObject(walls5,821,508);
        walls5.setLocation(833,499);
        walls5.setLocation(837,500);
        Walls walls6 = new Walls(90, 5);
        addObject(walls6,796,423);
        walls6.setLocation(898,395);
        walls6.changeHeight(90);
        walls6.changeWidth(5);
        walls6.setLocation(801,456);
        walls6.setLocation(799,456);
        walls6.changeHeight(180);
        walls6.setLocation(799,370);
        walls6.setLocation(798,412);
        Walls walls7 = new Walls(95, 5);
        addObject(walls7,892,327);
        walls7.setLocation(850,325);
        walls7.setLocation(850,325);
        walls7.setLocation(850,325);
        walls7.setLocation(814,323);
        walls7.setLocation(814,323);
        walls7.setLocation(814,323);
        walls7.setLocation(828,326);
        walls7.changeWidth(120);
        walls7.setLocation(876,329);
        walls7.changeWidth(175);
        walls7.setLocation(890,324);
        walls7.setLocation(884,324);
        Walls walls8 = new Walls(5, 90);
        addObject(walls8,942,401);
        walls8.setLocation(969,368);
        walls8.changeHeight(150);
        walls8.setLocation(970,403);
        walls8.changeHeight(120);
        walls8.setLocation(969,380);
        walls8.setLocation(969,377);
        walls8.setLocation(967,367);
        walls8.setLocation(968,357);
        walls8.setLocation(967,385);
        walls8.setLocation(969,386);
        Walls walls9 = new Walls(90, 5);
        addObject(walls9,879,447);
        walls9.setLocation(925,444);
        Walls walls10 = new Walls(110, 5);
        addObject(walls10,637,570);
        walls10.setLocation(777,553);
        Walls walls11 = new Walls(5, 350);
        addObject(walls11,579,332);
        walls11.setLocation(724,373);
        walls11.setLocation(724,382);
        walls11.setLocation(722,382);
        walls11.changeHeight(325);
        walls11.setLocation(724,315);
        walls11.setLocation(725,324);
        walls11.setLocation(725,281);
        walls11.setLocation(726,391);
        walls11.setLocation(725,393);
        Walls walls12 = new Walls(180, 5);
        addObject(walls12,830,243);
        walls12.setLocation(815,233);
        walls12.changeWidth(230);
        walls12.setLocation(884,233);
        walls12.setLocation(844,233);
        walls12.setLocation(844,233);
        Walls walls13 = new Walls(5, 145);
        addObject(walls13,921,118);
        walls13.setLocation(959,160);
        walls13.setLocation(957,160);
        Walls walls14 = new Walls(300, 5);
        addObject(walls14,659,113);
        walls14.setLocation(806,90);
        walls14.changeWidth(385);
        walls14.setLocation(726,93);
        walls14.setLocation(765,91);
        walls14.setLocation(765,91);
        walls14.setLocation(766,90);
        Walls walls15 = new Walls(5, 400);
        addObject(walls15,579,341);
        walls15.setLocation(577,289);
        Walls walls16 = new Walls(560, 5);
        addObject(walls16,252,508);
        walls16.setLocation(334,490);
        walls16.setLocation(334,490);
        walls16.changeWidth(500);
        walls16.setLocation(354,486);
        walls16.setLocation(312,488);
        walls16.setLocation(273,487);
        walls16.setLocation(354,492);
        walls16.changeWidth(350);
        walls16.setLocation(339,487);
        walls16.setLocation(319,487);
        walls16.setLocation(376,490);
        walls16.setLocation(452,490);
    }
    
}