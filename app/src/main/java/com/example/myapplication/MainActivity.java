package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textview=(TextView)findViewById(R.id.text2);
        String para="For example, when designing a brochure or book, a designer will insert Lorem ipsum text if the real text is not available. The Lorem ipsum text looks real enough that the brochure or book looks complete. The book or brochure can be shown to the client for approval.\n" +
                "\n" +
                "The important factor when using Lorem ipsum text is that the text looks realistic otherwise the brochure or book will not look very good. Lorem Ipsum is dummy text which has no meaning however looks very similar to real text.";
        textview.setText(para);
        textview.setMovementMethod(new ScrollingMovementMethod());
    }
}