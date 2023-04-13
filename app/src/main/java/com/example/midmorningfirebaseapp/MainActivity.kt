package com.example.midmorningfirebaseapp

import android.app.ProgressDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var edtName:EditText
    lateinit var edtEmail:EditText
    lateinit var edtidNumber:EditText
    lateinit var btnsave:Button
    lateinit var btnview:Button
    lateinit var progressDialog: ProgressDialog
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        edtName = findViewById(R.id.mEdtName)
        edtEmail = findViewById(R.id.mEdtEmail)
        edtidNumber = findViewById(R.id.mEdtidNumber)
        btnsave = findViewById(R.id.mButtonSave)
        btnview = findViewById(R.id.mButtonView)
        progressDialog = ProgressDialog(this)
        progressDialog.setTitle("Saving")
        progressDialog.setMessage("Please wait")
        btnsave.setOnClickListener {

        }
        btnview.setOnClickListener {

        }
    }
}