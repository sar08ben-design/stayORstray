import greenfoot.*;
import greenfoot.World;

public class Protagonist extends Actor
{
    private GreenfootImage[] animationsW;
    private GreenfootImage[] animationsA;
    private GreenfootImage[] animationsS;
    private GreenfootImage[] animationsD;
    public static boolean dialogueON= true;
    private boolean moving;
    private int frame;
    private int delay;
    private int img_width=32;
    private int img_height=42;
    private P_animation direction;
    private boolean hasFood = false;
    public Protagonist()
    {
        frame = 0;
        delay = 0;
        direction = P_animation.S;

        animationsW = new GreenfootImage[6];
        animationsA = new GreenfootImage[6];
        animationsS = new GreenfootImage[6];
        animationsD = new GreenfootImage[6];

        
        for (int i = 0; i < 6; i++) 
        {
            animationsW[i] = new GreenfootImage("run_idle_" + i + ".png");
            animationsW[i].scale(img_width, img_height);

            animationsA[i] = new GreenfootImage("run_walk_left_" + i + ".png");
            animationsA[i].scale(img_width, img_height);

            animationsS[i] = new GreenfootImage("run_walk_down_" + i + ".png");
            animationsS[i].scale(img_width, img_height);

            animationsD[i] = new GreenfootImage("run_walk_right_" + i + ".png");
            animationsD[i].scale(img_width, img_height);
        }
    }

    public void act()
    {
        doorInteraction();
        move();
        animate();
        gotFood();
        
    }

    public void move()
    {
        if (dialogueON)
     {
        moving = false;
        
        if (Greenfoot.isKeyDown("w")) {
            setLocation(getX(), getY() - 3);
            if (isTouching(Walls.class)) {
            setLocation(getX(), getY() + 3);
            direction = P_animation.W;}
            moving = true;
        }
        
        if (Greenfoot.isKeyDown("s")) {
            setLocation(getX(), getY() + 3);
            if (isTouching(Walls.class)) {
            setLocation(getX(), getY() - 3);}
            direction = P_animation.S;
            moving = true;
        }
            
            if (Greenfoot.isKeyDown("a")) {
            setLocation(getX() - 3, getY());
            if (isTouching(Walls.class)) {
            setLocation(getX() +3, getY());}
            direction = P_animation.A;
            moving = true;
        }
        
        if (Greenfoot.isKeyDown("d")) {
            setLocation(getX() + 3, getY());
            if (isTouching(Walls.class)) {
            setLocation(getX() - 3, getY());}
            direction = P_animation.D;
            moving = true;
        
        }
     }
    }
    
    
    public void animate(){
        if (moving){
            delay++;

            if (delay >= 12) {

                if (direction == P_animation.W) {
                    setImage(animationsW[frame]);
                }
                else if (direction == P_animation.A) {
                    setImage(animationsA[frame]);
                }
                else if (direction == P_animation.S) {
                    setImage(animationsS[frame]);
                }
                else if (direction == P_animation.D) {
                    setImage(animationsD[frame]);
                }

                frame++;
                if (frame >= 6) frame = 0;

                delay = 0;
            }
        }
    }
    
    
    public void doorInteraction(){   
    if (isTouching(Door.class) && Greenfoot.isKeyDown("e"))
    {
        Door d = (Door) getOneIntersectingObject(Door.class);

        if (d.isOpen())
        {
            d.closeDoor();
        }
        else 
        {
            d.openDoor();
        }
    }
    }
    public void gotFood()
    {
        Actor dog_Food = getOneIntersectingObject(Dog_Food.class);
        if (dog_Food != null) 
        {
            World world = getWorld();
            world.removeObject(dog_Food);
            hasFood = true;
        }
    }
    
    public boolean hasFood()
    {
    return hasFood;
    }
    }