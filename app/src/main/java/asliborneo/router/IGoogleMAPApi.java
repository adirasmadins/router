package asliborneo.router;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;



public interface IGoogleMAPApi
{
        @GET
        Call<String> getPath(@Url String url);
    }
