import greenfoot.*; 


public class kitchenDoor extends Door
{
    public kitchenDoor()
    {
    super();
    }
    
    public void act(){
       if (isTouching(Protagonist.class) &&
            Greenfoot.isKeyDown("e") &&
            doorOpen)
        {
            Greenfoot.setWorld(new LivingRoom());
        }
   }
}
