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

        //se busca el nombre del componente en la vista y se asigna a una variable para controlarlo
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

        String email = editTextEmail.getText().toString();
        String password = editTextPassword.getText().toString();

        if(!email.isEmpty() && !password.isEmpty()){
            //para navegar a otro activity
            Intent intentLogin = new Intent(this,HomeActivity.class);
            //se utiliza putExtra para mandar valores a otra activity
            intentLogin.putExtra("valorEmail",email);

            startActivity(intentLogin);
        }else{
            editTextEmail.setError("Complete el email y la contraseña");
        }


    }
}
