import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Spin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spin extends Actor
{
    /**
     * Act - do whatever the Spin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        turn(1);
        gg();
    }    

    public void gg(){
        MWorld world1 = (MWorld) getWorld();
        EndGame gg = new EndGame(world1.score);
        if (isTouching(Mario.class) ) {
            Greenfoot.setWorld(gg);
        }
    }
}
