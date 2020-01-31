package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import java.text.NumberFormat;
import android.view.View;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    int quantity = 0;
    int quantity2 = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void three(View view) {
        quantity = quantity + 3;
        display(quantity);
    }
    public void two(View view) {
        quantity = quantity + 2;
        display(quantity);
    }
    public void freeThrow(View view) {
        quantity = quantity + 1;
        display(quantity);
    }
    public void three2(View view) {
        quantity2 = quantity2 + 3;
        display2(quantity2);
    }
    public void two2(View view) {
        quantity2 = quantity2 + 2;
        display2(quantity2);
    }
    public void freeThrow2(View view) {
        quantity2 = quantity2 + 1;
        display2(quantity2);
    }
    public void reset(View view) {
        quantity = 0;
        quantity2 = 0;
        display(quantity);
        display2(quantity2);
    }
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }
    private void display2(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.quantity2_text_view);
        quantityTextView.setText("" + number);
    }
}
