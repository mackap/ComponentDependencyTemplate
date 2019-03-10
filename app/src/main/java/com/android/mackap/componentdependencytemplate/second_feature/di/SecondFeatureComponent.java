package com.android.mackap.componentdependencytemplate.second_feature.di;

import com.android.mackap.componentdependencytemplate.core.di.CoreComponent;
import com.android.mackap.componentdependencytemplate.second_feature.SecondFeatureActivity;
import dagger.Component;


/**
 * Created by Makarov on 10.03.2019
 */
@SecondFeatureScope
@Component(dependencies = CoreComponent.class,
modules = {SecondFeatureModelModule.class, SecondFeaturePresenterModule.class})
public interface SecondFeatureComponent {
void injectInto(SecondFeatureActivity secondFeatureActivity);
}
