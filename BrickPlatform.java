import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BrickPlatform here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BrickPlatform extends Platform
{
    /**
     * Act - do whatever the BrickPlatform wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        repelX();
        repelY();
        breakWall();
    }    

    private void breakWall(){
        MWorld world1 = (MWorld) getWorld();
        if (isTouching(Mario.class) && world1.mario.getY() > this.getY() && world1.mario.getX() < this.getX() + 20 && world1.mario.getX() > this.getX() - 20)
            world1.removeObject(this);
    }
}

