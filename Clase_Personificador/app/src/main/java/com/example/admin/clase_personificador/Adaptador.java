package com.example.admin.clase_personificador;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by admin on 30/07/2014.
 */
public class Adaptador extends BaseAdapter
{
    private Activity activity;
    private ArrayList<Persona> misPersonas;

    public Adaptador(Activity activity, ArrayList<Persona> misPersonas) {
        this.activity = activity;
        this.misPersonas = misPersonas;
    }

    @Override
    public int getCount() {
        return misPersonas.size();
    }

    @Override
    public Object getItem(int i) {
        return misPersonas.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater myInflador=activity.getLayoutInflater();
        View miVista = myInflador.inflate(R.layout.elemento_persona_personal,null,true);
        TextView txt_nombre,txt_titulo;
        txt_nombre=(TextView)miVista.findViewById(R.id.nombre);
        txt_titulo=(TextView)miVista.findViewById(R.id.titulo);
        ImageView txt_imagen=(ImageView)miVista.findViewById(R.id.imagen);

        final String sNombre=misPersonas.get(i).getNombre();
        final String sTitulo=misPersonas.get(i).getTitulo();
        final String sDescripcion=misPersonas.get(i).getDescripcion();
        final int sImagen=misPersonas.get(i).getImagen();

        txt_imagen.setImageResource(sImagen);
        txt_nombre.setText(sNombre);
        txt_titulo.setText(sTitulo);

        miVista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(activity,Detalle.class);
                i.putExtra("nombre",sNombre);
                i.putExtra("titulo",sTitulo);
                i.putExtra("descripcion",sDescripcion);
                i.putExtra("imagen",sImagen);
                activity.startActivity(i);
            }
        });

        return miVista;

    }
}
