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

    /**
     * Permet de se connecter via facebook
     */
    fun connexion_fbk(view:View) {
        // bouchon
    }

    /**
     * Permet de se connecter via twitter
     */
    fun connexion_twitter(view: View) {
        // bouchon
    }

    /**
     * Redirige vers le lient pour récupérer
     * son mot de passe
     */
    fun recupererMDP(view : View) {
        // bouchon
    }

    /**
     * Permet de valider l'authentification
     */
    fun valider(view: View) {
        // vérifier que le format de l'adresse est bien valide
        // vérifier que les deux champs ont bien été saisi
        // mettre les deux champs dans des préférences si se souvenir de moi a été sélectionné
        val intention = Intent(this, FormActivity::class.java)
        startActivity(intention)
    }

    /**
     * Redirige vers le lien pour créer un compte
     */
    fun creation_compte(view: View) {
        // bouchon
    }

}
