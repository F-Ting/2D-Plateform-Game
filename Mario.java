import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mario extends Actor
{
    private SimpleTimer timer = new SimpleTimer();
    public int speed = 3; //movement speed  
    public int vSpeed = 0; //vertical speed  
    private int acceleration = 1; //gravity effect while falling  
    public int jumpStrength = -15;  
    public int multiJump = 0; 
    
    /**
     * Act - do whatever the Mario wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        MWorld world1 = (MWorld) getWorld();
        String key = Greenfoot.getKey();  
        if (key != null && key.equals("space") && multiJump < 1 && Greenfoot.isKeyDown("space")) 
            jump();  
        move();
        checkFall();
    }

    public void move()  
    {  
        if (Greenfoot.isKeyDown("right"))  
        {  
            setLocation(getX()+speed,getY());  
        }

        if (Greenfoot.isKeyDown("left"))  
        {  
            setLocation(getX()-speed,getY());  
        }
    }

    public void jump()  
    {  
        vSpeed = jumpStrength;  
        multiJump ++;
        fall();
    }  

    public void fall()  
    {  
        setLocation(getX(), getY()+vSpeed);  
        vSpeed = vSpeed + acceleration;  
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
