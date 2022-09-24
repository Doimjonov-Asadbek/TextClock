package app.test.textclock

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextClock

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val clock = findViewById<TextClock>(R.id.textClock)
        clock.format12Hour = "hh:mm:ss a"
        clock.format24Hour = "HH:mm:ss"

    }
}