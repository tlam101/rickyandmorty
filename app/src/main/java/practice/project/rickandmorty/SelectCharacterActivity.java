package practice.project.rickandmorty;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class SelectCharacterActivity extends AppCompatActivity {
    HttpURLConnection urlConnection = null;
    URL url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_character);
    }

    public String getJson(String query) {
        String result = "";
        try {
            url = new URL(query);
            urlConnection = (HttpURLConnection) url.openConnection();
            InputStream in = urlConnection.getInputStream();
            InputStreamReader isw = new InputStreamReader(in);
            int data = isw.read();
            while (data != -1)
            {
                result += (char) data;
                data = isw.read();
            }
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (urlConnection != null) {
                urlConnection.disconnect();
            }
        }
        return result;
    }
}