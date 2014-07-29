package com.example.admin.clasecalculadora;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class Main extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button sumar =(Button)findViewById(R.id.sumar);
        Button restar=(Button)findViewById(R.id.restar);
        final EditText valor1=(EditText)findViewById(R.id.valor1);
        final EditText valor2=(EditText)findViewById(R.id.valor2);
        final TextView resultado=(TextView)findViewById(R.id.resultado);

        restar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(valor1.getText().toString().isEmpty())
                {
                    Toast.makeText(getApplicationContext()
                            ,"Por Favor ingrese un valor1",Toast.LENGTH_LONG).show();
                }
                else if(valor2.getText().toString().isEmpty())
                {
                    Toast.makeText(getApplicationContext()
                            ,"Por Favor ingrese un valor2",Toast.LENGTH_LONG).show();
                }
                else
                {
                    int a= Integer.parseInt(valor1.getText().toString());
                    int b= Integer.parseInt(valor2.getText().toString());
                    resultado.setText(String.valueOf(a-b));
                }
            }
        });

        sumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Aca es donde ejecutamos las acciones cuando alguien hace click
                if(valor1.getText().toString().isEmpty())
                {
                    Toast.makeText(getApplicationContext()
                            ,"Por Favor ingrese un valor1",Toast.LENGTH_LONG).show();
                }
                else if(valor2.getText().toString().isEmpty())
                {
                    Toast.makeText(getApplicationContext()
                            ,"Por Favor ingrese un valor2",Toast.LENGTH_LONG).show();
                }
                else
                {
                    int a= Integer.parseInt(valor1.getText().toString());
                    int b= Integer.parseInt(valor2.getText().toString());
                    resultado.setText(String.valueOf(a+b));
                }
            }
        });


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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
