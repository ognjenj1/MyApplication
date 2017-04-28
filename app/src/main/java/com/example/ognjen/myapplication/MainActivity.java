package com.example.ognjen.myapplication;

import android.content.DialogInterface;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ListaRecenica lista = new ListaRecenica();
    private TextView prviTextView;
    private Button dugme;
    private RelativeLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout = (RelativeLayout) findViewById(R.id.relativeLayout);
        prviTextView = (TextView) findViewById(R.id.textView);
        dugme = (Button) findViewById(R.id.button3);

        View.OnClickListener l = new View.OnClickListener(){
            @Override
            public void onClick(View v){
                    String recenica = lista.getRecenica();
                    prviTextView.setText(recenica);
                    layout.setBackgroundColor(lista.getBoja());
                dugme.setTextColor(lista.getBoja());
            }
        };
        dugme.setOnClickListener(l);

        Toast.makeText(this, "Desi be brt?", Toast.LENGTH_SHORT).show();
    }
}
