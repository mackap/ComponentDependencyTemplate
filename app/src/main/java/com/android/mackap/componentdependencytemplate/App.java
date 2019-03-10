package com.android.mackap.componentdependencytemplate;


import android.app.Application;
import android.util.Log;
import com.android.mackap.componentdependencytemplate.core.di.AppModule;
import com.android.mackap.componentdependencytemplate.core.di.CoreComponent;
import com.android.mackap.componentdependencytemplate.core.di.DaggerCoreComponent;
import com.android.mackap.componentdependencytemplate.first_feature.di.DaggerFirsFeatureComponent;
import com.android.mackap.componentdependencytemplate.first_feature.di.FirsFeatureComponent;
import com.android.mackap.componentdependencytemplate.second_feature.di.DaggerSecondFeatureComponent;
import com.android.mackap.componentdependencytemplate.second_feature.di.SecondFeatureComponent;


public class App extends Application {

  CoreComponent mCoreComponent;
  FirsFeatureComponent mFirsFeatureSubComp;
  SecondFeatureComponent mSecondFeatureComponent;

  @Override
  public void onCreate() {
    super.onCreate();
    Log.d("APP", "OnCreate");
    mCoreComponent = DaggerCoreComponent.builder()
        .appModule(new AppModule(this)).build();

  }


  public FirsFeatureComponent getFirsFeatureSubComp() {
    if (mFirsFeatureSubComp == null) {
      mFirsFeatureSubComp = DaggerFirsFeatureComponent.builder()
          .coreComponent(mCoreComponent)
          .build();
    }
    return mFirsFeatureSubComp;
  }

  public SecondFeatureComponent getSecondFeatureComponent() {
    if (mSecondFeatureComponent == null) {
      mSecondFeatureComponent = DaggerSecondFeatureComponent.builder()
          .coreComponent(mCoreComponent)
          .build();
    }
    return mSecondFeatureComponent;
  }
}
