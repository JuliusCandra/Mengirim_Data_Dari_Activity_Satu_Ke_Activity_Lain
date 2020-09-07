package com.dev_candra.passing_data_from_activity_to_other_activity

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class new_activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.new_activity_layout)
        Aksi()
    }

    private fun Aksi(){
        val txtNama = findViewById<TextView>(R.id.textnama)
        val txtEmail = findViewById<TextView>(R.id.textemail)
        val txtPassword = findViewById<TextView>(R.id.textpassword)

        val intent = intent
        val nama1 = intent.getStringExtra("nama")
        val email1 = intent.getStringExtra("email")
        val password1 = intent.getStringExtra("password")

        txtNama.text = nama1
        txtEmail.text = email1
        txtPassword.text = password1

        initalActionBar()
    }


    private fun initalActionBar(){
        val actionbar = supportActionBar
        if  (actionbar != null){
            actionbar.title = "Candra Julius Sinaga"
            actionbar.subtitle = "Detail Activity"
            actionbar.setDisplayShowHomeEnabled(true)
            actionbar.setDisplayHomeAsUpEnabled(true)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}