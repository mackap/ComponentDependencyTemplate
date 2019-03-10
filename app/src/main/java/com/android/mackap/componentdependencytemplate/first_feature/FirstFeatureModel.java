package com.android.mackap.componentdependencytemplate.first_feature;

import android.content.SharedPreferences;
import com.android.mackap.componentdependencytemplate.core.ApiService;
import com.android.mackap.componentdependencytemplate.core.ICoreModel;
import com.android.mackap.componentdependencytemplate.first_feature.FirstFeatureMVP.IFirstFeatureModel;
import javax.inject.Inject;
/**
 * Created by Makarov on 10.03.2019
 */
public class FirstFeatureModel implements IFirstFeatureModel {

  @Inject
  SharedPreferences mSharedPreferences;
  @Inject
  ApiService mApiService;
  @Inject
  ICoreModel mCoreModel;

  public FirstFeatureModel(
      SharedPreferences sharedPreferences,
      ApiService apiService,
      ICoreModel coreModel) {
    mSharedPreferences = sharedPreferences;
    mApiService = apiService;
    mCoreModel = coreModel;
  }


}
