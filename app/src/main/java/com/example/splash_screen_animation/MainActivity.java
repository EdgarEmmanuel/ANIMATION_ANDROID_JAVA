package com.example.splash_screen_animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Animation Animation_left_to_right,Animation_right_to_left,Animation_top_to_bottom;
    ImageView imageView;
    TextView center_text, bottom_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // initialize all the view
        imageView = findViewById(R.id.imageView);
        center_text = findViewById(R.id.center_text);
        bottom_text = findViewById(R.id.bottom_text);

        // initialize the animations
        Animation_left_to_right = AnimationUtils.
                loadAnimation(this,R.anim.left_to_right);

        Animation_right_to_left = AnimationUtils.
                loadAnimation(this,R.anim.right_to_left);

        Animation_top_to_bottom = AnimationUtils.loadAnimation(this,R.anim.top_to_bottom);

        // set the animation to the view
        center_text.setAnimation(Animation_left_to_right);
        bottom_text.setAnimation(Animation_right_to_left);
        imageView.setAnimation(Animation_top_to_bottom);
    }
}