import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * Write a description of class Text here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Text extends Actor
{
     String Name;
    public Text(String Name){
        this.Name = Name;
    }
    public void act() 
    {
        display(this.Name);
    }    
    
    private void display(String Name)  
    {  
        setImage(new GreenfootImage(Name, 30, Color.BLACK, Color.WHITE));  
    }  
    
}
