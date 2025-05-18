package com.jetbrains.icecream;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;

import java.io.IOException;

public class OpenMeteoService {
    private static final String ENDPOINT_URL = "https://api.open-meteo.com/v1/forecast";

    private final OkHttpClient client = new OkHttpClient();

    private final Moshi moshi = new Moshi.Builder().build();

    private final JsonAdapter<OpenMeteoResponse> responseAdapter = moshi.adapter(OpenMeteoResponse.class);

    public OpenMeteoResponse getCurrent() {
        try {
            var url = HttpUrl.parse(ENDPOINT_URL)
                             .newBuilder()
                             .addQueryParameter("latitude", "48.1482")
                             .addQueryParameter("longitude", "17.1067")
                             .addQueryParameter("current", "temperature_2m,precipitation,wind_speed_10m")
                             .build();

            var request = new Request.Builder()
                    .url(url)
                    .build();

            try (var response = client.newCall(request).execute()) {
                if (!response.isSuccessful()) {
                    throw new IOException("Unsuccessful response: " + response);
                }
                var body = response.body();
                if (body == null) {
                    throw new IOException("Response does not contain any body: " + response);
                }
                return responseAdapter.fromJson(response.body().source());
            }

        } catch (IOException e) {
            //TODO improve error handling
            e.printStackTrace();
            return null;
        }
    }
}
