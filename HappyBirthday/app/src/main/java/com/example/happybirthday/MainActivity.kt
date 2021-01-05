package com.example.happybirthday

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun CreateBirthdayCard(view: View) {

        val name=NameInput.editableText.toString()

        Toast.makeText( this,"Name is $name", Toast.LENGTH_SHORT).show()

        val intent = Intent(this,BirthdayGreeting::class.java)
        intent.putExtra(BirthdayGreeting.NAME_EXTRA, name)

        startActivity(intent)

    }


}



