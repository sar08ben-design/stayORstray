import greenfoot.*;


public class CleanScreen extends Actor
{
    
    public int width;
    public int height;

    public CleanScreen(int width, int height)
    {
        this.width = width;
        this.height = height;
        updateImage();
    }
    
    private void updateImage()
    {
        GreenfootImage img = new GreenfootImage(width, height);
        img.setColor(greenfoot.Color.GREEN);
        img.fill();
        setImage(img);
        
    }
    
     public void changeColor(greenfoot.Color color)
    {
        GreenfootImage img = getImage();
        img.setColor(color);
        img.fill();
        setImage(img);
    
    }
    
    public void changeTransparancy(int t){
        GreenfootImage img = getImage();
        img.setTransparency(t);
        if (t>100 || t<0){
        System.out.print("Put number between 0 and 100");
        }
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