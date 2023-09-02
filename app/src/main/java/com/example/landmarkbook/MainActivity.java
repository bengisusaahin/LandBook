package com.example.landmarkbook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;

import com.example.landmarkbook.databinding.ActivityDetailsBinding;
import com.example.landmarkbook.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class MainActivity extends AppCompatActivity {

    ArrayList<Landmark> landmarkArrayList;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        binding = ActivityMainBinding.inflate(getLayoutInflater()); //xml ile kodu bağlama
        View view = binding.getRoot(); //xml yerine bagladigimiz yer cikiyor
        setContentView(view);

        landmarkArrayList = new ArrayList<>();
        //Data
        Landmark pisa = new Landmark("Pisa","Italy", R.drawable.pisa);
        Landmark eiffel = new Landmark("Eiffel","France", R.drawable.eiffel);
        Landmark coliseum = new Landmark("Coliseum","Italy", R.drawable.coliseum);
        Landmark londonBridge = new Landmark("London Bridge","UK", R.drawable.london);

        landmarkArrayList.add(pisa);
        landmarkArrayList.add(eiffel);
        landmarkArrayList.add(coliseum);
        landmarkArrayList.add(londonBridge);

        //Adapter
         //ListView

        //mapping
        ArrayAdapter arrayAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1,
                landmarkArrayList.stream().map(landmark -> landmark.name).collect(Collectors.toList())
        );
        binding.listView.setAdapter(arrayAdapter);

    }
}