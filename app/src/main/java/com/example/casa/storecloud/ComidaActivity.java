package com.example.casa.storecloud;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.casa.storecloud.models.*;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class ComidaActivity extends AppCompatActivity {

  private EditText codigo, nombre, descripcion,precio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comida);

        codigo = (EditText)findViewById(R.id.cod_plato);
        nombre = (EditText)findViewById(R.id.nombre_plato);
        descripcion=(EditText)findViewById(R.id.desc_plato);
        precio=(EditText)findViewById(R.id.precio_plato);


    }

    public void writeNewUser(View v) {

        String cod_plato = codigo.getText().toString();
        //int id = Integer.parseInt(cod_plato);
        String name_food = nombre.getText().toString();
        String review = descripcion.getText().toString();
        String price = precio.getText().toString();


        DatabaseReference mDatabase = FirebaseDatabase.getInstance().getReference("foods");
        Comida food= new Comida(name_food,review,price);
        mDatabase.child(cod_plato).setValue(food);
    }
}
