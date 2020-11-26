package com.project.first

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /**
         * git remote add origin git@git
         * git push -u origin master
         * git branch --set-upstream-to=origin/v1.1.0 v1.1.0
         */
    }
}