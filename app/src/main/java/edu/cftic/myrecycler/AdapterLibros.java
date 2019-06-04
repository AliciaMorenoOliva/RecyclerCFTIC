package edu.cftic.myrecycler;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


//esta clase provee los datos al recicle
public class AdapterLibros extends RecyclerView.Adapter<LibroViewHolder> {

//para guardar la lista
    private ArrayList<Libro> datos;


    //Creo la vista, con el Holder dentro

    //aqui estoy creando cada elemento de la vista

    @Override
    public LibroViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LibroViewHolder libroViewHolder = null;

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        View itemView = inflater.inflate(R.layout.layout_libro_item, parent, false);

        libroViewHolder = new LibroViewHolder(itemView);

        return libroViewHolder;
    }

    //Al holder, le meto la info de libro que toca
    @Override
    public void onBindViewHolder(LibroViewHolder holder, int position) {

        Libro libro = datos.get(position);
        holder.cargarLibroEnHolder(libro);

    }
//pide el numero de libros para crear el numero de lines de la lista
    @Override
    public int getItemCount() {
        return datos.size();
    }

    public AdapterLibros (ArrayList<Libro> libros)
    {
        this.datos = libros;
    }
}
