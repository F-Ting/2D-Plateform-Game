import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EndGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EndGame extends World
{

    Counter c;
    MWorld world1;
    private int score;
    /**
     * Constructor for objects of class GameOver.
     * 
     */
    public EndGame(int score)
    {    
        super(1000, 600, 1); 
        this.score = score;
        c = new Counter();
        prepare();
    }

    private void prepare(){
        addObject(new GG(), 500,200);
        addObject(new Restart(),500,500);
        Text text = new Text("Score:");
        addObject(text, 388, 389);
        addObject(c, 507, 387);
        c.setValue(score);
    }
}
