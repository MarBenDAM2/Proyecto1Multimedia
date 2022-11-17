package com.example.proyecto1multimedia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.widget.ActivityChooserView
import com.example.proyecto1multimedia.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var onCreate = 0
    private var onStart = 1
    private var onResume = 2
    private var onPause = 3
    private var onStop = 4
    private var onDestroy = 5
    private var onRestart = 6
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        //Esto hay que ponerlo tanto en ViewBinding como en ViewId
        setContentView(R.layout.activity_main)
        println("onCreate $onCreate")

        /*  Metodo findviewbyid
        *   nombre=findViewById(R.id.editTextTextPersonName)
        *   apellido=findViewById(R.id.editTextTextPersonName2)
        */
    }

    override fun onStart() {
        super.onStart()
        println("onStart $onStart")
    }

    override fun onResume() {
        super.onResume()
        println("onResume $onResume")
    }

    override fun onPause() {
        super.onPause()
        println("onPause $onPause")
    }
    override fun onStop() {
        super.onStop()
        println("onStop $onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("onDestroy $onDestroy")
    }
    override fun onRestart() {
        super.onRestart()
        println("onRestart $onRestart")
    }

    override fun onSaveInstanceState(savedInstanceState: Bundle) {
        super.onSaveInstanceState(savedInstanceState)
        binding.editTextTextPersonName.text.toString()
        binding.editTextTextPersonName2.text.toString()

        /* Metodo findviewbyid
        *  savedInstanceState.putString("nombre", nombre.text.toString())
        *  savedInstanceState.putString("apellido", apellido.text.toString())
        */

    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)

        //Metodo binding
        binding.editTextTextPersonName.setText(savedInstanceState.getString("nombre"))
        binding.editTextTextPersonName2.setText(savedInstanceState.getString("apellido"))

        /* Metodo con findviewbyid
        * nombre.setText(savedInstanceState.getString("nombre"))
        * apellido.setText(savedInstanceState.getString("apellido"))
        */


    }
}