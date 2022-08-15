package ca.lsuderman.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
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
        val txtDisplay = findViewById<TextView>(R.id.txtDisplay)

        var display = ""
        var equation = 0;
        var x = 0;
        var y = 0;

        btn0.setOnClickListener{
            display += "0"
            txtDisplay.setText(display)
        }

        btn1.setOnClickListener {
            display += "1"
            txtDisplay.setText(display)
        }

        btn2.setOnClickListener {
            display += "2"
            txtDisplay.setText(display)
        }

        btn3.setOnClickListener {
            display += "3"
            txtDisplay.setText(display)
        }

        btn4.setOnClickListener {
            display += "4"
            txtDisplay.setText(display)
        }

        btn5.setOnClickListener {
            display += "5"
            txtDisplay.setText(display)
        }

        btn6.setOnClickListener {
            display += "6"
            txtDisplay.setText(display)
        }

        btn7.setOnClickListener {
            display += "7"
            txtDisplay.setText(display)
        }

        btn8.setOnClickListener {
            display += "8"
            txtDisplay.setText(display)
        }

        btn9.setOnClickListener {
            display += "9"
            txtDisplay.setText(display)
        }
    }
}