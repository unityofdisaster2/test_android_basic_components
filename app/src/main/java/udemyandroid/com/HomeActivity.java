package udemyandroid.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    //TextView email;

    ListView lista;

    List<String> androidVersionList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        //aqui se almacenan todos los extras definidos en intent
        Bundle extras = getIntent().getExtras();
        String emailUsuario = extras.getString("valorEmail");
        setTitle(emailUsuario);

        //se busca componente de listView

        lista = findViewById(R.id.listaVista);


        //se carga lista de elementos

        androidVersionList = new ArrayList<>();
        androidVersionList.add("Pie");
        androidVersionList.add("Oreo");
        androidVersionList.add("Nougat");
        androidVersionList.add("MarshMallow");
        androidVersionList.add("Lollipop");
        androidVersionList.add("Kitkat");
        androidVersionList.add("...");

        //adaptador toma todos los elementos de la lista y las va pintando
        //dentro del listview

        ArrayAdapter adaptadorVersionesAndroid = new ArrayAdapter(
                this,
                android.R.layout.simple_list_item_1,
                androidVersionList
        );

        //vinculacion de listview con lista del adaptador


        lista.setAdapter(adaptadorVersionesAndroid);


        //gestion de evento click sobre elementos de la lista
        lista.setOnItemClickListener(this);





        /*
        email = findViewById(R.id.textViewEmail);


        email.setText("Bienvenido: "+emailUsuario);
        */


    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String androidVersion = androidVersionList.get(position);
        Log.i("APP","version click "+androidVersion);
    }
}
