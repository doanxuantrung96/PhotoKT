
package com.afollestad.photoaffix.animation

import android.animation.Animator
import android.view.View
import android.view.View.GONE


class ViewHideAnimationListener(private val view: View) : Animator.AnimatorListener {

  override fun onAnimationStart(animation: Animator) = Unit

  override fun onAnimationEnd(animation: Animator) {
    view.visibility = GONE
  }

  override fun onAnimationCancel(animation: Animator) = Unit

  override fun onAnimationRepeat(animation: Animator) = Unit
}
