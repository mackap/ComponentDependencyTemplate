package com.android.mackap.componentdependencytemplate.second_feature.di;

import com.android.mackap.componentdependencytemplate.core.ICoreModel;
import com.android.mackap.componentdependencytemplate.second_feature.SecondFeatureMVP.ISecondFeatureModel;
import com.android.mackap.componentdependencytemplate.second_feature.SecondFeatureModel;
import dagger.Module;
import dagger.Provides;
/**
 * Created by Makarov on 10.03.2019
 */
@Module
public class SecondFeatureModelModule {

  @Provides
  @SecondFeatureScope
  ISecondFeatureModel provideModel(ICoreModel coreModel){
    return new SecondFeatureModel(coreModel);
  }
}
