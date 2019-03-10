package com.android.mackap.componentdependencytemplate.core.di;

import android.content.Context;
import android.content.SharedPreferences;
import com.android.mackap.componentdependencytemplate.core.ApiService;
import com.android.mackap.componentdependencytemplate.core.ICoreModel;
import dagger.Component;
import javax.inject.Singleton;


/**
 * Created by Makarov on 09.03.2019
 */
@Singleton
@Component(modules = {
    AppModule.class,
    CoreModelModule.class,
    NetModule.class,
    LocalModule.class})
public interface CoreComponent {

  Context context();

  SharedPreferences shaeredPreference();

  ApiService apiService();

  ICoreModel coreModel();
}
