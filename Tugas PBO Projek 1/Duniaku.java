import greenfoot.*;
import java.util.Random;

public class Duniaku extends World {
    private Random random = new Random();

    public Duniaku() {
        super(300, 200,2);
        // ...
        prepare();
    }

    public void act() {
        if (random.nextInt(230) < 1) { // Munculkan "orang" dengan probabilitas 5%
            int randomX = random.nextInt(getWidth()); // Koordinat X acak
            int randomY = random.nextInt(getHeight()); // Koordinat Y acak
            addObject(new people(), randomX, randomY); // Tambahkan objek "orang" secara acak
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        mycar mycar = new mycar();
        addObject(mycar,216,127);
        mycar.setLocation(112,82);
        mycar.setLocation(125,94);
    }
}

