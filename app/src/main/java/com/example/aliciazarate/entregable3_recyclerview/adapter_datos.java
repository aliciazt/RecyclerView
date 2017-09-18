package com.example.aliciazarate.entregable3_recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Alicia Zarate on 17/9/2017.
 */
///ESTA CODIGO ES EL QUE SE HACE CARGO DEL FUNCIONAMIENTO DEL RECYCLER VIEW

public  class adapter_datos extends RecyclerView.Adapter<adapter_datos.ViewHolderImagenes>{
    ArrayList<imagenesvo> lista_imagenes;

    public adapter_datos(ArrayList<imagenesvo> lista_imagenes) {
        this.lista_imagenes = lista_imagenes;
    }

    @Override
    public adapter_datos.ViewHolderImagenes onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list,null,false);
        return new ViewHolderImagenes(view);

    }

    @Override
    public void onBindViewHolder(adapter_datos.ViewHolderImagenes holder, int position) {
            holder.etiNombre.setText(lista_imagenes.get(position).getNombre());
         holder.etiInformacion.setText(lista_imagenes.get(position).getInfo());
        holder.foto.setImageResource(lista_imagenes.get(position).getFoto());

    }

    @Override
    public int getItemCount() {
        return lista_imagenes.size();
    }

    public class ViewHolderImagenes extends RecyclerView.ViewHolder {
        TextView etiNombre, etiInformacion;
        ImageView foto;
        public ViewHolderImagenes(View itemView) {
            super(itemView);
            etiNombre= (TextView) itemView.findViewById(R.id.idNombre);
            etiInformacion = (TextView) itemView.findViewById(R.id.idinfo);
            foto = (ImageView) itemView.findViewById(R.id.idimagen);
        }
    }
}