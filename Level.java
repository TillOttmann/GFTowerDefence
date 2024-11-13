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
        map.addObject(new Enemy(), 30+0*60, 30+1*60);
        map.addObject(new Tower(), 30+4*60,30+1*60);
        
    }
}
