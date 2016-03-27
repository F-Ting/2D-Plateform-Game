import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Begin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Begin extends World
{

    /**
     * Constructor for objects of class Begin.
     * 
     */
    public Begin()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        prepare();
    }

    private void prepare(){
        addObject(new Text("'Left' and 'Right' arrow keys to move"), 300, 200);
        addObject(new Text("Press 'Space' bar to jump"), 300, 300);
        addObject(new Text("Press the green button to begin"), 300, 400);
        addObject(new Start(), 400, 500);
        Creature1 creature1 = new Creature1();
        addObject(creature1, 650, 501);
        creature1.setLocation(682, 363);
        Text text4 = new Text("Jump on these creatures to get extra score");
        addObject(text4, 682, 283);
        Creature2 creature2 = new Creature2();
        addObject(creature2, 778, 373);
        creature2.setLocation(778, 369);
        Text text5 = new Text("Avoid spinning towers");
        addObject(text5, 677, 100);
        TowersEX towersex = new TowersEX();
        addObject(towersex, 683, 187);
    }
}
