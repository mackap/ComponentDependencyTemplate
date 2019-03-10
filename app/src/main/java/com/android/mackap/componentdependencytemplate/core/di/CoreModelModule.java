package com.android.mackap.componentdependencytemplate.core.di;

import com.android.mackap.componentdependencytemplate.core.CoreModel;
import com.android.mackap.componentdependencytemplate.core.ICoreModel;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

/**
 * Created by Makarov on 09.03.2019
 */
@Module
public class CoreModelModule {

  @Provides
  @Singleton
  public ICoreModel provideBaseModel() {
    return new CoreModel();
  }
}
