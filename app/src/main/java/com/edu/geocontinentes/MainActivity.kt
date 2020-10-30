package com.edu.geocontinentes

import android.content.Intent
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Cont_N_Am = findViewById(R.id.ContinentesFragmentNortheAmerica) as ImageView
        Cont_N_Am.setOnClickListener {
         //   Toast.makeText(this@MainActivity, "you clickd ImageView", Toast.LENGTH_SHORT).show()
            val intento = Intent(this, SubmenuAsia::class.java)
            startActivity(intento)
            val animZoomIn = AnimationUtils.loadAnimation(this, R.anim.zoom_back_in)
            textViewTitulo.startAnimation(animZoomIn);
        }

        val Cont_S_Am = findViewById(R.id.ContinentesFragmentSourthAmerica) as ImageView
        Cont_S_Am.setOnClickListener {
            val animZoomIn = AnimationUtils.loadAnimation(this, R.anim.fade_in)
            textViewTitulo.startAnimation(animZoomIn)

        }



    }


}