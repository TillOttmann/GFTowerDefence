import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int health = 10;
    
    public void act()
    {
        // Add your action code here.
    }
    
    public void hitByProjectile(){
        Actor Projectile = getOneIntersectingObject(Projectile.class);
        if(Projectile!=null) {
            health-=Tower.damage;
            getWorld().removeObject(Projectile);
        }
        if(health==0) {
            getWorld().removeObject(this);
        }
    
    }
    
}
