/**
 * Write a description of class Level here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level {
    private final Map map;
    
    public Level(Map map) {
        this.map = map;
    }
    
    public void start() {
        map.addObject(new Enemy(), 0, 1);    
    }
}
