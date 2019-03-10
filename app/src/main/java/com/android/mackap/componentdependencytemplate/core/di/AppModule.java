package com.android.mackap.componentdependencytemplate.core.di;

import android.content.Context;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

/**
 * Created by Makarov on 09.03.2019
 */
@Module
public class AppModule {

  Context mContext;

  public AppModule(Context context) {
    mContext = context;
  }

  @Provides
  @Singleton
  Context provideContext() {
    return mContext;
  }
}
