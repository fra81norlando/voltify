package com.example.voltify;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity
{
Button btnInserisci;
EditText txtitolo;
GestoreBrani gb;
Spinner spnGenere;
String[] elencogeneri = {"rock", "liscio", "pop", "rap", "R&B"};
  @Override
  protected void onCreate(Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
    setContentView(R.Layout.activity_main);
    btnInserisci=findViewById(R.id.btnInserisci);
    txtitolo=findViewById(R.id.plain);
    spnGenere = (Spinner)findViewById(R.id.spnGenere);
    ArrayAdapter<String> spGen = new ArrayAdapter<String>(context this, R.layout.support_simple_spinner_dropdown_item, elencogeneri);
    spnGenere.setAdapter(spGen);
    
    gb= new GestoreBrani();
    btnInserisci.setOnClickListener(newView.OnClickListener()
    {
      @Override
      public void onClick(View view)
      {
        String testo = spnGenere.getSelectedItem().toString();
        gb.addBrano(txtitolo.getText().toString());
      }
    }];
   }
}
