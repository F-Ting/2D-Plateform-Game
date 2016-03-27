import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Goomba here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lizard extends Actor
{
    private SimpleTimer timer = new SimpleTimer();
    public int speed = 3; //movement speed  
    private int acceleration = 1; //gravity effect while falling  
    public int vSpeed = 0; //vertical speed  
    /**
     * Act - do whatever the Goomba wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(3);
        repel();
        turn();
        checkFall();
        die();
    }    

    private void die(){
        MWorld world1 = (MWorld) getWorld();
        EndGame gg = new EndGame(world1.score);
        if (isTouching(Mario.class) && world1.mario.getY() < this.getY() - 10){
            world1.score += 10;
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

    private void turn(){
        if (isTouching(Tunnel.class) || isTouching(SolidPlatform.class) ){
            if(this.getRotation() == 0){
                this.setLocation(this.getX() - 5, this.getY());
                turn(180);
            } else {
                this.setLocation(this.getX() + 5, this.getY());
                turn(180);
            }
        }
        else if (this.getX() < 5 || this.getX() > 995){
            turn(180);

        }
    }

    private void fall()  
    {  
        setLocation(getX(), getY()+vSpeed);  
        vSpeed = vSpeed + acceleration;  
    }  

    private void repel(){
        if(isTouching(Platform.class)){
            this.setLocation(this.getX(), this.getY() -1);
        }
    }

    private boolean checkFall()  
    {  
        if (isTouching(Platform.class)  || isTouching(Tunnel.class))  
        {  
            vSpeed = 0;
            return false;
        }
        else{  
            fall();  
            return true;
        }  
    }  
}
