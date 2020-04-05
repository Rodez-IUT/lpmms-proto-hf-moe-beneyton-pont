package com.example.trainingplan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton

class MainActivity : AppCompatActivity() {

    private lateinit var souvenir:RadioButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        souvenir = findViewById(R.id.rb_souvenir)
    }

    /**
     * Permet de cocher ou de décocher le bouton
     * " se souvenir de moi "
     */
    fun decocher(view: View) {

    }

}
