package com.example.admin.clase_personificador;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.admin.clase_personificador.R;

public class Detalle extends Activity {

    public Boolean fav=false;
    public TextView nombre;
    public TextView titulo;
    public TextView descripcion;
    public ImageView imagen;
    public int idImagen;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);
        Bundle b =getIntent().getExtras();
        nombre =(TextView)findViewById(R.id.nombre);
        titulo =(TextView)findViewById(R.id.titulo);
        descripcion =(TextView)findViewById(R.id.descripcion);
        imagen=(ImageView)findViewById(R.id.imagen);
        idImagen=b.getInt("imagen");
        nombre.setText(b.getString("nombre"));
        titulo.setText(b.getString("titulo"));
        descripcion.setText(b.getString("descripcion"));
        imagen.setImageResource(b.getInt("imagen"));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.detalle, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (item.getItemId())
        {
            case R.id.fav:
                Drawable icon=null;
                if(fav)
                {
                    icon= getResources().getDrawable(R.drawable.ic_action_not_important);
                }
                else
                {
                    icon=getResources().getDrawable(R.drawable.ic_action_important);
                }
                fav=!fav;
                item.setIcon(icon);
                return  true;
            case R.id.share:
                Intent i= new Intent();
                i.setAction(Intent.ACTION_SEND);
                Uri UriImagen= Uri.parse("android.resource://"+getPackageName()+"/drawable/"+idImagen);
                String mensaje=nombre.getText().toString()+"-"+titulo.getText().toString();
                i.putExtra(Intent.EXTRA_TEXT,mensaje);
                i.setType("image/*");
                i.putExtra(Intent.EXTRA_STREAM,UriImagen);
                startActivity(Intent.createChooser(i,"Compartir"));
                return  true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
