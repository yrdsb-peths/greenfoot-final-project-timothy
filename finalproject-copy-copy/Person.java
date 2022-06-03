import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Person here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Person extends Actor
{
    /**
     * Act - do whatever the Person wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage[] images;
    public Person()
    {
        images = new GreenfootImage[8];
        for(int i = 0; i < images.length; i++){
            images[i] = new GreenfootImage("images/person_idle/idle" + i + ".png");
        }
    }
    
    public void act()
    {
        
        if(Greenfoot.isKeyDown("w")){
            move(1);
        }
        
        if(Greenfoot.isKeyDown("space")){
            turn(1);
        }
        
        if(isTouching(Apple.class)){
            removeTouching(Apple.class);
        }
            
    }
}
