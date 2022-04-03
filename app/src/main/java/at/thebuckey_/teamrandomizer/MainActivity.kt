package at.thebuckey_.teamrandomizer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    fun switchToNames(view: View) {

        val intent = Intent(this, enterName::class.java).apply {};
        startActivity(intent)
    }
}