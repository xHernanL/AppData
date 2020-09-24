package com.example.appdata;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DataActivity extends AppCompatActivity {

    TextView tvInfoEnviada;
    TextView tvPhone;
    TextView tvDate;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_up);

        tvInfoEnviada = (TextView)findViewById(R.id.tv1);
        tvPhone = (TextView)findViewById(R.id.tv2);
        tvDate = (TextView)findViewById(R.id.tvF);

        Bundle bundle = getIntent().getExtras();
        Bundle bundle1 = getIntent().getExtras();
        Bundle bundleF = getIntent().getExtras();

        String dato = bundle.getString("Info").toString();
        String datoF = bundleF.getString("datef".toString());
        String dato1 = bundle1.getString("phone".toString());

        tvInfoEnviada.setText("Nombre completo: " + dato);
        tvDate.setText("Fecha de nacimiento: "+datoF);
        tvPhone.setText("Telefono: " + dato1);
    }
}