package com.example.getpicturerxjava.utils

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.getpicturerxjava.R

fun FragmentManager.navigateToFragment(fragment: Fragment) {
    this.beginTransaction().replace(R.id.fragmentContainer, fragment).commit()
}