package com.lighthouselabs.dagger2talk.dagger.modules

import dagger.Module
import dagger.Provides

@Module
class ApplicationModule {

    @Provides
    fun provideFooString(): String {
        return "Foo!"
    }
}