package com.chandan.android.weatherapp.util;

import com.chandan.android.weatherapp.data.remote.RetrofitClient;
import com.chandan.android.weatherapp.data.remote.SOService;

/**
 * Created by CHANDAN on 7/31/2017.
 */

public class ApiUtils {

    public static final String BASE_URL = "http://samples.openweathermap.org/data/2.5/";

    public static SOService getSOService() {
        return RetrofitClient.getClient(BASE_URL).create(SOService.class);
    }
}
