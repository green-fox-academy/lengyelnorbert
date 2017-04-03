

public class AnimalClasses {

  int anHunger;
  int anThurst;

  public AnimalClasses(){
    anHunger = 50;
    anThurst = 50;
  }
  public void eat(){
    anHunger--;
  }

  public void dring(){
    anThurst--;
  }
  public void play(){
    anHunger++;
    anThurst++;
  }






}
