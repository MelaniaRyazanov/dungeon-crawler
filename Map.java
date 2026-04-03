public class Map {

   private Room[][] roomGrid;
   
   public static void main(String[] args){
      Map map = new Map(5, 6); 
      System.out.println(map.getRoom(0, 0)); 
      System.out.println(map.getRoom(2, 3));
   }
   
   public int getNumRows() {
      // TODO: return the number of rows in roomGrid
    return roomGrid.length;
   }
   public int getNumCols() {
      // TODO: return the number of columns in roomGrid
    if(roomGrid.length > 0){
         return roomGrid[0].length;

    }
    else{
      return 0;
    }
   }

   public Map(int rows, int columns) {
      // TODO: initalize the Map by creating the 2D array
      // and then calling populateMap which will build all of the Rooms
      this.roomGrid = new Room[columns][rows];
      this.populateMap();
   }
   public void populateMap() {
      // TODO: populate the map with a bunch of Rooms with random numbers of monsters and items
      // Hint: Use nested for loops to fill every row and column
      // Another Hint: use the Room constructor to populate the Monsters and Items
      int numRows = this.getNumRows();
      int numCols = this.getNumCols();
      for(int row = 0; row < numRows; row++){
         Room[] currentRow = roomGrid[row]; 
         for(int col = 0; col < numCols; col++){
           currentRow[col] = new Room(); 
         } 
      }
   }
   public Room getRoom(int row, int column) {
      // TODO: return the Room that is at the row and column that are passed
       return roomGrid[row][column]; 
   }
   
   public Room getRandomRoom() {
      // TODO: This method will simply return a random room in the Map so that you can 
      // give the player a random starting point.
      int randomRow = (int)(Math.random() * getNumRows());
      int randomCol = (int)(Math.random() * getNumCols());
      return getRoom(randomRow, randomCol);
   }
}
  