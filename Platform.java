import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Platform here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Platform extends Actor
{

    /**
     * Act - do whatever the Platform wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {

    }    

    public void repelY(){
        MWorld world1 = (MWorld) getWorld();
        if(isTouching(Mario.class) &&  world1.mario.getY() < this.getY() - 20){
            world1.mario.setLocation(world1.mario.getX(), world1.mario.getY() - 1 );
            world1.mario.speed = 3;
            world1.mario.multiJump = 0;
        }

        else if (isTouching(Mario.class) && world1.mario.getY() > this.getY() - 1){
            world1.mario.multiJump = 2;
            world1.mario.fall();
            world1.mario.vSpeed = 5;
        }

    }

    public void repelX(){
        MWorld world1 = (MWorld) getWorld();
        if (isTouching(Mario.class) && Greenfoot.isKeyDown("left") && world1.mario.getX() > this.getX() && world1.mario.getY() > this.getY()- 20 ){
            world1.mario.vSpeed = 3;
            world1.mario.fall();
            world1.mario.setLocation(world1.mario.getX()+3, world1.mario.getY());
        }
        else if (isTouching(Mario.class) && Greenfoot.isKeyDown("right") && world1.mario.getX() < this.getX() && world1.mario.getY() > this.getY() - 20){
            world1.mario.vSpeed = 3;
            world1.mario.fall();
            world1.mario.setLocation(world1.mario.getX()-3, world1.mario.getY());
        }

    }
}
