package com.codepath.debuggingchallenges.activities;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.QuickContactBadge;
import android.util.Log;


import com.codepath.debuggingchallenges.R;

public class ChangeBackgroundActivity extends AppCompatActivity  {


    private int oldColor = Color.BLUE;
    Button btnGo;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_background);
        //context =
        //btnGo = findViewById(R.id.btnGo);
        //btnGo.setOnClickListener(onGoClick());
//        btnGo.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Log.i("tag", "button was clicked");
//                View mainView = findViewById(android.R.id.content);
//                mainView.setBackgroundColor(getNextColor());
//            }
//        });
    }

    public void onGoClick(View view) {
        Log.i("tag", "button was clicked");
        View mainView = findViewById(android.R.id.content);
        mainView.setBackgroundColor(getNextColor());
    }

    private int getNextColor() {
        int newColor = (oldColor == Color.BLUE) ? Color.RED : Color.BLUE;
        oldColor = newColor;
        return newColor;
    }


}

// android:onClick="onGoClick"
