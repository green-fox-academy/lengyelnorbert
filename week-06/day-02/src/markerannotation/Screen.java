package markerannotation;

import java.util.Arrays;

@Monitor
public class Screen {

  Size size;
  String classification;
  String aspectRatio;

  public Screen(Size size) {
    this.size = size;
    this.classification = this.getClass().getAnnotation(Monitor.class).classification();
    this.aspectRatio = this.getClass().getAnnotation(Monitor.class).aspectratio();
  }

  @Override
  public String toString() {
    return "This monitor size: " + size + ", aspectration: " + aspectRatio + ", classification:" + classification;
  }
}
