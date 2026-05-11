import greenfoot.*;
import greenfoot.World;

public class Protagonist extends Actor
{
    private GreenfootImage[] animationsW;
    private GreenfootImage[] animationsA;
    private GreenfootImage[] animationsS;
    private GreenfootImage[] animationsD;
    
    public static boolean dialogueON= false;
    public static boolean hasMoney= false;
    private boolean moving;
    
    private int frame;
    private int delay;
    private int img_width=48;
    private int img_height=96;
    private P_animation direction;
    
    public int speed;
    
    
    public Protagonist()
    {
        frame = 0;
        delay = 0;
        speed=3;
        direction = P_animation.S;
        moving=false;
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
        
        if(!dialogueON){
            move();
        }
        animate();
        
        checkInteractive();        
    }

    public void move()
    {
        checkInteractive();
        moving = false;
        
        
        
        if (Greenfoot.isKeyDown("w")) {
            setLocation(getX(), getY() - speed);
            if (isTouching(Walls.class)) {
                checkInteractive();
              
                setLocation(getX(), getY() + speed);
            }
            direction = P_animation.W;
            moving = true;
        }
        
        if (Greenfoot.isKeyDown("s")) {
            setLocation(getX(), getY() + speed);
            if (isTouching(Walls.class)) {
                checkInteractive();
                setLocation(getX(), getY() - speed);
            }
            direction = P_animation.S;
            moving = true;
        }
            
            if (Greenfoot.isKeyDown("a")) {
            setLocation(getX() - speed, getY());
            if (isTouching(Walls.class)) {
                checkInteractive();
                setLocation(getX() + speed, getY());
            }
            direction = P_animation.A;
            moving = true;
        }
        
        if (Greenfoot.isKeyDown("d")) {
            setLocation(getX() + speed, getY());
            if (isTouching(Walls.class)) {
                checkInteractive();
                setLocation(getX() - speed, getY());
            }
            direction = P_animation.D;
            moving = true;
        
        }
        
     
    }
    
    public void checkInteractive()
    {
        if (isTouching(Interactive.class))
        {
            Interactive.promptShowing = true;
        }
        else {
            Interactive.promptShowing = false;
        }
        }
    
    
    public void animate(){
        if (moving){
            delay++;

            if (delay >= 10) {

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
                if (frame > 5) frame = 0;

                delay = 0;
            }
        }
    }
    
    
    
    
    
    
    }