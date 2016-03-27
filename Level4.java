import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level4 extends MWorld
{

    private Win win = new Win(4);
    private WinTunnel winTunnel = new WinTunnel();
    private SpawnTunnel spawnTunnel = new SpawnTunnel();
    
    public Level4(int score)
    {    
        super(); 
        this.score = score;
        
        prepare();

    }

    private void prepare()
    {
        addObject(mario, 19, 570);
        for (int k = 0; k < 32; k++){
            addObject(new BrickPlatform(), 15 + k*30, 585);
        }
        for (int k = 0; k < 15 ;k++){
            addObject(new SolidPlatform(), 500, 130 + k*30);
        }
        
        for (int k = 0; k < 14 ;k++){
            addObject(new SolidPlatform(), 600+ k*30, 450);
        }
        for (int k = 0; k < 14 ;k++){
            addObject(new SolidPlatform(), 15 + k*30, 450);
        }
        for (int k = 0; k < 14 ;k++){
            addObject(new SolidPlatform(), 600+ k*30, 250);
        }
        for (int k = 0; k < 14 ;k++){
            addObject(new SolidPlatform(), 15 + k*30, 250);
        }
        for (int k = 0; k < 18 ;k++){
            addObject(new SolidPlatform(), 235 + k*30, 350);
        }
        
        addObject(new Spin(), 140, 350);
        addObject(new Spin(), 840, 350);
        addObject(new Fly(), 30, 70);
        addObject(c, 864, 52);
        c.setValue(this.score);
        addObject(win, 987, 595);
        addObject(spawnTunnel, 24, 565);
        addObject(winTunnel, 986, 562);
    }
    
}
