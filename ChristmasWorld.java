import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ChristmasWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public ChristmasWorld()
    {    
        
        // calling the other constructor with gameStarted = false.
        this(false); 
    }
    
    /**
     * Constructor for objects of class PingWorld.
     */
    public ChristmasWorld(boolean gameStarted)
    {
        // Create a new world with 500x450 cells with a cell size of 1x1 pixels.
        super(500, 450, 1);  
        if (gameStarted)
        {
            //GreenfootImage background = getBackground();
            //addObject.zombie;
        }
        else
        {
            Greenfoot.setWorld(new IntroWorld());
        }
    }
}

