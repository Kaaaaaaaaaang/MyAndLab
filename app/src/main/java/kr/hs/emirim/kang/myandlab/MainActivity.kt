package kr.hs.emirim.kang.myandlab

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    lateinit var mbutton1 : Button
    lateinit var mbutton2 : Button
    lateinit var mProfile : ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mProfile = findViewById(R.id.profile)
        mbutton1 = findViewById(R.id.btnfour_button)
        mbutton2 = findViewById(R.id.btnfour_button2)

        mbutton1.setOnClickListener{
            startActivity(Intent(this, FourbuttonActivity::class.java))
        }
        mbutton2.setOnClickListener{
            val intent = Intent(this, Fourbutton2Activity::class.java)
            startActivity(intent)
        }
    }
}