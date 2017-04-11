package com.example.casa.storecloud.adapters;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.casa.storecloud.R;
import com.example.casa.storecloud.models.Usuario;

import java.util.List;

/**
 * Created by Casa on 08/04/2017.
 */

public class Adapter_user extends  RecyclerView.Adapter<Adapter_user.UserviewHolder>{

    List<Usuario> usuarios;

    public Adapter_user(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    @Override
    public UserviewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.dising_list_user, parent, false);
        UserviewHolder holder = new UserviewHolder(v);
        return  holder;
    }

    @Override
    public void onBindViewHolder(UserviewHolder holder, int position) {
        Usuario usuario = usuarios.get(position);
        holder.identificacion.setText(usuarios.get(position).getNombres());
        holder.nombres.setText(usuarios.get(position).getNombres());
        holder.apellidos.setText(usuarios.get(position).getApellidos());
        holder.telefono.setText(usuarios.get(position).getTelefono());

    }

    @Override
    public int getItemCount() {
        return usuarios.size();
    }

    public  static class UserviewHolder extends RecyclerView.ViewHolder{

        CardView cv;
        TextView identificacion,nombres,apellidos,telefono;
        public UserviewHolder(View itemView) {
            super(itemView);

            cv = (CardView)itemView.findViewById(R.id.cv);
            identificacion = (TextView)itemView.findViewById(R.id.ident);
            nombres = (TextView)itemView.findViewById(R.id.names);
            apellidos = (TextView)itemView.findViewById(R.id.last_name);
            telefono = (TextView)itemView.findViewById(R.id.phone);
        }
    }
}
