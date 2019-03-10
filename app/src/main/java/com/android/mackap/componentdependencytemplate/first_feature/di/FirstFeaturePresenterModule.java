package com.android.mackap.componentdependencytemplate.first_feature.di;

import com.android.mackap.componentdependencytemplate.first_feature.FirstFeatureMVP.IFirstFeatureModel;
import com.android.mackap.componentdependencytemplate.first_feature.FirstFeatureMVP.IFirstFeaturePresenter;
import com.android.mackap.componentdependencytemplate.first_feature.FirstFeaturePresenter;
import dagger.Module;
import dagger.Provides;

/**
 * Created by Makarov on 09.03.2019
 */
@Module
public class FirstFeaturePresenterModule {


  @Provides
  @FirsFeatureScope
  public IFirstFeaturePresenter provideFirstFeaturePresenter(
      IFirstFeatureModel iFirstFeatureModel) {
    return new FirstFeaturePresenter(iFirstFeatureModel);
  }
}
