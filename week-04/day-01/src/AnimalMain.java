

public class AnimalMain {

  public static void main(String[] args) {

    AnimalClasses dog = new AnimalClasses();
    System.out.println("hunger: " + dog.anHunger + " " + "thirst: " + dog.anThurst);
    dog.play();
    System.out.println("hunger: " + dog.anHunger + " " + "thirst: " + dog.anThurst);
    dog.eat();
    System.out.println("hunger: " + dog.anHunger + " " + "thirst: " + dog.anThurst);

  }
}
