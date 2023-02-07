package edu.temple.inclassuiacvitivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.*
import android.widget.AdapterView.OnItemClickListener

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val spinner = findViewById<Spinner>(R.id.spinner)
        val displayTextView = findViewById<TextView>(R.id.textDisplay)

        /* Step 1: Populate this array */
        val numberArray = IntArray(100)

        for (i in 100 downTo 1) {
            numberArray[i - 1] = i

        }
        Log.d("Array values", numberArray[10].toString())

        /* Step 2: Create adapter to display items from array in Spinner */
        spinner.adapter = ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, numberArray.asList())

        // Step 3: Change TextView's text size to the number selected in the Spinner */
        spinner.onItemSelectedListener = object : AdapterView.OnItemClickListener,
            AdapterView.OnItemSelectedListener {
            override fun onItemClick(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                p0?.run {
                    displayTextView.textSize = getItemAtPosition(p2).toString().toFloat()
                }
            }

            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                TODO("Not yet implemented")
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {}

    }
}
        }
