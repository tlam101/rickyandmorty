package practice.project.rickandmorty;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    String characterQuery, locationQuery;

    protected String spinnerChoice;
    public Spinner spinner;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        characterQuery = "rickandmortyapi.com/api/character/";
        locationQuery = "rickandmortyapi.com/api/location/";

        spinner = findViewById(R.id.selectionSpinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.choices, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

        if (spinnerChoice.equals("Character")) {
            SelectCharacter();
        } else if (spinnerChoice.equals("Location")) {
            SelectLocation();
        }
    }

    protected void SelectCharacter() {
        Intent intentCharacter = new Intent(this, SelectCharacterActivity.class);
        startActivity(intentCharacter);
    }

    protected void SelectLocation() {
        Intent intentLocation = new Intent(this, SelectLocationActivity.class);
        startActivity(intentLocation);
    }

    @Override
    public void onClick(View view) {

    }
}