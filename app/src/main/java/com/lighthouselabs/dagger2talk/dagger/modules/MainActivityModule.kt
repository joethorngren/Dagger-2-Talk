package com.lighthouselabs.dagger2talk.dagger.modules

import com.afollestad.materialdialogs.MaterialDialog
import com.lighthouselabs.dagger2talk.MainActivity
import dagger.Module
import dagger.Provides

@Module
class MainActivityModule {

    @Provides
    fun provideDialogBuilder(activity: MainActivity): MaterialDialog.Builder {
        return MaterialDialog.Builder(activity)
    }

    @Provides
    fun provideFooBarPair(): Pair<String, String> {
        return Pair("Foo", "Bar")
    }
}