package ScrumGame;

public class Hero extends Character {

  Hero(int positionX, int positionY) {
    this.positionX = positionX;
    this.positionY = positionY;
    this.characterMaxHP = this.characterCurrentHP = 20 + 3 * Character.rollTheDice(1);
    this.characterDefendPoints = 2 * Character.rollTheDice(2);
    this.characterStrikePoints = 5 + Character.rollTheDice(1);
    this.characterType = "hero";
    this.isCharacterAlive = true;
  }

  public String heroInfo() {
    return this.characterType + " (Level " + this.characterLevel + ") HP: " + this.characterCurrentHP + "/" + this.characterMaxHP
            + " | " + "DP: " + this.characterDefendPoints + " | " + "SP: " + this.characterStrikePoints + "psx " + this.positionX + "  " + this.positionY;
  }
}

