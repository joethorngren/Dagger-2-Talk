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

    @Provides
    fun provideInt(): Int {
        return 5
    }

    @Provides
    fun provideDouble(): Double {
        return 1.3
    }

    @Provides
    fun provideChar(): Char {
        return 'c'
    }

    @Provides
    fun provideIntDoublePair(int: Int, double: Double): Pair<Int, Double> {
        return Pair(int, double)
    }

    @Provides
    fun provideIntCharPair(int: Int, char: Char): Pair<Int, Char> {
        return Pair(int, char)
    }
}