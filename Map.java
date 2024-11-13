import greenfoot.*;

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Map extends World {
 
    private static final int[] START_POS = {0, 1};
    private static final String[][] MAP = {
        {"bg", "bg", "bg", "bg", "bg", "bg", "bg", "bg", "bg", "bg", "bg", "bg", "bg", "bg", "bg", "bg", "bg", "bg", "bg", "bg"},
        {"pt", "pt", "pt", "pt", "bg", "bg", "bg", "bg", "bg", "bg", "bg", "bg", "bg", "bg", "bg", "bg", "bg", "bg", "bg", "bg"},
        {"bg", "bg", "bg", "pt", "bg", "bg", "bg", "bg", "bg", "bg", "bg", "bg", "bg", "bg", "bg", "bg", "bg", "bg", "bg", "bg"},
        {"bg", "bg", "bg", "pt", "bg", "bg", "bg", "bg", "bg", "bg", "bg", "bg", "bg", "bg", "bg", "bg", "bg", "bg", "bg", "bg"},
        {"bg", "bg", "bg", "pt", "bg", "bg", "bg", "bg", "bg", "bg", "bg", "bg", "bg", "pt", "pt", "pt", "pt", "pt", "pt", "pt"},
        {"bg", "bg", "bg", "pt", "bg", "bg", "bg", "bg", "bg", "bg", "bg", "bg", "bg", "pt", "bg", "bg", "bg", "bg", "bg", "bg"},
        {"bg", "bg", "bg", "pt", "bg", "bg", "bg", "bg", "bg", "bg", "bg", "bg", "bg", "pt", "bg", "bg", "bg", "bg", "bg", "bg"},
        {"bg", "bg", "bg", "pt", "pt", "pt", "pt", "pt", "pt", "pt", "pt", "pt", "pt", "pt", "bg", "bg", "bg", "bg", "bg", "bg"},
        {"bg", "bg", "bg", "bg", "bg", "bg", "bg", "bg", "bg", "bg", "bg", "bg", "bg", "bg", "bg", "bg", "bg", "bg", "bg", "bg"},
        {"bg", "bg", "bg", "bg", "bg", "bg", "bg", "bg", "bg", "bg", "bg", "bg", "bg", "bg", "bg", "bg", "bg", "bg", "bg", "bg"},
        {"bg", "bg", "bg", "bg", "bg", "bg", "bg", "bg", "bg", "bg", "bg", "bg", "bg", "bg", "bg", "bg", "bg", "bg", "bg", "bg"},
        {"bg", "bg", "bg", "bg", "bg", "bg", "bg", "bg", "bg", "bg", "bg", "bg", "bg", "bg", "bg", "bg", "bg", "bg", "bg", "bg"}};
    
    /**
     * Konstruktor von Map, erstellt die Welt und fügt den Pfad ein
     * Die Welt ist 1680x840 groß und jede Box ist 1x1px groß
     */
    public Map() {    
        super(1680, 840, 1);
        insertPath();
        insertMenu();
    }
    
    private void insertPath() {
        for (int row = 0; row < 12; row++) {
            for (int column = 0; column < 20; column++) {
                if (MAP[row][column].equalsIgnoreCase("pt")) {
                    addObject(new Path(), 30+column*60, 30+row*60);
                }
            }
        }
    }
    
    private void insertMenu() {
        addObject(new Menu(), 600, 720);
        addObject(new StartButton(this), 60, 720);
        addObject(new StopButton(this), 180, 720);
    }
}
