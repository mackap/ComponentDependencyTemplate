package com.android.mackap.componentdependencytemplate.first_feature.di;

import android.content.SharedPreferences;
import com.android.mackap.componentdependencytemplate.core.ApiService;
import com.android.mackap.componentdependencytemplate.core.ICoreModel;
import com.android.mackap.componentdependencytemplate.first_feature.FirstFeatureMVP.IFirstFeatureModel;
import com.android.mackap.componentdependencytemplate.first_feature.FirstFeatureModel;
import dagger.Module;
import dagger.Provides;
/**
 * Created by Makarov on 09.03.2019
 */
@Module
public class FirstModelModule  {

  @Provides
  IFirstFeatureModel provideFirstModel(SharedPreferences sharedPreferences,
      ApiService apiService,
      ICoreModel coreModel) {
    return new FirstFeatureModel(sharedPreferences, apiService, coreModel);
  }

}
