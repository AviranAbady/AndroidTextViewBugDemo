package org.aviran.textviewbugdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView textViewEnglish = (TextView) findViewById(R.id.textViewEnglish);
        TextView textViewHebrew = (TextView) findViewById(R.id.textViewHebrew);

        textViewEnglish.setHorizontallyScrolling(true);
        textViewEnglish.setMovementMethod(new ScrollingMovementMethod());
        textViewEnglish.setText("Text in English");

        // You will not see the content displayed here,
        // until you scroll the textview - press down and move right/left
        // some sort of scrolling offest bug
        textViewHebrew.setHorizontallyScrolling(true);
        textViewHebrew.setMovementMethod(new ScrollingMovementMethod());
        textViewHebrew.setText("טקסט בעברית");
    }
}
