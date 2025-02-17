package main.java;

public class ConsoleRender {

    final static int MAP_SIZE = 10;
    final static String DEFAULT_FIELD = "*";

    public void print(WorldMap world) {
        System.out.println();
        for (int i = 0; i < MAP_SIZE; i++) {
            for (int j = 0; j < MAP_SIZE; j++) {
                String currentImage = (world.getImage(i,j) != null) ? world.getImage(i,j) : DEFAULT_FIELD;
                System.out.print(currentImage);
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}
