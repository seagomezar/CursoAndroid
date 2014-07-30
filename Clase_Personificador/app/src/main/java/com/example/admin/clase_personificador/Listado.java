package com.example.admin.clase_personificador;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import com.example.admin.clase_personificador.R;

import java.util.ArrayList;

public class Listado extends ActionBarActivity {

    public ListView lista_personas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado);
        lista_personas=(ListView)findViewById(R.id.lista);
        ArrayList<Persona> datos=new ArrayList<Persona>();

        datos.add(new Persona("Bill Gates",R.drawable.bill,"Fundador De Microsoft","Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum"));
        datos.add(new Persona("RIHANNA",R.drawable.rihanna,  "Cantante Famosa ", "es una cantante, actriz y diseñadora de moda barbadense. Su carrera comenzó cuando conoció al productor musical Evan Rogers, a finales de 2003. Grabó maquetas bajo la guía de Rogers y fueron enviadas a varios sellos discográficos. Posteriormente firmó un contrato con Def Jam Recordings tras una audición para su entonces presidente, el rapero Jay-Z. Su álbum debut, Music of the Sun (2005) y su segundo material A Girl Like Me (2006), ambos alcanzaron los diez primeros puestos en el Billboard 200. Su primer disco generó el éxito «Pon de Replay», mientras que el segundo generó su primer número uno, en el Billboard Hot 100, «SOS» y el éxito internacional «Unfaithful»."));
        datos.add(new Persona("LEBRON JAMES",R.drawable.lebron,  "Jugador de BasketBall","es un jugador profesional de baloncesto estadounidense que actualmente pertenece a la plantilla de los Cleveland Cavaliers de la National Basketball Association (NBA). Mide 2,03 metros de estatura, y juega en la posición de alero. Cuando James se proclamó 3 veces Mr. Basketball en Ohio durante el instituto, y apenas cursaba su temporada sophomore en St. Vincent - St. Mary, ya era considerado por los medios de comunicación como la futura gran estrella de la NBA. Firmó un contrato de 90 millones de dólares con Nike antes de debutar en la NBA. Con 18 años, James fue elegido en la primera posición del Draft de la NBA de 2003 por Cleveland Cavaliers.."));
        datos.add(new Persona("JAMES RODRIGUEZ",R.drawable.james, "Futbolista Colombiano", "es un futbolista colombiano que juega como centrocampista en el Real Madrid Club de Fútbol de la Primera División de España. Recibió en 2009, 2012 y 2014 el premio de jugador revelación en la Primera División de Argentina, Primeira Liga y en la Ligue 1 respectivamente, siendo además elegido en 2014 por el Centro Internacional de Estudios del Deporte segundo mejor centrocampista ofensivo de Europa.Internacional absoluto con la selección colombiana desde que debutase en el año 2011, fue vencedor de la Bota de Oro del Mundial de Brasil 2014 tras anotar seis tantos que permitieron que su selección alcanzase los cuartos de final del torneo, siendo hasta la fecha la mejor actuación del combinado «cafetero» en una cita mundialista."));
        datos.add(new Persona( "MARIANA PAJÓN", R.drawable.mariana, "Deportista Colombiana"," es una ciclista colombiana. Número uno en el escalafón mundial de la UCI.Medallista de oro en los Juegos Olímpicos de Londres 2012, primer galardón olímpico en su cuenta personal y segundo oro de toda la historia olímpica colombiana.Por haber sido medallista en los Juegos, el Gobierno colombiano la condecoró con la Cruz de Boyacá.Además de ser campeona olímpica, Mariana ha sido ganadora de varios campeonatos mundiales, nacionales, estadounidenses, latinoamericanos y panamericanos, entre otros."));
        lista_personas.setAdapter(new Adaptador(this,datos));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.listado, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
