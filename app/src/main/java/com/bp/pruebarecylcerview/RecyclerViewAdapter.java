package com.bp.pruebarecylcerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Borja on 30/08/2017.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private int recyclerItemRes;
    private String [] data;
    private Context context;

    /*Inicializa el adapter y los datos para su funcionamiento*/
    public RecyclerViewAdapter(Context context, int recyclerItemRes, String[] data){
        this.recyclerItemRes = recyclerItemRes;
        this.data = data;
        this.context = context;
    }

    /*Permite cargar la vista e inicializar el ViewHolder*/
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(recyclerItemRes,parent,false);
        ViewHolder vh = new ViewHolder(view);
        return vh;
    }

    /*Establece el vinculo entre el holder y sus datos*/
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.versionName.setText(data[position]);
    }

    /*Permite conocer el numero de elementos que se mostraran en la lista*/
    @Override
    public int getItemCount() {
        if(data != null){
            return data.length;
        }
        return 0;
    }

    /*Clase ViewHolder. Tiene un atributo para cada elemento gráfico y un constructor que los inicializa*/
    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView versionName;
        public ViewHolder(View itemView){
            super(itemView);
            versionName = (TextView) itemView.findViewById(R.id.title);
        }
    }
}
