package com.example.trainingplan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun connexion_fbk(view:View) {
        // bouchon
    }

    fun connexion_twitter(view: View) {
        // bouchon
    }

    fun valider(view: View) {
        // vérifier que le format de l'adresse est bien valide
        // vérifier que les deux champs ont bien été saisi
        // mettre les deux champs dans des préférences si se souvenir de moi a été sélectionné
        var intention = Intent(this, FormActivity::class.java)
        startActivity(intention)
    }

}
