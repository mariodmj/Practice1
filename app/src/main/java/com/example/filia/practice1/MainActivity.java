package com.example.filia.practice1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    Button bt0, bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, btpunto, btsuma, btresta, btmulti, btdivi, btigual, btborrar;
    EditText eNumero;
    TextView eNumero2;

    double resultado=0,num1,num2;
    int numero1;
    String ope;
    boolean decimal = false;
    boolean suma=false;
    boolean resta=false;
    boolean multi=false;
    boolean divi=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btborrar = (Button) findViewById(R.id.btborrar);
        btborrar.setOnClickListener(this);
        btigual = (Button) findViewById(R.id.btigual);
        btigual.setOnClickListener(this);
        btdivi = (Button) findViewById(R.id.btdivi);
        btdivi.setOnClickListener(this);
        btmulti = (Button) findViewById(R.id.btmulti);
        btmulti.setOnClickListener(this);
        btresta = (Button) findViewById(R.id.btresta);
        btresta.setOnClickListener(this);
        btsuma = (Button) findViewById(R.id.btsuma);
        btsuma.setOnClickListener(this);
        btpunto = (Button) findViewById(R.id.btpunto);
        btpunto.setOnClickListener(this);
        bt9 = (Button) findViewById(R.id.bt9);
        bt9.setOnClickListener(this);
        bt8 = (Button) findViewById(R.id.bt8);
        bt8.setOnClickListener(this);
        bt7 = (Button) findViewById(R.id.bt7);
        bt7.setOnClickListener(this);
        bt6 = (Button) findViewById(R.id.bt6);
        bt6.setOnClickListener(this);
        bt5 = (Button) findViewById(R.id.bt5);
        bt5.setOnClickListener(this);
        bt4 = (Button) findViewById(R.id.bt4);
        bt4.setOnClickListener(this);
        bt3 = (Button) findViewById(R.id.bt3);
        bt3.setOnClickListener(this);
        bt2 = (Button) findViewById(R.id.bt2);
        bt2.setOnClickListener(this);
        bt1 = (Button) findViewById(R.id.bt1);
        bt1.setOnClickListener(this);
        bt0 = (Button) findViewById(R.id.bt0);
        bt0.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        eNumero = (EditText) findViewById(R.id.eNumero);
        eNumero2 = (TextView)findViewById(R.id.eNumero2);
        ope=eNumero.getText().toString();

        numero1 = v.getId();
        try {
            switch (numero1) {

                case R.id.bt0:
                    eNumero.setText(ope+"0");
                    break;
                case R.id.bt1:
                    eNumero.setText(ope+"1");
                    break;
                case R.id.bt2:
                    eNumero.setText(ope+"2");
                    break;
                case R.id.bt3:
                    eNumero.setText(ope+"3");
                    break;
                case R.id.bt4:
                    eNumero.setText(ope+"4");
                    break;
                case R.id.bt5:
                    eNumero.setText(ope+"5");
                    break;
                case R.id.bt6:
                    eNumero.setText(ope+"6");
                    break;
                case R.id.bt7:
                    eNumero.setText(ope+"7");
                    break;
                case R.id.bt8:
                    eNumero.setText(ope+"8");
                    break;
                case R.id.bt9:
                    eNumero.setText(ope+"9");
                    break;
                case R.id.btsuma:
                    suma=true;
                    eNumero.setText("");
                    num1 = Double.parseDouble(ope);


                    eNumero2.setText(String.valueOf(num1)+ " + ");
                   resultado=resultado+num1;
                    if(suma==true){
                        resultado=num1+num2;

                        eNumero2.setText(String.valueOf(resultado));
                        num1=resultado;
                    }
                    decimal=false;

                    break;
                case R.id.btresta:
                    resta=true;
                    num1 = Double.parseDouble(ope);
                    eNumero.setText("");
                    eNumero2.setText(String.valueOf(num1));
                    decimal=false;
                    break;
                case R.id.btmulti:
                    multi=true;
                    num1 = Double.parseDouble(ope);
                    eNumero.setText("");
                    eNumero2.setText(String.valueOf(num1));
                    decimal=false;
                    break;
                case R.id.btdivi:
                    divi=true;
                    num1 = Double.parseDouble(ope);
                    eNumero.setText("");
                    eNumero2.setText(String.valueOf(num1));
                    decimal=false;
                    break;
                case R.id.btpunto:
                    if (decimal==false){
                        eNumero.setText(ope+".");
                        decimal=true;
                    }else{return;}
                    break;
                case R.id.btigual:
                   num2=Double.parseDouble(ope);
                    eNumero.setText("");
                  if(suma==true){
                      resultado=num1+num2;
                      eNumero.setText(String.valueOf(resultado));
                      eNumero2.setText(String.valueOf(resultado));
                      num1=resultado;
                  }
                    else if (resta==true){
                        resultado=num1-num2;
                        eNumero.setText(String.valueOf(resultado));
                      num1=resultado;
                    }
                    else if(multi==true){
                        resultado=num1*num2;
                        eNumero.setText(String.valueOf(resultado));
                      num1=resultado;
                    }
                   else  if(divi==true){
                        resultado=num1/num2;
                        eNumero.setText(String.valueOf(resultado));
                      num1=resultado;
                    }
                    decimal =false;
                    suma=false;
                    resta=false;
                    multi=false;
                    divi=false;
                    eNumero2.setText("");
                    break;

                case R.id.btborrar:
                    eNumero.setText("");
                    decimal=false;
                    break;


            }
        } catch (Exception e) {
            eNumero.setText("error");
        }
    }
}