package com.example.exmplapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText taille= null;
    private EditText poid= null;

    private Button btn = null;
    private TextView result= null;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     taille = (EditText) findViewById(R.id.taille);
     poid = (EditText) findViewById(R.id.poid);
     btn= (Button) findViewById(R.id.btn);
     result=(TextView) findViewById(R.id.result);


     btn.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {

             double t = Double.parseDouble(taille.getText().toString());
             double p= Double.parseDouble(poid.getText().toString());

             double r=p / (t*t);

             String res= "";


             if(r > 40){
               res= "obesité morbide ou massive";
             }else{ if(r<= 40 && r>= 35){
                 res="obesité  sévéré";

             }else if(r<35  && r>=30){
                 res="obsité moderée";
             } else if(r <33 && r>=25) {
                 res = "surpoids";
             }

             result.setText(res);

             }



         }
                            }


     );















    }
}