package com.tuts.prakash.retrofittutorial.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by praka on 12/24/2017.
 */

public class RetrofitClientInstance {

    private static Retrofit retrofit;


    public static Retrofit getRetrofitInstance( String _BASE_URL) {
        if (retrofit == null) {
            retrofit = new retrofit2.Retrofit.Builder()
                    .baseUrl(_BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
