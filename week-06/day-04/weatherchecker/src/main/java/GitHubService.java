import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface GitHubService {

  @Headers({
          "X-Mashape-Key : b2mYQn0l6hmshilPX7xdrLMzyezOp1gmarrjsnIzyGUQSGj7P6",
          "Accept: application/json"
  })

  static void main(String[] args) {
    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://api.github.com/")
            .build();

    GitHubService service = retrofit.create(GitHubService.class);

    Call<ResponseBody> repos = service.listRepos("octocat");

    try {
      System.out.println(repos.execute().body().string());
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  @GET("users/{user}/repos")
  Call<ResponseBody> listRepos(@Path("user") String user);


  @GET("yoda")
  Call<ResponseBody> getLine(@Query("sentence") String text);
