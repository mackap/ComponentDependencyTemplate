package com.android.mackap.componentdependencytemplate.core.di;


import static com.android.mackap.componentdependencytemplate.core.ApiService.BASE_URL;

import com.android.mackap.componentdependencytemplate.BuildConfig;
import com.android.mackap.componentdependencytemplate.core.ApiService;
import dagger.Module;
import dagger.Provides;
import java.util.concurrent.TimeUnit;
import javax.inject.Singleton;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Makarov on 09.03.2019
 */
@Module
public class NetModule {


  @Provides
  @Singleton
  public ApiService provideApiService(Retrofit restAdapter) {
    return restAdapter.create(ApiService.class);
  }

  @Provides
  @Singleton
  public OkHttpClient provideOkHttpClient(HttpLoggingInterceptor httpLoggingInterceptor) {
    final OkHttpClient.Builder builder = new OkHttpClient.Builder();
    builder.addInterceptor(httpLoggingInterceptor)
        .connectTimeout(60 * 1000, TimeUnit.MILLISECONDS)
        .readTimeout(60 * 1000, TimeUnit.MILLISECONDS);

    return builder.build();
  }

  @Provides
  @Singleton
  public HttpLoggingInterceptor provideHttpLoggingInterceptor() {
    HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
    logging.setLevel(BuildConfig.DEBUG ? HttpLoggingInterceptor.Level.BODY : HttpLoggingInterceptor.Level.NONE);
    return logging;
  }

  @Provides
  @Singleton
  public Retrofit provideRetrofit(OkHttpClient okHttpClient) {
    Retrofit.Builder builder = new Retrofit.Builder();
    builder.client(okHttpClient)
        .baseUrl(BASE_URL)
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .addConverterFactory(GsonConverterFactory.create());
    return builder.build();
  }
}
