import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SpawnTunnel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SpawnTunnel extends Tunnel
{
    /**
     * Act - do whatever the Tunnel wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        repel();
        spawn();
    }    

    public void spawn(){
        MWorld world1 = (MWorld) getWorld();
        if(isTouching(Mario.class)){
            world1.mario.setLocation(world1.mario.getX(), world1.mario.getY()- 1 );
            world1.mario.multiJump = 0;
        }
    } 
}
