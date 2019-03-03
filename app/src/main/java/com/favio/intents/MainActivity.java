package com.favio.intents;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtv_contador;
    String miNombre="Favio";
    int miEdad=31;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtv_contador=findViewById(R.id.txtv_contador);

        new CountDownTimer(10000,1000){

            @Override
            public void onTick(long l) {

                txtv_contador.setText(String.valueOf(l/1000));
            }

            @Override
            public void onFinish() {

                Intent myIntent=new Intent(MainActivity.this, Main2Activity.class);

                Bundle myBundle=new Bundle();
                myBundle.putString("Nombre",miNombre);
                myBundle.putInt("Edad",miEdad);

                myIntent.putExtras(myBundle);

                startActivity(myIntent);

                finish();

            }
        }.start();
    }
}
