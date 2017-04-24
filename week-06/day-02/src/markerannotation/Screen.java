package markerannotation;

import java.util.Arrays;
import javax.management.StringValueExp;

@Monitor
public class Screen {

  int resolution;
  Size size;

  @Override
  public String toString() {
    String[] anno = new String[2];
    anno[0] = this.getClass().getAnnotations().;
    return "Resolution: " + resolution + ", size: " + size + ", aspectration: " + Arrays.toString(anno);
  }
}
