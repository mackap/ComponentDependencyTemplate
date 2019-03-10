package com.android.mackap.componentdependencytemplate.second_feature;

import com.android.mackap.componentdependencytemplate.second_feature.SecondFeatureMVP.ISecondFeatureModel;
import com.android.mackap.componentdependencytemplate.second_feature.SecondFeatureMVP.ISecondFeaturePresenter;
import javax.inject.Inject;
/**
 * Created by Makarov on 10.03.2019
 */
public class SecondFeaturePresenter implements ISecondFeaturePresenter {
@Inject
ISecondFeatureModel mSecondFeatureModel;

  public SecondFeaturePresenter(ISecondFeatureModel secondFeatureModel){
    mSecondFeatureModel = secondFeatureModel;
  }


}
