package com.bp.pruebarecylcerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerViewAdapter adapter;
    private String [] myDataset = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*Se declara el recycler y se asocia al de la vista*/
        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        /*Indica al recycler que el tamaño de sus datos es fijo*/
        recyclerView.setHasFixedSize(true);
        /*Se declara el le linearLayout que contiene los elementos de cada item del recycler*/
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        /*Se asocia el recycler con la vista de sus items*/
        recyclerView.setLayoutManager(linearLayoutManager);
        /*Se declara el adapter para vincular los datos a los elementos de la lista*/
        adapter = new RecyclerViewAdapter(this, R.layout.elemento_tarjeta, myDataset);
        /*Se asocia el adapter al recycler*/
        recyclerView.setAdapter(adapter);
    }
}
