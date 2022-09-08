package com.example.getpicturerxjava

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.getpicturerxjava.presentations.MainFragment
import com.example.getpicturerxjava.utils.navigateToFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager
            .navigateToFragment(fragment = MainFragment())
    }
}