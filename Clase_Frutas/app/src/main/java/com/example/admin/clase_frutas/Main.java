package com.example.admin.clase_frutas;
import com.example.admin.clase_frutas.modelos.Fruta;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main extends Activity {

    public GridView grid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Fruta> frutasCompetas=new ArrayList<Fruta>();
        frutasCompetas=llenador();
        Button b=(Button)findViewById(R.id.agregar);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),Agregar.class);
                startActivity(i);
            }
        });
        grid.setAdapter(new Adaptador(this,frutasCompetas));

    }
    public ArrayList<Fruta> llenador()
    {
        ArrayList<Fruta> misDatos=new ArrayList<Fruta>();
        try
        {
            InputStream f = getResources().openRawResource(R.raw.misFrutas);
            BufferedReader lineaBuffereada=new BufferedReader(new InputStreamReader(f));
            String linea;
            do {
                linea = lineaBuffereada.readLine();
                if(linea!=null)
                {
                    String elementos[]=linea.split("|");
                    misDatos.add(new Fruta(R.drawable.ic_launcher,elementos[0],elementos[1]));
                }
            }while(linea!=null);
            f.close();
        }
        catch (Exception e)
        {
            Log.e("Error: ", "Error al leer el archivo interno");
        }
        try
        {
            InputStream g=getApplicationContext().openFileInput("elementos_telefono.txt");
            BufferedReader lineaBuffereada=new BufferedReader(new InputStreamReader(g));
            String linea;
            do {
                linea = lineaBuffereada.readLine();
                if(linea!=null)
                {
                    String elementos[]=linea.split("|");
                    misDatos.add(new Fruta(R.drawable.ic_launcher,elementos[0],elementos[1]));
                }
            }while(linea!=null);
            g.close();
        }
        catch (Exception e)
        {
            Log.e("Error: ", "Error al leer el archivo externo");
        }
        return misDatos;
    }
}
