package com.android.mackap.componentdependencytemplate.second_feature.di;

import com.android.mackap.componentdependencytemplate.second_feature.SecondFeatureMVP.ISecondFeatureModel;
import com.android.mackap.componentdependencytemplate.second_feature.SecondFeatureMVP.ISecondFeaturePresenter;
import com.android.mackap.componentdependencytemplate.second_feature.SecondFeaturePresenter;
import dagger.Module;
import dagger.Provides;
/**
 * Created by Makarov on 10.03.2019
 */
@Module
public class SecondFeaturePresenterModule {

  @Provides
  @SecondFeatureScope
  ISecondFeaturePresenter provideSecondFeaturePresenter(ISecondFeatureModel secondFeatureModel){
    return new SecondFeaturePresenter(secondFeatureModel);
  }

}
