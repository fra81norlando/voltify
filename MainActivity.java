package com.example.voltify;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
{
Button btnInserisci;
EditText txtitolo;
GestoreBrani gb;
  @Override
  protected void onCreate(Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
    setContentView(R.Layout.activity_main);
    btnInserisci=findViewById(R.id.btnInserisci);
    txtitolo=findViewById(R.id.plain);
    gb= new GestoreBrani();
    btnInserisci.setOnClickListener(newView.OnClickListener()
    {
      @Override
      public void onClick(View view)
      {
        gb.addBrano(txtitolo.getText().toString());
      }
    }];
   }
}
