package markerannotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Monitor {
  String aspectratio() default "4:3";
  String classification() default "TFT";
}
