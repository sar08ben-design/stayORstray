import lang.stride.*;
import java.util.*;
import greenfoot.*;

public class Dialogue extends Actor
{
    public String[] dialogues;
    
    
    public Dialogue()
    {
        dialogues= new String[20];
    }
    public void act()
    {
       dialogueCalled();
        
        
    }
    
    public void dialogueCalled(){
        Protagonist.dialogueON=true;
        
    }
}
