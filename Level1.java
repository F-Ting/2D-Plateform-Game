 import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends MWorld
{
    private Win win;
    private WinTunnel winTunnel = new WinTunnel();
    private SpawnTunnel spawnTunnel = new SpawnTunnel();
    /**
     * Constructor for objects of class Level1.
     * 
     */
    public Level1(int score)
    {    
        super(); 
        this.score = score;
        prepare();
    }

    private void prepare()
    {
        addObject(mario, 19, 570);
        // Base platform
        for (int j = 0; j < 32; j++){
            addObject(new BrickPlatform(), 15 + j*30, 585);
        }

        // obstacles
        // verticle
        for (int j = 0; j < 6; j++){
            addObject(new SolidPlatform(), 605, 400 + j*30);
        }

        // horizontal 
        for (int j = 0; j < 15; j++){
            addObject(new SolidPlatform(), 15 + j*30, 150);
        }

        for (int j = 0; j < 3; j++){
            addObject(new BrickPlatform(), 465 + j*30, 150);
        }
        addObject(new SolidPlatform(), 495, 270);
        for (int j = 0; j < 16; j++){
            addObject(new SolidPlatform(), 550 + j*30, 150);
        }

        for (int k = 0; k < 24; k++){
            addObject(new SolidPlatform(), 250 + k*30, 370);
        }
        addObject(new Spin(), 160, 310);
        for (int k = 0; k < 15; k++){
            addObject(new SolidPlatform(), 0 + k*30, 460);
        }
        
        for (int k = 0; k < 12; k++){
            addObject(new SolidPlatform(), 700 + k*30, 460);
        }
        
        for (int j = 0; j < 5; j++){
            addObject(new BrickPlatform(), 450 + j*30, 460);
        }

        addObject(c, 864, 52);
        c.setValue(score);
        // coins
        for (int i = 1; i < 30 ; i++){
            addObject(new Coin(), 250+ i*15, 100);
        }
        for (int i = 1; i < 10 ; i++){
            addObject(new Coin(), 200+ i*15, 420);
        }
        for (int i = 1; i < 10 ; i++){
            addObject(new Coin(), 700+ i*15, 420);
        }
        for (int i = 1; i < 10 ; i++){
            addObject(new Coin(), 550+ i*15, 280);
        }
        addObject(new Win(1), 987, 595);
        addObject(spawnTunnel, 24, 565);
        addObject(winTunnel, 986, 562);
        addObject(new Fly(), 40, 70);
        addObject(new Fly(), 40, 200);
    }
}
