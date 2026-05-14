import greenfoot.*;


public class InteractPrompt extends Actor
{
    public InteractPrompt()
    {//i swear if this dont work again
        GreenfootImage img = new GreenfootImage(120, 30);
        img.setColor(new Color(0, 0, 0, 180));
        img.fillRect(0, 0, 120, 30);
        img.setColor(Color.WHITE);
        img.setFont(new Font("Arial", false, false, 14));
        img.drawString("E : Interact", 10, 20);
        setImage(img);
    }
    
    public void act()
    {
        
    }
}