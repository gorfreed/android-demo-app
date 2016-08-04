package com.example.kolja.mytranslatedapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String helloWorld = String.format(getString(R.string.hello_world), "Andre");
        String pointsGained = String.format(getString(R.string.points_gained), 101);
        String text = String.format(getString(R.string.with_html));
        CharSequence withHtml = Html.fromHtml(text);

        TextView helloWorldView = (TextView) findViewById(R.id.helloWorld);
        helloWorldView.setText(helloWorld);

        TextView pointsGainedView = (TextView) findViewById(R.id.pointsGained);
        pointsGainedView.setText(pointsGained);

        TextView withHtmlView = (TextView) findViewById(R.id.withHtml);
        withHtmlView.setText(withHtml);
    }
}
