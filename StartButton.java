import greenfoot.*;

/**
 * Write a description of class StartButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartButton extends Actor {
    private final Level level;
    
    public StartButton(Map map) {
        level = new Level(map);
    }
    
    public void act() {
        if (Greenfoot.mouseClicked(this)) {
           level.start();
        }
    }
}
