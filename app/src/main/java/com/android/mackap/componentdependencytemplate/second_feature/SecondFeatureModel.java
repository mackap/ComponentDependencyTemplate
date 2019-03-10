package com.android.mackap.componentdependencytemplate.second_feature;

import com.android.mackap.componentdependencytemplate.core.ICoreModel;
import com.android.mackap.componentdependencytemplate.second_feature.SecondFeatureMVP.ISecondFeatureModel;
import javax.inject.Inject;
/**
 * Created by Makarov on 10.03.2019
 */
public class SecondFeatureModel implements ISecondFeatureModel {

  @Inject
  ICoreModel mCoreModel;

  public SecondFeatureModel(ICoreModel coreModel){
    mCoreModel = coreModel;
  }


}
