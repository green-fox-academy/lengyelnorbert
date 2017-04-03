import java.util.ArrayList;
import java.util.List;

//Reuse your Animal class
//Create a Farm class
//it has list of Animals
//                it has slots which defines the number of free places for animals
//        breed() -> creates a new animal if there's place for it
//        slaughter() -> removes the least hungry animal

public class Farm {

  ArrayList<AnimalClasses> animalsOnFarm;
  int slotForAnimals;

  public Farm(){
    animalsOnFarm = new ArrayList<>();
    int slotForAnimals = 5;
  }


  public void breed() {
    if (slotForAnimals > 0) {
      animalsOnFarm.add(new AnimalClasses());
      slotForAnimals--;
    }
  }

  public void slaughter(){
    AnimalClasses leastHungry = animalsOnFarm.get(0);
    for (AnimalClasses animalToCheck : animalsOnFarm){
      if (animalToCheck.anHunger < leastHungry.anHunger){
        leastHungry = animalToCheck;
      }

    }
    animalsOnFarm.remove(leastHungry);
  }
}


