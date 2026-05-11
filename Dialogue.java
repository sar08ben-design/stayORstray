import greenfoot.*;
import java.util.ArrayList;

public class Dialogue extends Actor
{
    public ArrayList<String> dialogues;
    public static int currentIndex= 0; 
    
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
            if ("right".equals(key))
            {
                nextDialogue();
            }
            else if ("left".equals(key))
            {
                previousDialogue();
            }
        
        }
        
            
        }
        
        
    public void removeDialogue(){
        
        setImage(new GreenfootImage(1, 1));
        Protagonist.dialogueON = false;
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
    if (currentIndex < showDialogue.arrayMax)
        {
        currentIndex++;
        showDialogue();
        }
    }

    public void previousDialogue() {
    if (currentIndex > showDialogue.arrayMin) {
        currentIndex--;
        showDialogue();
        }
    }
    
    
    public void dialogueAdding() {
        dialogues.add("The dog looks hungry.");
        dialogues.add("Maybe there's food in the kitchen.");
        dialogues.add("Empty.");
        dialogues.add("There's a beer");
        dialogues.add("Some more beer.");
        dialogues.add("There's no food in this house!");
        dialogues.add("Maybe I could get some in the shop.");
        dialogues.add("I want dog food.");
        dialogues.add("Casher: Bruh come back with some money.");
        dialogues.add("I want dog food.");
        dialogues.add("Casher: That was fast, you live close by?");
        dialogues.add("Yes");
        dialogues.add("Casher: We don't have dogs here..");
        dialogues.add("*You got dog food. -10$*");
    
    }
}