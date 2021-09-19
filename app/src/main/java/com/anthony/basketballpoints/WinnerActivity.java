package com.anthony.basketballpoints;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class WinnerActivity extends AppCompatActivity {

    TextView mWt,mTAS,mTBS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_winner);

        mWt = findViewById(R.id.winteam);
        mTAS = findViewById(R.id.teamascore);
        mTBS = findViewById(R.id.teambscore);

        Intent intent = getIntent();

        mWt.setText(intent.getStringExtra("win"));
        mTAS.setText(intent.getStringExtra("ascore"));
        mTBS.setText(intent.getStringExtra("bscore"));

    }

}