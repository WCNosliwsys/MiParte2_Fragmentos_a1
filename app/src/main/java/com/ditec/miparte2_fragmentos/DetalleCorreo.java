package com.ditec.miparte2_fragmentos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetalleCorreo extends AppCompatActivity {

    TextView txtmidetalle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_correo);
        txtmidetalle=findViewById(R.id.TxtDetalle);
        txtmidetalle.setText("DE: "+ getIntent().getExtras().getString("de")+
                " ASUNTO: "+ getIntent().getExtras().getString("asunto")+
                " CONTENIDO: "+ getIntent().getExtras().getString("texto"));
    }
}