import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fly extends Actor
{
    /**
     * Act - do whatever the Bee wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move (4);
        turn();
        die();
    }    
    
    private void turn(){
        if (isTouching(Tunnel.class) || isTouching(Platform.class) )
            turn(180);
        else if (this.getX() < 5 || this.getX() > 995){
            turn(180);
        }
    }
    
    private void die(){
        MWorld world1 = (MWorld) getWorld();
        EndGame gg = new EndGame(world1.score);
        if (isTouching(Mario.class) && world1.mario.getY() < this.getY() - 15){
            world1.score += 20;
            world1.c.setValue(world1.score);
            world1.mario.multiJump = 0;
            world1.mario.vSpeed = 0;
            world1.mario.setLocation (world1.mario.getX(), world1.mario.getY() - 20);
            getWorld().removeObject(this);
        }
        else if (isTouching(Mario.class) && world1.mario.getY() > this.getY() - 10) {
            Greenfoot.setWorld(gg);
        }
        
    }
}
