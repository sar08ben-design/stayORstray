import greenfoot.*;
import java.awt.Color;

import greenfoot.*;

public class Walls extends Actor
{
    private int width;
    private int height;

    public Walls(int width, int height)
    {
        this.width = width;
        this.height = height;
        updateImage();
    }

    private void updateImage()
    {
        GreenfootImage img = new GreenfootImage(width, height);
        img.setColor(greenfoot.Color.RED);
        img.fill();
        setImage(img);
        img.setTransparency(100);
    }
 
    public void changeWidth(int width)
    {
        this.width = width;
        updateImage();
    }
  
    public void changeHeight(int height)
    {
        this.height = height;
        updateImage();
    }
    
    
    public int getWidth()
    {
    return width;
    }

    public int getHeight()
    {
    return height; 
    }
}