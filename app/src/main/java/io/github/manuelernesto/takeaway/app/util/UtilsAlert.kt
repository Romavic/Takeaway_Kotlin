package io.github.manuelernesto.takeaway.app.util

import android.content.Context
import android.view.Gravity
import android.view.View
import android.widget.Toast

fun Context.toast(message: CharSequence) {
    val toast = Toast.makeText(this, message, Toast.LENGTH_SHORT)
    toast.setGravity(Gravity.CENTER, 0, 0)
    toast.show()
}

fun View.show() {
    this.visibility = View.VISIBLE
}

fun View.gone() {
    this.visibility = View.GONE
}




