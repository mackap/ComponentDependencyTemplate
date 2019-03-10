package com.android.mackap.componentdependencytemplate.second_feature;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.android.mackap.componentdependencytemplate.App;
import com.android.mackap.componentdependencytemplate.R;
import com.android.mackap.componentdependencytemplate.second_feature.SecondFeatureMVP.ISecondFeaturePresenter;
import javax.inject.Inject;

public class SecondFeatureActivity extends AppCompatActivity {
private final String TAG = getClass().getSimpleName();
  @Inject
  ISecondFeaturePresenter mSecondFeaturePresenter;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    ((App)getApplication()).getSecondFeatureComponent().injectInto(this);
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_second_feature);

  }
}
