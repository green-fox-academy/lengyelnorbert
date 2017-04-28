import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Retrofit;

public class Main {

  public static void main(String[] args) {

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://yoda.p.mashape.com/")
            .build();

    YodaService yodaService = retrofit.create(YodaService.class);

    String inputSentence = "I think I will never learn this java thing.";
    Call<ResponseBody> repos = yodaService.getAnswer(inputSentence);

    try {
      System.out.println(repos.execute().body().string());
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
