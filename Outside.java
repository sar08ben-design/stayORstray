import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Outside here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Outside extends World
{

    /**
     * Constructor for objects of class Outside.
     * 
     */
    public Outside()
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
        toLivingR toLivingR = new toLivingR(20, 10);
        addObject(toLivingR,222,248);
        toLivingR.setLocation(224,237);
        toLivingR.setLocation(216,230);
        toLivingR.setLocation(220,234);
        toLivingR.setLocation(215,233);
        toLivingR.setLocation(222,233);
        toLivingR.setLocation(218,233);

        Protagonist protagonist = new Protagonist();
        addObject(protagonist,670,349);
        Atlas atlas = new Atlas();
        if (Atlas.dogFed)  {addObject(atlas,171,327);}

        toLivingR.changeTransparancy(0);
        cashierDialogue cashierDialogue = new cashierDialogue(40, 20);
        addObject(cashierDialogue,514,287);

        Dialogue dialogue = new Dialogue();
        addObject(dialogue,344,470);

        cashierDialogue.setLocation(513,218);
        cashierDialogue.changeTransparancy(0);
        protagonist.setLocation(68,353);
        protagonist.setLocation(212,354);
        protagonist.setLocation(220,337);
        cashierDialogue cashierDialogue2 = new cashierDialogue(50, 15);
        addObject(cashierDialogue2,509,248);
        cashierDialogue2.setLocation(516,230);
        cashierDialogue cashierDialogue3 = new cashierDialogue(50, 15);
        addObject(cashierDialogue3,517,228);

     
        afterFed afterFed = new afterFed(30, 300);
        addObject(afterFed,682,391);
        afterFed.setLocation(699,397);
    }
}
