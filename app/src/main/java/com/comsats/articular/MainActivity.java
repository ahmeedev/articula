package com.comsats.articular;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.hanks.htextview.base.HTextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);


        ImageView image=findViewById(R.id.splash_person);
        image.setImageResource(R.drawable.ic_splash_person);

        // set the animation to the main_title
        YoYo.with(Techniques.Wobble)
                .duration(1000)
                .repeat(3)
                .playOn(findViewById(R.id.splash_title_main));

        // set the animation to the slogan.
        HTextView text=findViewById(R.id.splash_text);
        text.animateText("A Place Where You Write Your Article.");



       // Toasty.error(this, "This is an error toast.", Toast.LENGTH_SHORT, true).show();

    }
} 