package unimagdalena.project.com.hgw1;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import java.text.MessageFormat;

import unimagdalena.project.com.hgw1.pojos.Persona;

public class MainActivity2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView textPersona = (TextView) findViewById(R.id.datosPersona);

        Button buttonBack = (Button) findViewById(R.id.btnRegresar);


        Persona persona=getIntent().getParcelableExtra("persona");
        textPersona.setText(MessageFormat.format("Name: {0}\nLastName: {1}\nMail: {2}\nPhone: {3}", persona.getNombre(), persona.getLastName(), persona.getEmail(), persona.getPhone()));

        buttonBack.setOnClickListener(view -> {
            Intent back=new Intent(MainActivity2.this,MainActivity.class);
            startActivity(back);
        });



    }
}
