package com.android.mackap.componentdependencytemplate.core.di;

import android.content.Context;
import android.content.SharedPreferences;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

/**
 * Created by Makarov on 09.03.2019
 */
@Module
public class LocalModule {

  @Provides
  @Singleton
  SharedPreferences provideSharedPref(Context context) {
    return context.getSharedPreferences("shared_pref_key", Context.MODE_PRIVATE);

  }

}
