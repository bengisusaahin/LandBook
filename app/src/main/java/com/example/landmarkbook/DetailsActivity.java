package com.example.landmarkbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.landmarkbook.databinding.ActivityDetailsBinding;

public class DetailsActivity extends AppCompatActivity {

    private ActivityDetailsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailsBinding.inflate(getLayoutInflater()); //xml ile kodu bağlama
        View view = binding.getRoot(); //xml yerine bagladigimiz yer cikiyor
        setContentView(view);

        Intent intent = getIntent();

        //Casting
        Landmark selectedLandMark = (Landmark) intent.getSerializableExtra("landmark");

        binding.nameText.setText(selectedLandMark.name);
        binding.countryText.setText(selectedLandMark.country);
        binding.imageView.setImageResource(selectedLandMark.image);
    }
}