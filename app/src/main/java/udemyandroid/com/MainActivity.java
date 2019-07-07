package udemyandroid.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnLogin;
    EditText editTextEmail, editTextPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = findViewById(R.id.buttonLogin);
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextPassword = findViewById(R.id.editTextPassword);

        //Asignaccion del evento click
        btnLogin.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Button button = (Button)v;
        Log.i("APP","Click en login");
        //para navegar a otro activity
        String email = editTextEmail.getText().toString();
        String password = editTextPassword.getText().toString();

        if(!email.isEmpty() && !password.isEmpty()){
            Intent intentLogin = new Intent(this,HomeActivity.class);
            intentLogin.putExtra("valorEmail",email);
            startActivity(intentLogin);
        }else{
            editTextEmail.setError("Complete el email y la contraseña");
        }


    }
}
