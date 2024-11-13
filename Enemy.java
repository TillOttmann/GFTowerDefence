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
    public int health = 100;

    public void act()
    {
        hitByProjectile();
        //clearTrack();
    }

    public void clearTrack() {
        for(int i=0; i<1;i++){
            moving(2);
            turn(90);
            moving(5);
            turn(270);
            moving(9);
            turn(270);
            moving(2);
            turn(90);
            moving(5);
        }
        getWorld().removeObject(this);
    }

    public void moving(int amount) {
        for(int i=0;i<=amount;i++) {
            Greenfoot.delay(100);
            move(60);

        }
    }

    public void hitByProjectile(){
        Actor Projectile = getOneIntersectingObject(Projectile.class);
        if(Projectile!=null) {
            health = health-Tower.damage;
            getWorld().removeObject(Projectile);
        }
        if(health<1) {
            getWorld().removeObject(this);
        }

    }

}
