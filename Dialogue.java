import greenfoot.*;
import java.util.ArrayList;

public class Dialogue extends Actor
{
    public ArrayList<String> dialogues;
    private int currentIndex = 0; // tracks which line to show
    
    public Dialogue()
    {
        dialogues = new ArrayList<>();
        dialogueAdding();
        
    }
    public void act()
    {
        
        
       
        if (Protagonist.dialogueON)
        {
            String key = Greenfoot.getKey();
            showDialogue();
            if ("right".equals(key)){
                
            nextDialogue();
            }
            else if ("left".equals(key)){
                
                previousDialogue();
            }
        }
        
            
        }
        
    
    


    public void showDialogue() {
        String text = dialogues.get(currentIndex);
        GreenfootImage img = new GreenfootImage(400, 60);
        img.setColor(new Color(0, 0, 0)); 
        img.fillRect(0, 0, 400, 60);
        img.setColor(Color.WHITE);
        img.setFont(new Font("Arial", false, false, 18));
        img.drawString(text, 10, 35);
        setImage(img);
    }
    
    public void nextDialogue() {
    if (currentIndex < dialogues.size() - 1)
        {
        currentIndex++;
        showDialogue();
        }
    }

    public void previousDialogue() {
    if (currentIndex > 0) {
        currentIndex--;
        showDialogue();
        }
    }
    
    
    public void dialogueAdding() {
        dialogues.add("The dog looks hungry.");
        dialogues.add("Maybe there's food in the kitchen.");
        dialogues.add("It's too high.");
        dialogues.add("Maybe I need something to stand on.");
    }
}