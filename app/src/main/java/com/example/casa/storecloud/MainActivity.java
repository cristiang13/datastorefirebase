package com.example.casa.storecloud;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import com.example.casa.storecloud.models.*;
public class MainActivity extends AppCompatActivity {

    private EditText id,name,lastname,phone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        id = (EditText)findViewById(R.id.identificacion);
        name=(EditText)findViewById(R.id.nombres);
        lastname=(EditText)findViewById(R.id.apellidos);
        phone=(EditText)findViewById(R.id.telefono);


    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menuprincp, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.reg_user:
                //codigo para registrar usuario
                return true;
            case R.id.reg_food:
                //codigo para registrar pedido
                Intent registrar= new Intent(getApplicationContext(),ComidaActivity.class);
                startActivity(registrar);
                return true;
            case R.id.list_user:
                //codigo para listar usuario
                Intent listar_user= new Intent(getApplicationContext(),List_userActivity.class);
                startActivity(listar_user);
                return true;
            case R.id.reg_pedido:
                //codigo para registrar food
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }




    public void writeNewUser(View v) {

        String identificacion = id.getText().toString();
        String nombres = name.getText().toString();
        String apellidos = lastname.getText().toString();
        String tel = phone.getText().toString();


        DatabaseReference mDatabase = FirebaseDatabase.getInstance().getReference("users");
        Usuario user= new Usuario(nombres,apellidos,tel);
        mDatabase.child(identificacion).setValue(user);
    }
}
