package com.example.practical1_2b;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import static com.example.practical1_2b.R.string.toast_message;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
    }

    public void showToast(View view){
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view){
        ++mCount;
        if (mShowCount != null){
            mShowCount.setText(Integer.toString(mCount));
        }

    }

    public void turnZero(View view){
        mCount = 0;
        mShowCount.setText(Integer.toString(mCount));
    }
}