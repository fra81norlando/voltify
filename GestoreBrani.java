package com.example.voltify;

import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class GestoreBrani extends AppCompatActivity {
    ListView listaBrani;
    ArrayList<Brano> ListaBrani;
    TextView brani; 
    ArrayList<Brano> ListaBrani; 

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gestore_brani);
        listaBrani=findViewById(R.id.listaBrani);
        brani=findViewById(R.id.brani); 
    }
    public GestoreBrani(){
        ListaBrani = new  ArrayList<Brano>();
    }
    public void addBrano(String titolo){
        Brano br = new Brano(titolo);
        ListaBrani.add(br);
    public void addBrano(String titolo, String genere){
        Brano br = new Brano(titolo, genere); 
        ListaBrani.add(br); 
        Log.d("funzionamento GestoriBrani", "funziona metodo addBrano");
    }

    public void visualizza(){
        listaBrani.setAdapter((ListAdapter) ListaBrani);
    public String listaSong(){
        StringBuilder sbSong = new StringBuilder(); //definizione StringBuilder
        for (Brano brc : ListaBrani){
            sbSong.append("-"+ brc.getTitolo() +"\n" +"-"+ brc.getGenere() +"\n");
       
        }
        return sbSong.toString(); 
    }
}
