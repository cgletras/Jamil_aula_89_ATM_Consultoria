package com.example.jamil_aula_89_atm_consultoria

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var button: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_cliente.setOnClickListener {
           val intent = Intent(this, DetalhesCliente::class.java)
            startActivity(intent)
        }

        button_servicos.setOnClickListener {
            val intent = Intent(this, DetalhesServicos::class.java)
            startActivity(intent)
        }
        button2.setOnClickListener {
            val intent = Intent(this, DetalhesEmpresa::class.java)
            startActivity(intent)
        }

        button4.setOnClickListener {
            val intent = Intent(this, DetalhesContato::class.java)
            startActivity(intent)
        }
    }



}
