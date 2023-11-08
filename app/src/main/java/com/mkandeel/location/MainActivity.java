package com.mkandeel.location;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.beastwall.localisation.Localisation;
import com.beastwall.localisation.model.City;
import com.beastwall.localisation.model.Country;
import com.beastwall.localisation.model.State;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Spinner spn_country,spn_state,spn_city;
    private List<String> countries,cities,states;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
    }

    private void initViews(){
        spn_country = findViewById(R.id.spn_country);
        spn_city = findViewById(R.id.spn_city);
        spn_state = findViewById(R.id.spn_state);
    }
}