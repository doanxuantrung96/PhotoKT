
package com.afollestad.photoaffix.di

import com.afollestad.photoaffix.engine.photos.PhotoLoader
import com.afollestad.photoaffix.engine.photos.RealPhotoLoader
import com.afollestad.photoaffix.presenters.MainPresenter
import com.afollestad.photoaffix.presenters.RealMainPresenter
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
abstract class AppBindModule {

  @Binds
  @Singleton
  abstract fun providePhotoLoader(realPhotoLoader: RealPhotoLoader): PhotoLoader

  @Binds
  @Singleton
  abstract fun provideMainPresenter(presenter: RealMainPresenter): MainPresenter
}
