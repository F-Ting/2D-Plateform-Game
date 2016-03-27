import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Win here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Win extends Actor
{
    int level;
    public Win(int level){
        this.level = level;
    }
    
    /**
     * Act - do whatever the Win wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        win();
    }   

    public void win(){
        MWorld world1 = (MWorld) getWorld();
        EndGame gg = new EndGame(world1.score);
        Level1 level1 = new Level1(world1.score);
        Level2 level2 = new Level2(level1.score);
        Level3 level3 = new Level3(level2.score);
        Level4 level4 = new Level4(level3.score);
        Level5 level5 = new Level5(level4.score);
        if (isTouching(Mario.class) && this.level == 0){
            Greenfoot.setWorld(level1);
        }
        else if(isTouching(Mario.class) && this.level == 1){
            Greenfoot.setWorld(level2);
        }
        else if(isTouching(Mario.class) && this.level == 2){
            Greenfoot.setWorld(level3);
        }
        else if(isTouching(Mario.class) && this.level == 3){
            Greenfoot.setWorld(level4);
        }
        else if(isTouching(Mario.class) && this.level == 4){
            Greenfoot.setWorld(level5);
        }
        else if(isTouching(Mario.class) && this.level == 5){
            Greenfoot.setWorld(level5);
        }
    }
}
