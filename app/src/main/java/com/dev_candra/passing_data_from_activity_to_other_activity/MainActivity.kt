package com.dev_candra.passing_data_from_activity_to_other_activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Aksi()

    }

    private fun Aksi(){
        val btnSave = findViewById<Button>(R.id.bnt_save)

         btnSave.setOnClickListener {
             sendDataToActivity()
         }
         initialActionBar()
    }

    private fun sendDataToActivity(){

        val editNama = findViewById<EditText>(R.id.editnama)
        val editEmail = findViewById<EditText>(R.id.editemail)
        val editPassword = findViewById<EditText>(R.id.editpassword)

        val namaKirim = editNama.text.toString().toLowerCase()
        val emailKirim = editEmail.text.toString().toLowerCase()
        val passwordKirim = editPassword.text.toString().toLowerCase()

        val kirim = Intent(this@MainActivity,new_activity::class.java)
        kirim.putExtra("nama",namaKirim)
        kirim.putExtra("email",emailKirim)
        kirim.putExtra("password",passwordKirim)
        startActivity(kirim)
    }

    private fun initialActionBar(){
        val actionbar = supportActionBar
        if (actionbar != null){
            actionbar.title = "Candra Julius Sinaga"
            actionbar.subtitle = "Home Activity"
        }
    }
}
