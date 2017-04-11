package com.example.casa.storecloud;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.casa.storecloud.adapters.Adapter_user;
import com.example.casa.storecloud.models.Usuario;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class List_userActivity extends AppCompatActivity {

    RecyclerView list_user;

    List<Usuario> usuarios;

    Adapter_user adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_user);

        list_user = (RecyclerView)findViewById(R.id.recycler_user);

        list_user.setLayoutManager(new LinearLayoutManager(this));

        usuarios = new ArrayList<>();

        FirebaseDatabase database = FirebaseDatabase.getInstance();
       // DatabaseReference mDatabase = FirebaseDatabase.getInstance().getReference("users");

        adapter = new Adapter_user(usuarios);



        database.getReference("users").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                //usuarios.removeAll(usuarios);
                for (DataSnapshot snapshot : dataSnapshot.getChildren()){
                    Usuario usuario = snapshot.getValue(Usuario.class);
                    usuarios.add(usuario);

                }
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });





        list_user.setAdapter(adapter);

    }
}
