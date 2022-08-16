package ca.lsuderman.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private var display = ""
    private var x = 0
    private var y = 0
    private var txtDisplay:TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn0 = findViewById<Button>(R.id.btn0)
        val btn1 = findViewById<Button>(R.id.btn1)
        val btn2 = findViewById<Button>(R.id.btn2)
        val btn3 = findViewById<Button>(R.id.btn3)
        val btn4 = findViewById<Button>(R.id.btn4)
        val btn5 = findViewById<Button>(R.id.btn5)
        val btn6 = findViewById<Button>(R.id.btn6)
        val btn7 = findViewById<Button>(R.id.btn7)
        val btn8 = findViewById<Button>(R.id.btn8)
        val btn9 = findViewById<Button>(R.id.btn9)
        val btnAdd = findViewById<Button>(R.id.btnAdd)
        val btnSubtract = findViewById<Button>(R.id.btnSubtract)
        val btnMultiply = findViewById<Button>(R.id.btnMultiply)
        val btnDivide = findViewById<Button>(R.id.btnDivide)
        val btnDecimal = findViewById<Button>(R.id.btnDecimal)
        val btnNegative = findViewById<Button>(R.id.btnNegative)
        val btnEquals = findViewById<Button>(R.id.btnEquals)
        txtDisplay = findViewById(R.id.txtDisplay)

        btn0.setOnClickListener(this)
        btn1.setOnClickListener(this)
        btn2.setOnClickListener(this)
        btn3.setOnClickListener(this)
        btn4.setOnClickListener(this)
        btn5.setOnClickListener(this)
        btn6.setOnClickListener(this)
        btn7.setOnClickListener(this)
        btn8.setOnClickListener(this)
        btn9.setOnClickListener(this)
        btnAdd.setOnClickListener(this)
        btnSubtract.setOnClickListener(this)
        btnMultiply.setOnClickListener(this)
        btnDecimal.setOnClickListener(this)
        btnDivide.setOnClickListener(this)
        btnNegative.setOnClickListener(this)
        btnEquals.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        when (view!!.id){
            R.id.btn0-> display += "0"
            R.id.btn1-> display += "1"
            R.id.btn2-> display += "2"
            R.id.btn3-> display += "3"
            R.id.btn4-> display += "4"
            R.id.btn5-> display += "5"
            R.id.btn6-> display += "6"
            R.id.btn7-> display += "7"
            R.id.btn8-> display += "8"
            R.id.btn9-> display += "9"
            R.id.btnNegative->
                if(x > 0) {
                    display = "-$display"
                } else {
                    display = display.drop(0)
                }


        }
        x = display.toInt()
        txtDisplay!!.text = display
    }
}