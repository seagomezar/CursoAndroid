package com.example.admin.clase_animales;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by admin on 29/07/2014.
 */
public class adaptador extends BaseAdapter{

    private final Activity actividad;
    private final ArrayList<animalito> animalitos;

    public adaptador(Activity actividad, ArrayList<animalito> animalitos) {
        this.actividad = actividad;
        this.animalitos = animalitos;
    }

    @Override
    public int getCount() {
        return animalitos.size();
    }

    @Override
    public Object getItem(int i)
    {
        return animalitos.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup)
    {
        LayoutInflater inflater=actividad.getLayoutInflater();
        View miVista = inflater.inflate(R.layout.vista_individual,null,true);

        TextView superior=(TextView)miVista.findViewById(R.id.superior);
        TextView inferior=(TextView)miVista.findViewById(R.id.inferior);
        ImageView imagen=(ImageView)miVista.findViewById(R.id.imagen);

        superior.setText(animalitos.get(i).getNombre());
        inferior.setText(animalitos.get(i).getDescripcion());
        imagen.setImageResource(animalitos.get(i).getImagen());

        return miVista;
    }
}
