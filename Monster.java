public class Monster {
private String monsterType;
  
   private final String[] monsterTypes = {
            "Goblin",
            "Skeleton Warrior",
            "Zombie",
            "Orc",
            "Dark Sorcerer",
            "Giant Spider",
            "Vampire Bat",
            "Slime",
            "Mimic",
            "Lich",
            "Troll",
            "Werewolf",
            "Gargoyle",
            "Wraith",
            "Minotaur",
            "Basilisk",
            "Doppelgänger",
            "Demon Hound",
            "Cave Serpent",
            "Ancient Dragon"
        };

   public Monster() {
      // TODO: Pick a random monster type from monsterTypes
      int monsterLength = monsterTypes.length;
      int indexOfMonster = (int)(Math.random() * monsterLength);
      this.monsterType = monsterTypes[indexOfMonster];
      
   }
   
   
   public String getMonsterType() {
   
      
      return this.monsterType;
   }
   
   public String toString() {
      return "Monster type: " + monsterType;
      // TODO: Build a descriptive String for use by other methods
   }
   
}