package com.example.landmarkbook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Landmark> landmarkArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        landmarkArrayList = new ArrayList<>();
        //Data
        Landmark pisa = new Landmark("Pisa","Italy", R.drawable.Pisa);
        Landmark eiffel = new Landmark("Eiffel","France", R.drawable.eiffel);
        Landmark coliseum = new Landmark("Coliseum","Italy", R.drawable.coliseum);
        Landmark londonBridge = new Landmark("London Bridge","UK", R.drawable.london);

        landmarkArrayList.add(pisa);
        landmarkArrayList.add(eiffel);
        landmarkArrayList.add(coliseum);
        landmarkArrayList.add(londonBridge);
    }
}