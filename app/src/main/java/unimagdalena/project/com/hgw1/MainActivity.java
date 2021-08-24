package unimagdalena.project.com.hgw1;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

import unimagdalena.project.com.hgw1.pojos.Persona;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText nameTxt = (EditText) findViewById(R.id.txtNombre);
        EditText lasNameTxt = (EditText) findViewById(R.id.txtApellido);
        EditText emailTxt = (EditText) findViewById(R.id.TextEmail);
        EditText phoneTxt = (EditText) findViewById(R.id.TextTelefono);
        Button btnButton = (Button) findViewById(R.id.btmEnviar);
        Button btn = (Button) findViewById(R.id.button2);

        btn.setOnClickListener(view -> {
            Intent in=new Intent(MainActivity.this,Main3Activity.class);
            startActivity(in);
        });

        btnButton.setOnClickListener(view -> {
            String name = nameTxt.getText().toString();
            String lastName = lasNameTxt.getText().toString();
            String email = emailTxt.getText().toString();
            long phone = Long.parseLong(phoneTxt.getText().toString());

            Persona persona = new Persona(name,lastName,email,phone);


            Intent send = new Intent(MainActivity.this, MainActivity2.class);
            send.putExtra("persona", persona);
            startActivity(send);

        });


    }
}












