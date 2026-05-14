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
            if ("space".equals(key))
            {
                nextDialogue();
            }
            
            if ("q".equals(key))
            {
                    
                removeDialogue();
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
    if (currentIndex < dialogueTrigger.arrayMax)
        {
        currentIndex++;
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
        dialogues.add("Casher: That was fast, you live close by?"); //10
        dialogues.add("Yes");
        dialogues.add("Casher: We don't have dogs here..");
        dialogues.add("*You got dog food. -10$*");
        dialogues.add("*Dog fed. It can now follow you.*");
        dialogues.add("*You found MONEY. Use it to buy food.*"); //15
        
        //Dialogue first time 16-39
        dialogues.add("Hmm...");
        dialogues.add("It feels like the dog still needs help.");
        dialogues.add("Since it keeps on following me.");
        dialogues.add("Maybe it wants to play in the parc?");
        dialogues.add("Dog:*wouf wouf*");
        dialogues.add("Yeah, he probably wants to play.");
        dialogues.add("*a man is running towards you*");
        dialogues.add("(unknow):Hey you!");
        dialogues.add("!!!");
        dialogues.add("(unknow): Hey...My dog! Atlas!");
        dialogues.add("Oh, you're the owner?");
        dialogues.add("Owner: Yes.");
        dialogues.add("Owner: Thanks for taking care of Atlas.");
        dialogues.add("Owner: I was running late from work...");
        dialogues.add("*He puts a collar on Atlas's neck.");
        dialogues.add("Owner: Bought him a new one.");
        dialogues.add("Owner: He keeps breaking the others.");
        dialogues.add("*Atlas looks like he don't like the collar.");
        dialogues.add("Owner: Dogs, haha.");
        dialogues.add("Atlas: WOOF!!!");
        dialogues.add("*You watch Atlas and his owner go back.");
        dialogues.add("L-O-S-T");
        dialogues.add("-Atlas got electrocuted when going back home.");
        dialogues.add("You are not reedemed, try again?");
        dialogues.add("...");
        
        ////Key in first playthrough 41
        dialogues.add("There's a key. Useless...I need money!");
        ////Key in second playthrough 42
        dialogues.add("There's a key. It will open the basement.");
        
        //Second playthrough 43
        dialogues.add("Atlas looks hungry.");
        dialogues.add("Let's search the kitchen.");
        dialogues.add("Empty.");
        dialogues.add("There's a beer");
        dialogues.add("Some more beer.");
        dialogues.add("There's no food in this house.");
        dialogues.add("Let's go the shop.");
        dialogues.add("I want dog food."); //50
        dialogues.add("Casher: Bruh come back with-");
        dialogues.add("Okay");
        dialogues.add("Casher: That was fast, you live close by?"); 
        dialogues.add("Yes");
        dialogues.add("Casher: We don't have dogs here..");
        dialogues.add("*You got dog food. -10$*");
        dialogues.add("*Dog fed. It can now follow you.*");
        dialogues.add("*You found MONEY. Use it to buy food.*"); //58
    }
}