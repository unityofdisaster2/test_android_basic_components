package udemyandroid.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
    TextView email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        //aqui se almacenan todos los extras definidos en intent
        Bundle extras = getIntent().getExtras();
        String emailUsuario = extras.getString("valorEmail");

        email = findViewById(R.id.textViewEmail);


        email.setText("Bienvenido: "+emailUsuario);
    }
}
