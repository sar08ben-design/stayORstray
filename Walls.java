import greenfoot.*;
import java.awt.Color;


public class Walls extends CleanScreen
{
    

    public Walls(int width, int height)
    {
        super(width, height); 
        changeColor(greenfoot.Color.RED);
        getImage().setTransparency(100);
    }

}