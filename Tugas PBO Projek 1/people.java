import greenfoot.*;

public class people extends Actor 
{
    public void act() {
        checkCollision();
    }
    
    private void checkCollision() {
        Actor mycar = getOneIntersectingObject(mycar.class);
        if (mycar != null) {
            int mycarX = mycar.getX();
            int mycarY = mycar.getY();
            World world = getWorld(); // Simpan referensi dunia ke dalam variabel lokal
            if (world != null) { // Periksa apakah dunia masih ada
                world.removeObject(this);
                world.addObject(new nabrak(), mycarX, mycarY);
            }
        }
    }
}




