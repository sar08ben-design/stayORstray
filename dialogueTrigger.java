import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class showDialogue here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class dialogueTrigger
 extends CleanScreen
{
    public static int arrayMax;
    public static int arrayMin;
    public static boolean promptShowing = false;
    private boolean myPromptShowing=false;
    public dialogueTrigger(int width, int height){
        super (width, height);
        changeColor(greenfoot.Color.YELLOW);
    }
    public void act()
    {
        checkTouch();
    }
    
    public boolean checkTouch()
    {
             if (isTouching(Protagonist.class))
            {
               if (!myPromptShowing){
                   
               getWorld().addObject(new InteractPrompt(), getX(), getY() - 40);
               myPromptShowing=true;
               
               
               if (Greenfoot.isKeyDown("e") && !Protagonist.dialogueON)
                {
                    Protagonist.dialogueON = true;
                    Dialogue.currentIndex = arrayMin;
                    return true;
                }
              
            }
                else{
                    if (myPromptShowing){
                 getWorld().removeObjects(getWorld().getObjects
                 (InteractPrompt.class));
                 myPromptShowing=false;
                 
                }
            
            }
            
            
            
        
        }
        return false;
    }
}