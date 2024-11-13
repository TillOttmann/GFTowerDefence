import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class Tower here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tower extends Actor
{
    /**
     * Act - do whatever the Tower wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    
    private List<Enemy> enemies;
    public static int damage = 1;
    
    
    public void enemyDetector() {
        List<Enemy> enemies = getObjectsInRange(10,Enemy.class);
        for(Enemy enemy : enemies) {
            Projectile projectile = new Projectile();
            getWorld().addObject(projectile,getX(),getY());
            projectile.turnTowards(enemy.getX(),enemy.getY());
            
        }
    }
    
}
