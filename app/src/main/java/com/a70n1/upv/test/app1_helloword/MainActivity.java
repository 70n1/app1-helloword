package com.a70n1.upv.test.app1_helloword;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*TextView texto = new TextView(this);
        texto.setText("Hello, Android");
        setContentView(texto);*/
    }
}
