package com.example.valueget

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(){
    lateinit var etEmail:EditText
    lateinit var etSalary:EditText
    lateinit var btnSave:Button
    lateinit var tvGetName:TextView
    lateinit var tvGetSalary:TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etEmail=findViewById(R.id.etEmail)
        etSalary=findViewById(R.id.etSalary)
        btnSave=findViewById(R.id.btnSave)
        tvGetName=findViewById(R.id.tvGetName)
        tvGetSalary=findViewById(R.id.tvGetSalary)

        btnSave.setOnClickListener {
            if(etEmail.text.toString().isEmpty()){
                etEmail.error="Enter Email"
            }else if(etSalary.text.toString().isEmpty()){
                etSalary.error="Enter Salary"
            }
            else{
                tvGetName.setText(etEmail.text.toString())
                tvGetSalary.setText(etSalary.text.toString())
            }

        }

    }
}