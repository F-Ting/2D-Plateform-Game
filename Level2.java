import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class world2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2 extends MWorld
{
    private Win win = new Win(2);
    private WinTunnel winTunnel = new WinTunnel();
    private SpawnTunnel spawnTunnel = new SpawnTunnel();
    
    public Level2(int score)
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
        for (int k = 0; k < 31; k++){
            addObject(new BrickPlatform(), 105 + k*30, 200);
        }
        for (int k = 0; k < 32; k++){
            addObject(new SolidPlatform(), 75 + k*30, 201);
        }
        for (int i = 0 ; i < 20 ; i++){
            for (int k = 0; k < 4 ; k++){
                addObject(new Coin(), 300 + i*15, 70 + k * 20);
            }
        }
        for(int i = 0; i < 5; i ++){
            addObject(new Spin(), 100 + i * 150, 400);
        }
        for(int i = 0; i < 12; i++){
            addObject(new BrickPlatform(), 15 + i * 100, 340);
        }
        addObject(new SolidPlatform(), 960, 425);
        addObject(new SolidPlatform(), 920, 500);
        addObject(new SolidPlatform(), 105, 168);
        addObject(new Fly(), 30, 90);
        addObject(new Lizard(), 15, 210);
        addObject(new Lizard(), 400, 170);
        addObject(new Lizard(), 800, 170);
        addObject(c, 864, 52);
        c.setValue(this.score);
        addObject(win, 987, 595);
        addObject(spawnTunnel, 24, 565);
        addObject(winTunnel, 986, 562);
    }
}
