package practice.project.rickandmorty;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.ToggleButton;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    protected String spinnerChoice;
    public Spinner spinner;
    public CheckBox checkBox;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.selectionSpinner);
        checkBox = findViewById(R.id.orderCheckBox);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.choices, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        spinnerChoice = adapterView.getItemAtPosition(i).toString();
        Log.i("CHOICE", spinnerChoice);
        if (spinnerChoice.equals("Characters")) {
            Intent intentCharacter = new Intent(MainActivity.this, SelectCharacterActivity.class);
            startActivity(intentCharacter);
        } else if (spinnerChoice.equals("Locations")) {
            Intent intentLocation = new Intent(this, SelectLocationActivity.class);
            startActivity(intentLocation);
        } else {
            Toast.makeText(this, "Null", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}