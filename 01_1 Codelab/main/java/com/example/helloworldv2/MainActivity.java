package com.example.helloworldv2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try{
            System.out.println(2/0);
        }catch (ArithmeticException e){
            Log.e(TAG, "ArithmeticException: Cannot divide by 0");
            Log.d(TAG, "Normal Message");
            Log.i(TAG, "MainActivity Layout is Complete");
        }
    }


}