package com.android.mackap.componentdependencytemplate.first_feature.di;

import com.android.mackap.componentdependencytemplate.core.di.CoreComponent;
import com.android.mackap.componentdependencytemplate.first_feature.FirstFeatureActivity;
import dagger.Component;
/**
 * Created by Makarov on 09.03.2019
 */
@Component(
    dependencies = CoreComponent.class,
    modules = {FirstModelModule.class, FirstFeaturePresenterModule.class})
@FirsFeatureScope
public interface FirsFeatureComponent {
void injectIntoFirstFeatureActivity(FirstFeatureActivity firstFeatureActivity);
}
