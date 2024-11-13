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
     * Die Welt ist 20x14 groß und jede Box ist 60x60px groß
     */
    public Map() {    
        super(20, 14, 60);
        insertPath();
        insertMenu();
    }
    
    private void insertPath() {
        for (int row = 0; row < MAP.length; row++) {
            for (int column = 0; column < MAP[0].length; column++) {
                if (MAP[row][column].equalsIgnoreCase("pt")) {
                    addObject(new Path(), column, row);
                }
            }
        }
    }
    
    private void insertMenu() {
        addObject(new Menu(), 10, 12);
        addObject(new StartButton(this), 1, 12);
        addObject(new StopButton(this), 3, 12);
    }
}
