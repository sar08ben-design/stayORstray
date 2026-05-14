import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class cashierDialogue here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cashierDialogue extends dialogueTrigger
{
    /**
     * Act - do whatever the cashierDialogue wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
  
    
    public cashierDialogue(int width, int height)
    {
        super(width, height);
        if (Protagonist.hasMoney){
            arrayMin = 9;
            arrayMax = 13;
        }
        else{
            arrayMin=7;
            arrayMax=8;
        }
        
        if (Protagonist.playAmmount==1){
        
        
        if (Protagonist.hasMoney){
            arrayMin = 53;
            arrayMax = 56;
        }
        else{
            arrayMin=50;
            arrayMax=52;
        }
        
        }
    }
    
    public void act()
    {
        checkTouch();
      
    if (!Protagonist.dialogueON && Dialogue.currentIndex == 13)
        {
            Protagonist.hasFood = true;
        }        
        
    }
    
}
