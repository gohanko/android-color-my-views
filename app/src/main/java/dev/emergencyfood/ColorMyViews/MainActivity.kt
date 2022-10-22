package dev.emergencyfood.ColorMyViews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.R.layout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners();
    }

    private fun setListeners() {
        val clickableViews: List<View> = listOf(
            findViewById(R.id.color_box_0),
            findViewById(R.id.color_box_1),
            findViewById(R.id.color_box_2),
            findViewById(R.id.color_box_3),
            findViewById(R.id.color_box_4)
        );

        for (item in clickableViews) {
            item.setOnClickListener { changeColours(it) }
        }
    }

    private fun changeColours(view: View) {
        when (view.id) {
            R.id.color_box_0 -> view.setBackgroundColor(Color.DKGRAY);
            R.id.color_box_1 -> view.setBackgroundColor(Color.GRAY);

            R.id.color_box_2 -> view.setBackgroundResource(android.R.color.holo_blue_bright);
            R.id.color_box_3 -> view.setBackgroundResource(android.R.color.holo_blue_light);
            R.id.color_box_4 -> view.setBackgroundResource(android.R.color.holo_green_light);

            else -> view.setBackgroundColor(Color.LTGRAY);
        }
    }
}