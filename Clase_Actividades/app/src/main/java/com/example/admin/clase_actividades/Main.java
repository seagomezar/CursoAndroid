package com.example.admin.clase_actividades;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Main extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("Avisador", "Se creo la actividad");
        Button botonTerminar=(Button)findViewById(R.id.boton_terminar);
        TextView txt_saludo=(TextView)findViewById(R.id.saludar);
        botonTerminar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e("Boton Mensaje","Hizo Click");
                finish();
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("Avisador", "Se inició la actividad");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("Avisador", "Se esta ejecutando mi actividad");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("Avisador", "Se pausó la actividad");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("Avisador", "Se detuvo la actividad");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("Avisador", "Se elimino");
    }
}
