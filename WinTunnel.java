import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WinTunnel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WinTunnel extends Tunnel
{
    /**
     * Act - do whatever the WinTunnel wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        repel();
        nextLevel();
        
    }    

    public void nextLevel(){
        MWorld world1 = (MWorld) getWorld();
        
        if(isTouching(Mario.class) && Greenfoot.isKeyDown("down") && world1.mario.getX() >= this.getX()-5){
            world1.mario.setLocation(world1.mario.getX(), world1.mario.getY() + 1 );
        }
        else if(isTouching(Mario.class)){
            world1.mario.setLocation(world1.mario.getX(), world1.mario.getY()- 1 );
        }
    }
}
