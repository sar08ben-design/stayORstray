import greenfoot.*;

public class Door extends Actor
{
    public boolean doorOpen = false;

    public Door()
    {
        setClosedImage();
    }

    public void act()
    {
        
    }

    public void openDoor()
    {
        doorOpen = true;
        setImage("World Assests/doorswindowsstairs/doorswindowsstairs_000.png");
    }

    public void closeDoor()
    {
        doorOpen = false;
        setImage("World Assests/doorswindowsstairs/doorswindowsstairs_002.png");
    }

    public boolean isOpen()
    {
        return doorOpen;
    }

    public void setClosedImage()
    {
        setImage("World Assests/doorswindowsstairs/doorswindowsstairs_002.png");
    }
}