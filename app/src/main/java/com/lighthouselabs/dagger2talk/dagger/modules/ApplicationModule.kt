package com.lighthouselabs.dagger2talk.dagger.modules

import android.content.Context
import com.lighthouselabs.dagger2talk.dagger.models.MyObject
import com.lighthouselabs.dagger2talk.dagger.scopes.ApplicationScoped
import com.lighthouselabs.dagger2talk.dagger.scopes.MyString
import com.lighthouselabs.dagger2talk.dagger.scopes.YourString
import dagger.Module
import dagger.Provides
import javax.annotation.concurrent.Immutable
import javax.inject.Singleton

@Module
class ApplicationModule {

    @Provides
    @Singleton
    fun provideFooString(): String {
        return "Foo!"
    }


    @Provides
    @MyString
    fun provideMyString(): String {
        return "My string!"
    }

    @Provides
    @YourString
    fun provideYourString(): String {

        return "Your string!"
    }

    @Provides
    fun provideMyObject(@MyString myString: String, @YourString yourString: String): MyObject {
        return MyObject(myString, yourString, 30)
    }
}