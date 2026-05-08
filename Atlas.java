import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Atlas extends Actor
{

   private boolean dogFed=false;
    public void act()
    {
        move();
        checkFoodInteraction();

        if (isLevelWon())
        {
            transitionToWinScreen();
        }
    }
    
    public void checkFoodInteraction()
        {
    Protagonist player = (Protagonist) getWorld().getObjects(Protagonist.class).get(0);

    if (isTouching(Protagonist.class) &&
        Greenfoot.isKeyDown("e") &&
        player.hasFood())
    {
        dogFed = true;
    }
        }

  public void move()
{
    if (dogFed)
    {
        Protagonist player = (Protagonist) getWorld().getObjects(Protagonist.class).get(0);

        int dx = player.getX() - getX();
        int dy = player.getY() - getY();

        int distance = (int)Math.sqrt(dx * dx + dy * dy);

        int speed = 3;

        if (distance > 65)
        {
            if (getX() < player.getX())
                setLocation(getX() + speed, getY());

            if (getX() > player.getX())
                setLocation(getX() - speed, getY());

            if (getY() < player.getY())
                setLocation(getX(), getY() + speed);

            if (getY() > player.getY())
                setLocation(getX(), getY() - speed);
        }
    }
}

    public void followProtagonist()
    {
        Actor protagonist = getWorld().getObjects(Protagonist.class).get(0); 
        if (protagonist != null)
        {
            turnTowards(protagonist.getX(), protagonist.getY());
            move(3);
        }
    }

    public boolean isLevelWon()
    {
        World world = getWorld(); 
        if (isTouching(Goal.class))
        {
            return true;
        }
        else {
            return false;
        }
    }

    public void transitionToWinScreen()
    {
        World winScreen = new WinScreen();
        Greenfoot.setWorld(winScreen);
    }

}    
