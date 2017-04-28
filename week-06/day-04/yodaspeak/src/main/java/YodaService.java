import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface YodaService {


  @Headers({
          "X-Mashape-Key: b2mYQn0l6hmshilPX7xdrLMzyezOp1gmarrjsnIzyGUQSGj7P6",
          "Accept: text/plain"
  })

  @GET("yoda")
  Call<ResponseBody> getAnswer(@Query("sentence") String inputSentence);


}