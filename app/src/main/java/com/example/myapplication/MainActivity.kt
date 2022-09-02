

package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val imageView = findViewById<ImageView>(R.id.imageView2);
        val button = findViewById<Button>(R.id.button);
        var widocznosc = 0;
        button.setOnClickListener(){
            if (widocznosc == 1){
                 imageView.setImageResource(R.drawable.ic_launcher_background)
                widocznosc = 0;
            }
            else{
                imageView.setImageResource(R.drawable.ic_launcher_foreground);
                widocznosc = 1;
            }
        }

    }
}