package com.anthony.basketballpoints;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    AppCompatButton mTA3, mTB3, mTA2, mTB2, mTA1, mTB1, mReset;
    TextView mTAS, mTBS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTA1 = findViewById(R.id.teama1);
        mTA2 = findViewById(R.id.teama2);
        mTA3 = findViewById(R.id.teama3);
        mTB1 = findViewById(R.id.teamb1);
        mTB2 = findViewById(R.id.teamb2);
        mTB3 = findViewById(R.id.teamb3);
        mReset = findViewById(R.id.resetbtn);
        mTAS = findViewById(R.id.teamascore);
        mTBS = findViewById(R.id.teambscore);

        mTA1.setOnClickListener(this);
        mTA2.setOnClickListener(this);
        mTA3.setOnClickListener(this);
        mTB1.setOnClickListener(this);
        mTB2.setOnClickListener(this);
        mTB3.setOnClickListener(this);
        mReset.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.equals(mTA1)) {
            mTAS.setText(String.valueOf(Integer.valueOf(mTAS.getText().toString()) + 1));
        } else if (v.equals(mTA2)) {
            mTAS.setText(String.valueOf(Integer.valueOf(mTAS.getText().toString()) + 2));
        } else if (v.equals(mTA3)) {
            mTAS.setText(String.valueOf(Integer.valueOf(mTAS.getText().toString()) + 3));
        } else if (v.equals(mTB1)) {
            mTBS.setText(String.valueOf(Integer.valueOf(mTBS.getText().toString()) + 1));
        } else if (v.equals(mTB2)) {
            mTBS.setText(String.valueOf(Integer.valueOf(mTBS.getText().toString()) + 2));
        } else if (v.equals(mTB3)) {
            mTBS.setText(String.valueOf(Integer.valueOf(mTBS.getText().toString()) + 3));
        } else if (v.equals(mReset)) {
            mTBS.setText("0");
            mTAS.setText("0");
        }
    }
}