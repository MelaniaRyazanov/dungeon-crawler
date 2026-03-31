public class Map {

   private Room[][] roomGrid;
   
   public int getNumRows() {
      // TODO: return the number of rows in roomGrid
     return numRows;
   }
   public int getNumCols() {
      // TODO: return the number of columns in roomGrid
      return numCols;
   }

   public Map(int rows, int columns) {
      // TODO: initalize the Map by creating the 2D array
      // and then calling populateMap which will build all of the Rooms
      Room[][] roomGrid = new Room[4][4];
      
   }
   public void populateMap() {
      // TODO: populate the map with a bunch of Rooms with random numbers of monsters and items
      // Hint: Use nested for loops to fill every row and column
      // Another Hint: use the Room constructor to populate the Monsters and Items
      int value = 0;
      int numRows = 0;
      int numCols = 0;
      for(int row = 0; row < roomGrid.length; row++){
         numRows++;
         for(int col = 0; col < roomGrid[].length; col++){
            value = roomGrid[row][col];
            numCols++;
         } 
         return numRows;
         return numCols;
      }
   }
   public Room getRoom(int row, int column) {
      // TODO: return the Room that is at the row and column that are passed
     
   }
   
   public Room getRandomRoom() {
      // TODO: This method will simply return a random room in the Map so that you can 
      // give the player a random starting point.
      
   }
}
  