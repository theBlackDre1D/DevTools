package co.init.common.extensions

import android.view.View

fun Boolean?.safe(): Boolean = this == true

fun Boolean.toVisibleGone() = if (this) {
    View.VISIBLE
} else {
    View.GONE
}