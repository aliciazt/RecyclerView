package com.example.aliciazarate.entregable3_recyclerview;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
/////este es el codigo del fragment
///SE LLAMA AL RECYCLER DENTRO DEL FRAGMENT Y SE LE ASIGNAN  LAS IMAGENES CON LAS CUALES SE LLENARA LA LISTA DE OBJETOS TIPO imagenvo

public class FragmentRecycler extends android.support.v4.app.Fragment {
    ArrayList<imagenesvo> lista_imagenes;
    RecyclerView recycler_imagenes;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View v =inflater.inflate (R.layout.recycler, container, false);
        lista_imagenes = new ArrayList<>();
        recycler_imagenes = (RecyclerView) v.findViewById(R.id.recy1);
        LinearLayoutManager llm=new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        recycler_imagenes.setLayoutManager(llm);
        llenar_lista();
        adapter_datos adapter = new adapter_datos(lista_imagenes);
        recycler_imagenes.setAdapter(adapter);
        return v;
    }
    private void llenar_lista(){
        /////NOTA PARA LAS DESCRIPCIONES Y TEXTOS EN GENERAL DEBERIAN USARSE ARCHIVOS STRING.XML <---------INVESTIGAR COMO SE CREAN Y USAN!
        lista_imagenes.add(new imagenesvo("La nube","Muestra al usuario la opcion de mover algún archivo a su nube personal",R.drawable.collections_cloud));
        lista_imagenes.add(new imagenesvo("Papelera","Da al usuario la opcion de eliminar cualquier archivo ",R.drawable.content_discard));
        lista_imagenes.add(new imagenesvo("Ayuda","Signo universal para pedir ayuda en el funcionamiento de un programa o pagina web",R.drawable.help));
        lista_imagenes.add(new imagenesvo("Favoritos","Icono relevante en tumblr para denotar el interes o gusto por uno o varios port hechos en dicha pagina ",R.drawable.rating_favorite));
        lista_imagenes.add(new imagenesvo("Me gusta(Like)","El icono más conocido en facebook, denota la aprobacion por un post",R.drawable.rating_good));
        lista_imagenes.add(new imagenesvo("Importante","Generalmente utilizada para guardar los marcadores en navegadores web",R.drawable.rating_important));
    }
}
