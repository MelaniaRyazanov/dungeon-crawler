import java.util.Scanner;

public class Game {   
   public static void main(String[] args) {
      boolean exitGame = false;
      Game game = new Game();
      Map dungeonMap = new Map(5, 6);
            
      Scanner scanner = new Scanner(System.in);
      
      // TODO: Create a Map which populates each element of the grid with a Room
      // that contains a random assortment of Monsters and Items
      //dungeonMap
      
      // TODO: Create a Player at a random location in the Map
      // HINT: Generate random row/column values using Math.random()
      // and pass them into the Player constructor
      int randomRow = (int)(Math.random() * dungeonMap.getNumRows());
      int randomCol = (int)(Math.random() * dungeonMap.getNumCols());
        Player player = new Player(100, "Billy", randomRow, randomCol);
            
      while (exitGame != true) {
            System.out.print("Enter command: ");
            String input = scanner.nextLine().toUpperCase();
                        
            if (input.equals("EXIT")) {
                System.out.println("Exiting game. Goodbye!");
                exitGame = true;
            }
            else if (input.equals("LOOK") || input.equals("SEARCH")) {
               
            }
            // TODO: get the player movement working correctly. It should NOT let the player
            // move beyond the boundaries of the map, and provide the user with descriptions
            // of what is happening. You'll have to change the if/else/if statements here to 
            // do this.
            else if (input.startsWith("MOVE ")) {
               String direction = input.substring(5);
               if (direction.equals("UP")) {
                  int currentX = player.getCurrentX();
                  int currentY = player.getCurrentY();
                if(currentY + 1 < dungeonMap.getNumRows())
              {player.moveTo(currentX, currentY +1);
                  System.out.println("Player is in: " + player.getCurrentX() + "," + player.getCurrentY());
                  } else {
                     System.out.println("Can't move up.");
                  }
               } else if (direction.equals("DOWN")) {
                  int currentX = player.getCurrentX();
                  int currentY = player.getCurrentY();
                  if(currentY - 1 > dungeonMap.getNumRows())
                  {
                     player.moveTo(currentX, currentY - 1);
                     System.out.println("Player is in: " + player.getCurrentX() + "," + player.getCurrentY());
                   } else {
                        System.out.println("Can't move down.");
                        }
                 
               
               } else if (direction.equals("LEFT")) { 
                  int currentX = player.getCurrentX();
                  int currentY = player.getCurrentY();
                  if(currentX - 1 < dungeonMap.getNumCols())
                  {
                     player.moveTo(currentX -1, currentY);
                     System.out.println("Player is in: " + player.getCurrentX() + "," + player.getCurrentY());
                    } else {
                        System.out.println("Can't move left.");
                        }
                

                  
               } else if (direction.equals("RIGHT")) {
                  int currentX = player.getCurrentX();
                  int currentY = player.getCurrentY();
                  if(currentX + 1 < dungeonMap.getNumCols())
                  {
                     player.moveTo(currentX +1, currentY);
                     System.out.println("Player is in: " + player.getCurrentX() + "," + player.getCurrentY());
                    } else {
                        System.out.println("Can't move right.");
                        }
                 

              
               } else {
                  System.out.println("You're trying to move in an invalid direction. Please choose UP, DOWN, LEFT or RIGHT");
               }
            }
         // TODO: display a message to the user telling them their current coordinates every time they move
       }
   }
}