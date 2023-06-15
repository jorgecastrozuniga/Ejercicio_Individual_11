package com.example.ejercicio_individual_11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

import com.example.ejercicio_individual_11.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    // Se declara una variable de tipo binding
    private ActivityMainBinding vbinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Se realiza inflacion a la vista de binding
        vbinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(vbinding.getRoot());

        // proceso: Se pasan los datos
        vbinding.botonfly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast mytoast = Toast.makeText(getApplicationContext(), "MODO AVION DESACTIVADO", Toast.LENGTH_LONG);
                mytoast.setGravity(Gravity.CENTER_HORIZONTAL, 0, 80);
                mytoast.show();
            }
        });

        vbinding.botonupdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast mytoast = Toast.makeText(getApplicationContext(), "BOTON ACTUALIZADO", Toast.LENGTH_LONG);
                mytoast.setGravity(Gravity.CENTER_HORIZONTAL, 0, 80);
                mytoast.show();
            }
        });

        vbinding.botonpicture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast mytoast = Toast.makeText(getApplicationContext(), "IMAGEN GUARDADA EN GALERIA", Toast.LENGTH_LONG);
                mytoast.setGravity(Gravity.CENTER_HORIZONTAL, 0, 80);
                mytoast.show();
            }
        });

        vbinding.botonlocked.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast mytoast = Toast.makeText(getApplicationContext(), "NIVEL 5 DESBLOQUEADO", Toast.LENGTH_LONG);
                mytoast.setGravity(Gravity.CENTER_HORIZONTAL, 0, 80);
                mytoast.show();
            }
        });

        vbinding.botonlevel4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast mytoast = Toast.makeText(getApplicationContext(), "NIVEL 4 COMPLETADO", Toast.LENGTH_LONG);
                mytoast.setGravity(Gravity.CENTER_HORIZONTAL, 0, 80);
                mytoast.show();
            }
        });

        vbinding.botonpause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast mytoast = Toast.makeText(getApplicationContext(), "MUSICA EN PAUSA", Toast.LENGTH_LONG);
                mytoast.setGravity(Gravity.CENTER_HORIZONTAL, 0, 80);
                mytoast.show();
            }
        });
    }
    }
