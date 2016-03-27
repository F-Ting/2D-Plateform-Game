import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class world3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level3 extends MWorld
{
    private Win win = new Win(3);
    private WinTunnel winTunnel = new WinTunnel();
    private SpawnTunnel spawnTunnel = new SpawnTunnel();
    /**
     * Constructor for objects of class world3.
     * 
     */
    public Level3(int score)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(); 
        this.score = score;
        prepare();
    }

    private void prepare()
    {
        addObject(mario, 19, 570);
        for (int j = 0; j < 32; j++){
            addObject(new BrickPlatform(), 15 + j*30, 585);
        }
        for (int k = 0; k < 20; k++){
            addObject(new BrickPlatform(), 100 + k*30, 310);
        }
        for (int k = 0; k < 22; k++){
            addObject(new BrickPlatform(), 450 + k*30, 450);
        }
        for (int i = 0 ; i < 20 ; i++){
            for (int k = 0; k < 8 ; k++){
                addObject(new Coin(), 250 + i*15, 80 + k * 20);
            }
        }
        addObject(c, 864, 52);

        c.setValue(this.score);
        addObject(new Fly(), 30, 170);
        addObject(new Lizard(), 400, 250);
        addObject(win, 987, 595);
        addObject(spawnTunnel, 24, 565);
        addObject(winTunnel, 986, 562);
        addObject(new SolidPlatform(), 670, 277);
        addObject(new SolidPlatform(), 100, 277);
    }
}
