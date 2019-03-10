package com.android.mackap.componentdependencytemplate.first_feature;

import com.android.mackap.componentdependencytemplate.first_feature.FirstFeatureMVP.IFirstFeatureModel;
import com.android.mackap.componentdependencytemplate.first_feature.FirstFeatureMVP.IFirstFeaturePresenter;
import javax.inject.Inject;

/**
 * Created by Makarov on 10.03.2019
 */
public class FirstFeaturePresenter implements IFirstFeaturePresenter {
private final String TAG = getClass().getSimpleName();
  @Inject
  IFirstFeatureModel mFirstFeatureModel;

  public FirstFeaturePresenter(IFirstFeatureModel firstFeatureModel) {
    mFirstFeatureModel = firstFeatureModel;
  }

}
