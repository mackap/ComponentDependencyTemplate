package com.android.mackap.componentdependencytemplate.first_feature;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.android.mackap.componentdependencytemplate.App;
import com.android.mackap.componentdependencytemplate.R;
import com.android.mackap.componentdependencytemplate.first_feature.FirstFeatureMVP.IFirstFeaturePresenter;
import javax.inject.Inject;

public class FirstFeatureActivity extends AppCompatActivity {

  private final String TAG = getClass().getSimpleName();
  @Inject
  IFirstFeaturePresenter mFirstFeaturePresenter;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    ((App) getApplication()).getFirsFeatureSubComp()
        .injectIntoFirstFeatureActivity(this);
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

  }
}
