import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Coin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Coin extends Actor
{
    /**
     * Act - do whatever the Coin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        MWorld world1 = (MWorld) getWorld();
        if (isTouching(Mario.class)){
            world1.score++;
            world1.c.setValue(world1.score);
            world1.removeObject(this);
        }
    }    
}
