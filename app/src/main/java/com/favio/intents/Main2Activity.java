package com.favio.intents;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

    Button btn_itt1, btn_itt2, btn_itt3, btn_itt4, btn_itt5, btn_itt6, btn_itt7;
    TextView txtv_nombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //Bundle bdl=getIntent().getExtras();

        //String nombre=bdl.getString();

        btn_itt1=findViewById(R.id.btn_itt1);
        btn_itt2=findViewById(R.id.btn_itt2);
        btn_itt3=findViewById(R.id.btn_itt3);
        btn_itt4=findViewById(R.id.btn_itt4);
        btn_itt5=findViewById(R.id.btn_itt5);
        btn_itt6=findViewById(R.id.btn_itt6);
        btn_itt7=findViewById(R.id.btn_itt7);

        btn_itt1.setOnClickListener(this);
        btn_itt2.setOnClickListener(this);
        btn_itt3.setOnClickListener(this);
        btn_itt4.setOnClickListener(this);
        btn_itt5.setOnClickListener(this);
        btn_itt6.setOnClickListener(this);
        btn_itt7.setOnClickListener(this);

        txtv_nombre = findViewById(R.id.txtv_nombre);

        String nombre = getIntent().getStringExtra("Nombre");
        txtv_nombre.setText(nombre);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {

            case R.id.btn_itt1:
                Intent itt1=new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"));
                startActivity(itt1);
                break;
            case R.id.btn_itt2:
                Intent itt2=new Intent(Intent.ACTION_CALL, Uri.parse("tel:871117693"));
                if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    // TODO: Consider calling
                    //    ActivityCompat#requestPermissions
                    // here to request the missing permissions, and then overriding
                    //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                    //                                          int[] grantResults)
                    // to handle the case where the user grants the permission. See the documentation
                    // for ActivityCompat#requestPermissions for more details.
                    return;
                }
                startActivity(itt2);
                break;
            case R.id.btn_itt3:
                Intent itt3=new Intent(Intent.ACTION_VIEW, Uri.parse("https://messenger.com"));
                startActivity(itt3);
                break;
        }


    }
}
