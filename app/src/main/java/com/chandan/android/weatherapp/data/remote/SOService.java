package com.chandan.android.weatherapp.data.remote;

import com.chandan.android.weatherapp.data.model.WeatherResponse;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by CHANDAN on 7/31/2017.
 */

public interface SOService {

    @GET("weather?q=London,uk&appid=b1b15e88fa797225412429c1c50c122a1")
    Call<WeatherResponse> getAnswers();

    /*@GET("/weather?q=London,uk&appid=b1b15e88fa797225412429c1c50c122a1")
    Call<WeatherResponse> getAnswers();*/
}
