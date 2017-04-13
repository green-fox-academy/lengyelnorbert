package ScrumGame;

public class Hero extends Character {

  Hero(int positionX, int positionY) {
    this.positionX = positionX;
    this.positionY = positionY;
    this.characterMaxHP = 20 + Character.rollTheDice(3);
    this.characterDefendPoints = Character.rollTheDice(2);
    this.characterStrikePoints = 5 + Character.rollTheDice(1);
    this.characterType = "hero";

  }


  public String heroInfo() {
    return "Hero " + "(Level " + this.characterLevel + ") HP: " + this.characterCurrentHP + "/" + this.characterMaxHP
            + " | " + "DP: " + this.characterDefendPoints + " | " + "SP: " + this.characterStrikePoints;
  }
}

//Hero
//        HP: 20 + 3 * d6
//        DP: 2 * d6
//        SP: 5 + d6
//        Monster Lvl x (if boss)
//        HP: 2 * x * d6 (+d6)
//        DP: x/2 * d6 (+d6/2)
//        SP: x * d6 (+x)
