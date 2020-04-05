package com.example.trainingplan

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.DatePicker
import android.widget.EditText
import java.text.SimpleDateFormat
import java.time.Year
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var debutDuree: EditText
    private lateinit var finDuree: EditText
    private lateinit var myCalendar: Calendar
    private lateinit var dateDebut: DatePickerDialog.OnDateSetListener
    private lateinit var dateFin: DatePickerDialog.OnDateSetListener

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        debutDuree = findViewById(R.id.debutDuree)
        finDuree = findViewById(R.id.finDuree)
        myCalendar = Calendar.getInstance()

        dateDebut = object:DatePickerDialog.OnDateSetListener {
            override fun onDateSet(
                view: DatePicker, year: Int, monthOfYear: Int,
                dayOfMonth: Int
            ) {
                myCalendar.set(Calendar.YEAR, year)
                myCalendar.set(Calendar.MONTH, monthOfYear)
                myCalendar.set(Calendar.DAY_OF_MONTH, dayOfMonth)
                updateDate(debutDuree)
            }
        }

        dateFin =object:DatePickerDialog.OnDateSetListener {
            override fun onDateSet(
                view: DatePicker, year: Int, monthOfYear: Int,
                dayOfMonth: Int
            ) {
                myCalendar.set(Calendar.YEAR, year)
                myCalendar.set(Calendar.MONTH, monthOfYear)
                myCalendar.set(Calendar.DAY_OF_MONTH, dayOfMonth)
                updateDate(finDuree)
            }
        }
    }

    /**
     * Permet d'afficher le calendrier
     * lors du clic sur l'image du calendrier
     * pour saisir le début de la durée du planning
     */
    fun afficherCalendrierDebut(view: View) {
        afficherCalendrier(debutDuree)
    }

    /**
     * Permet d'afficher le calendrier
     * lors du clic sur l'image du calendrier
     * pour saisir la fin de la durée du planning
     */
    fun afficherCalendrierFin(view: View) {
        afficherCalendrier(finDuree)
    }

    private fun afficherCalendrier(periodeChoisie: EditText) {
        var date = dateFin

        if (periodeChoisie == debutDuree) {
            date = dateDebut
        }

        DatePickerDialog(this,
            date,
            myCalendar.get(Calendar.YEAR),
            myCalendar.get(Calendar.MONTH),
            myCalendar.get(Calendar.DAY_OF_MONTH)).show()
    }

    private fun updateDate(periodeChoisie: EditText) {
        val myFormat = "dd/MM/yy";
        var formatDate = SimpleDateFormat(myFormat, Locale.FRENCH)

        periodeChoisie.setText(formatDate.format(myCalendar.time))
    }
}
