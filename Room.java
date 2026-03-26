import java.util.ArrayList;

public class Room {
   private ArrayList<Item> itemsInRoom;
   private ArrayList<Monster> monstersInRoom;
   private final int maxNumberOfMonsters = 2;
   private final int maxNumberOfItems = 2;
   
   public Room() {
      
      // TODO: Generate a random number of monsters and items between 1 and max (inclusive)
      int numOfMonsters = (int)(Math.random() * maxNumberOfMonsters)+1;
      int numOfItems = (int)(Math.random() * maxNumberOfItems)+1;
      // TODO: Create the ArrayLists to hold the Items and Monsters in the Room and populate them with Monsters and Items
      this.monstersInRoom = new ArrayList<Monster>();
      
      for(int i = 0; i < numOfMonsters; i++){
         this.monstersInRoom.add(new Monster());
      }
         
      this.itemsInRoom = new ArrayList<Item>();
      
      for(int i = 0; i < numOfItems; i++){
         this.itemsInRoom.add(new Item());
      }
    
   }
   
   public String toString() {
      String returnString = "Items in room: ";

      // TODO: build a returnString that nicely formats the Monsters and Items in the Room
      // HINT: Use a for-each loop to go through the ArrayLists
      for(final Item item : itemsInRoom){
         returnString += "Items in room: " + item;
      }
   
      for(final Monster monster : monstersInRoom){
         returnString += "Monsters in room: " + monster;
      }
   
   
      return returnString;
   }

   }