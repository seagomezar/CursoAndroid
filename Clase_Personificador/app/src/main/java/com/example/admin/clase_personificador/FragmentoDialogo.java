package com.example.admin.clase_personificador;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.support.v4.app.DialogFragment;
import android.app.Fragment;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

class FragmentoDialogo extends DialogFragment
{
    public interface DialogListener
    {
        public void onDialogPositiveClick(DialogFragment dialog);
        public void onDialogNegativeClick(DialogFragment dialog);

    }
    DialogListener listener;

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

        listener=(DialogListener)activity;

    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder builder=new AlertDialog.Builder(getActivity());
        builder.
                setTitle("Pregunton").
                setSingleChoiceItems(R.array.opciones_del_dialogo,-1,null).
                setPositiveButton(R.string.texto_boton_si,new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        listener.onDialogPositiveClick(FragmentoDialogo.this);
                    }
                }).setNegativeButton(R.string.texto_boton_no, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                listener.onDialogNegativeClick(FragmentoDialogo.this);
            }
        });
        return builder.create();

    }
}