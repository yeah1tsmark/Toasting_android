package com.example.toastingapp_mark

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    //giving it another name i.e instantiate
    private lateinit var displaytxt: TextView
    private lateinit var edtinputdata: EditText
    private lateinit var submitbutton: Button
    private lateinit var btntwo: Button
    private lateinit var btnthree: Button





    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        displaytxt = findViewById(R.id.txtdisplay)
        edtinputdata= findViewById(R.id.edtdata)
        submitbutton = findViewById(R.id.btnsubmit)
        btntwo = findViewById(R.id.btnsubmit2)
        btnthree = findViewById(R.id.btnsubmit3)

        submitbutton.setOnClickListener {
            //grab info from edit text
            var userdata=edtinputdata.text.toString().trim()

            displaytxt.text = userdata.toString()
            //Toast.makeText(this, user_data, Toast.LENGTH_SHORT).show()
        }
        btntwo.setOnClickListener {
            Toast.makeText(this, "Clicked the second button", Toast.LENGTH_SHORT).show()
        }

        btnthree.setOnClickListener {
            Toast.makeText(this, "3rd toast button", Toast.LENGTH_SHORT).show()
        }

        }

}