import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TP here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TP extends Actor
{
    private int level;
    public TP(int level){
       this.level = level;
    }
    public void act(){
        win();
    }
    public void win(){
         MWorld world1 = (MWorld) getWorld();
        Level1 level1 = new Level1(world1.score);
        Level2 level2 = new Level2(level1.score);
        Level3 level3 = new Level3(level2.score);
        Level4 level4 = new Level4(level3.score);
        Level5 level5 = new Level5(level4.score);
        if (level == 1){
            Greenfoot.setWorld(level1);
        }else if (level == 2){
            Greenfoot.setWorld(level2);
        }else if (level == 3){
            Greenfoot.setWorld(level3);
        }else if (level == 4){
            Greenfoot.setWorld(level4);
        }else if (level == 5){
            Greenfoot.setWorld(level5);
        }
    }
}
