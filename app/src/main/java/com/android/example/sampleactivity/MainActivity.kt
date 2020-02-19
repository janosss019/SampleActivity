package com.android.example.sampleactivity

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethod
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val submitBtn:Button = findViewById(R.id.button_submit)
        submitBtn.setOnClickListener(){
            submitName(it)
        }
    }


    private fun submitName(view:View){
        val givenName:EditText = findViewById(R.id.editText_id)
        val submitBtn:Button = findViewById(R.id.button_submit)
        val result: TextView = findViewById(R.id.name_label)

        givenName.visibility = View.GONE
        submitBtn.visibility =View.GONE
        result.text = givenName.text

        //to remove the keyboard after submitting
        val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(view.windowToken,0)


    }
}
