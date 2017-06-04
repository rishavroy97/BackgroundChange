package com.example.rishavroy.backgroundchange;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.TextView;
import android.graphics.Color;

public class MainActivity extends AppCompatActivity {
    View backdrop;
    int r = 0;
    int g = 0;
    int b = 0;
    TextView red,green,blue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        red = (TextView) findViewById(R.id.RedText);
        green = (TextView) findViewById(R.id.GreenText);
        blue = (TextView) findViewById(R.id.BlueText);

        red.setText(String.valueOf(r));
        green.setText(String.valueOf(g));
        blue.setText(String.valueOf(b));

        backdrop = (View) findViewById(R.id.backdrop);
        backdrop.setBackgroundColor(Color.rgb(r,g,b));
        }

    public void RedIncrement(View view) {
        r = r + 5;
        r = r % 256;
        red.setText(String.valueOf(r));

        backdrop = (View) findViewById(R.id.backdrop);
        backdrop.setBackgroundColor(Color.rgb(r,g,b));
    }

    public void GreenIncrement(View view) {
        g = g + 5;
        g = g % 256;
        green.setText(String.valueOf(g));

        backdrop = (View) findViewById(R.id.backdrop);
        backdrop.setBackgroundColor(Color.rgb(r,g,b));
    }

    public void BlueIncrement(View view) {
        b = b + 5;
        b = b % 256;
        blue.setText(String.valueOf(b));

        backdrop = (View) findViewById(R.id.backdrop);
        backdrop.setBackgroundColor(Color.rgb(r,g,b));
    }
}
