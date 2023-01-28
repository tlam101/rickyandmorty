package practice.project.rickandmorty;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Spinner;

import java.net.HttpURLConnection;
import java.net.URL;

public class SelectLocationActivity extends AppCompatActivity {
    HttpURLConnection urlConnection = null;
    URL url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_location);

    }

}