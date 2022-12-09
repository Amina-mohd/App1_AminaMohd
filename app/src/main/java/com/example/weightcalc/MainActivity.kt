package com.example.weightcalc

import android.annotation.SuppressLint
import android.app.Dialog
import android.graphics.Color
import android.graphics.PorterDuff
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n", "MissingInflatedId", "InflateParams")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //creating array for the spinner items
        val dropdownlist = arrayOf("Mercury","Venus","Mars","Jupiter","Saturn","Uranus","Neptune")

        @Suppress("DEPRECATION")
        editTextNumber.background.setColorFilter(Color.WHITE, PorterDuff.Mode.SRC_ATOP) //to change the color of the Edit text holder

        //creating values
        val input = findViewById<EditText>(R.id.editTextNumber)
        val message = findViewById<TextView>(R.id.textView3)

        //creating adapter value for the view purpose
        val adapter = ArrayAdapter(this, R.layout.spinner_style, dropdownlist)
        //setting the adapter for view purpose
        adapter.setDropDownViewResource(R.layout.spinner_style)

        //creating values for buttons
        val b1 = findViewById<Button>(R.id.button1)
        val b2 = findViewById<Button>(R.id.button2)
        val b3 = findViewById<Button>(R.id.fact)

        //spinner
        planets_spinner.adapter = adapter
        planets_spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long)
            {
                if(planets_spinner.selectedItemPosition==0)
                {
                    merc()
                }
                if(planets_spinner.selectedItemPosition==1)
                {
                    ven()
                }
                if(planets_spinner.selectedItemPosition==2)
                {
                    mar()
                }
                if(planets_spinner.selectedItemPosition==3)
                {
                    jup()
                }
                if(planets_spinner.selectedItemPosition==4)
                {
                    sat()
                }
                if(planets_spinner.selectedItemPosition==5)
                {
                    uran()
                }
                if(planets_spinner.selectedItemPosition==6)
                {
                    nep()
                }
            }
        }
        b1.setOnClickListener{
            val weight = input.text.toString().toDouble()

            if(planets_spinner.selectedItemPosition==0)
            {
                val mercury = (weight / 9.81 * 3.7)
                answer.text = mercury.toString()
                message.text = "Your weight on " + planets_spinner.selectedItem
            }
            if(planets_spinner.selectedItemPosition==1)
            {
                val venus = (weight / 9.81 * 8.87)
                answer.text = venus.toString()
                message.text = "Your weight on " + planets_spinner.selectedItem
            }
            if(planets_spinner.selectedItemPosition==2)
            {
                val mars = (weight / 9.81 * 3.711)
                answer.text = mars.toString()
                message.text = "Your weight on " + planets_spinner.selectedItem
            }
            if(planets_spinner.selectedItemPosition==3)
            {
                val jupiter = (weight / 9.81 * 24.79)
                answer.text = jupiter.toString()
                message.text = "Your weight on " + planets_spinner.selectedItem
            }
            if(planets_spinner.selectedItemPosition==4)
            {
                val saturn = (weight / 9.81 * 10.44)
                answer.text = saturn.toString()
                message.text = "Your weight on " + planets_spinner.selectedItem
            }
            if(planets_spinner.selectedItemPosition==5)
            {
                val uranus = (weight / 9.81 * 8.69)
                answer.text = uranus.toString()
                message.text = "Your weight on " + planets_spinner.selectedItem
            }
            if(planets_spinner.selectedItemPosition==6)
            {
                val neptune = (weight / 9.81 * 11.15)
                answer.text = neptune.toString()
                message.text = "Your weight on " + planets_spinner.selectedItem
            }
        }
        b2.setOnClickListener {
            editTextNumber.setText("")
            answer.text = ""
            message.text = ""
        }
        b3.setOnClickListener {
            val dialogBinding = layoutInflater.inflate(R.layout.custom_dialogue, null)

            val myDialog = Dialog(this)
            myDialog.setContentView(dialogBinding)

            myDialog.setCancelable(true)
            myDialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            myDialog.show()

            //calling the id button okay and storing it in "yes" val
            val yes = dialogBinding.findViewById<Button>(R.id.okay)
            yes.setOnClickListener {
                myDialog.cancel()
            }
        }
    }
    private fun merc(){
        Toast.makeText(this, "Planet: " + planets_spinner.selectedItem, Toast.LENGTH_LONG).show()
    }
    private fun ven(){
        Toast.makeText(this, "Planet: " + planets_spinner.selectedItem, Toast.LENGTH_LONG).show()
    }
    private fun mar(){
        Toast.makeText(this, "Planet: " + planets_spinner.selectedItem, Toast.LENGTH_LONG).show()
    }
    private fun jup(){
        Toast.makeText(this, "Planet: " + planets_spinner.selectedItem, Toast.LENGTH_LONG).show()
    }
     private fun sat(){
        Toast.makeText(this, "Planet: " + planets_spinner.selectedItem, Toast.LENGTH_LONG).show()
    }
    private fun nep(){
        Toast.makeText(this, "Planet: " + planets_spinner.selectedItem, Toast.LENGTH_LONG).show()
    }
    private fun uran(){
        Toast.makeText(this, "Planet: " + planets_spinner.selectedItem, Toast.LENGTH_LONG).show()
    }
}