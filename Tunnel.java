import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tunnel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tunnel extends Actor
{
    /**
     * Act - do whatever the Tunnel wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        repel();
        checkTouch();
    }    

    public void repel(){
        MWorld world1 = (MWorld) getWorld();
        if (isTouching(Mario.class) && Greenfoot.isKeyDown("left") && world1.mario.getX() > this.getX() + 20 && world1.mario.getY() > this.getY() - 40){
            world1.mario.setLocation(world1.mario.getX()+3, world1.mario.getY());
        }
        else if (isTouching(Mario.class) && Greenfoot.isKeyDown("right") && world1.mario.getX() < this.getX() -30  && world1.mario.getY() > this.getY() - 40){
            world1.mario.setLocation(world1.mario.getX()-3, world1.mario.getY());
        }
    }

    public boolean checkTouch(){
        if (getOneObjectAtOffset(5,20,Mario.class) != null)
        return true;
        
       else return false;
    }
}
