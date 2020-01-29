package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import java.text.NumberFormat;
import android.view.View;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    int quantity = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void three(View view) {
        quantity = quantity + 3;
        display(quantity);
    }
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }
}
