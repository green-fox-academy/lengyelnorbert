package markerannotation;

public @interface Monitor {
  String aspectratio() default "4:3";
  String classification() default "TFT";
}
