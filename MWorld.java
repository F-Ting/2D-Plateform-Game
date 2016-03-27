import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MWorld extends World
{
    Counter c;
    Mario mario;
    private TP tp;
    private WinTunnel winTunnel;
    private SpawnTunnel spawnTunnel;
    private Win win;
    public int score;
    /**
     * Constructor for objects of class MWorld.
     * 
     */
    public MWorld()
    {    
        super(1000, 600, 1); 
        win = new Win(0);
        c = new Counter("Score:");
        mario = new Mario();
        spawnTunnel = new SpawnTunnel();
        winTunnel = new WinTunnel();
        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {

        addObject(mario, 19, 570);
        for (int k = 0; k < 32; k++){
            addObject(new BrickPlatform(), 15 + k*30, 585);
        }
        addObject(c, 864, 52);
        addObject(win, 987, 599);
        addObject(spawnTunnel, 24, 565);
        addObject(winTunnel, 986, 562);
        addObject(new Lizard(), 275, 553);
    }
}
