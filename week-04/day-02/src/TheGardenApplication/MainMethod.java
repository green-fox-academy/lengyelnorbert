package TheGardenApplication;


public class MainMethod {

  public static void main(String[] args) {

    Garden myGarden = new Garden();

    myGarden.gardenInfo();
    myGarden.waterThemAll(40);
    myGarden.gardenInfo();
    myGarden.waterThemAll(70);
    myGarden.gardenInfo();
  }

}
