import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class firstInteractionDog here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class firstInteractionDog extends dialogueTrigger
{
        /**
         * Act - do whatever the firstInteractionDog wants to do. This method is called whenever
         * the 'Act' or 'Run' button gets pressed in the environment.
         */
        
        public firstInteractionDog(int width, int height){
        
            super (width, height);
            if (!Protagonist.hasFood){
             arrayMin=0;
            arrayMax=1;
            }
            else {
                arrayMin=14;
                arrayMax=14; 
                
            }
            
            
    }
    public void act()
     {
        checkTouch();
            
            if (!Protagonist.dialogueON && Dialogue.currentIndex == 14)
        {
            Atlas.dogFed=true;
        } 
    }
    }
