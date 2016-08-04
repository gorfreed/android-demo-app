package com.example.kolja.mytranslatedapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String helloWorld = String.format(getString(R.string.hello_world), "Andre");
        String pointsGained = String.format(getString(R.string.points_gained), 101);

        TextView view1 = (TextView) findViewById(R.id.textView2);
        view1.setText(helloWorld);

        TextView view2 = (TextView) findViewById(R.id.textView3);
        view1.setText(pointsGained);
    }
}
