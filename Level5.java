import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level5 extends MWorld
{

    private Win win = new Win(5);
    private WinTunnel winTunnel = new WinTunnel();
    private SpawnTunnel spawnTunnel = new SpawnTunnel();
    
    public Level5(int score)
    {    
        super(); 
        this.score = score;
        prepare();

    }

    private void prepare()
    {

        addObject(mario, 19, 570);
        for (int k = 0; k < 15; k++){
            addObject(new BrickPlatform(), 300 + k*30, 250);
        }
        for (int k = 0; k < 32; k++){
            addObject(new BrickPlatform(), 15 + k*30, 585);
        }
        for(int i = 0; i < 5; i++){
            addObject(new Fly(), 15 + i*70, 330 + i* 40); 
        }
        addObject(new Mushroom(), 400, 200);
        addObject(c, 864, 52);
        c.setValue(this.score);
        addObject(win, 987, 595);
        addObject(spawnTunnel, 24, 565);
        addObject(winTunnel, 986, 562);
    }
}
