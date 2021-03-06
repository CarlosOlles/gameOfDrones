import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int P = in.nextInt(); // number of players in the game (2 to 4 players)
        int ID = in.nextInt(); // ID of your player (0, 1, 2, or 3)
        int D = in.nextInt(); // number of drones in each team (3 to 11)
        int Z = in.nextInt(); // number of zones on the map (4 to 8)
        for (int i = 0; i < Z; i++) {
            int X = in.nextInt(); // corresponds to the position of the center of a zone. A zone is a circle with a radius of 100 units.
            int Y = in.nextInt();
        }

        // game loop
        while (true) {
            for (int i = 0; i < Z; i++) {
                int TID = in.nextInt(); // ID of the team controlling the zone (0, 1, 2, or 3) or -1 if it is not controlled. The zones are given in the same order as in the initialization.
            }
            for (int i = 0; i < P; i++) {
                for (int j = 0; j < D; j++) {
                    int DX = in.nextInt(); // The first D lines contain the coordinates of drones of a player with the ID 0, the following D lines those of the drones of player 1, and thus it continues until the last player.
                    int DY = in.nextInt();
                }
            }
            for (int i = 0; i < D; i++) {

                // Write an action using System.out.println()
                // To debug: System.err.println("Debug messages...");


                // output a destination point to be reached by one of your drones. The first line corresponds to the first of your drones that you were provided as input, the next to the second, etc.
                System.out.println("20 20");
            }
        }
    }
}