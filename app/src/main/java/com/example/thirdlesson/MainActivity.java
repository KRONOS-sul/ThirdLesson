package com.example.thirdlesson;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.thirdlesson.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> arrayList = new ArrayList<>();
    ActivityMainBinding binding;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        recyclerView = findViewById(R.id.recyclerView);

        arrayList.add("Sultan");
        arrayList.add("Varis");
        arrayList.add("Ken4");
        arrayList.add("Zulfiya");
        arrayList.add("Chyngyz");

        ContactAdapter adapter = new ContactAdapter(arrayList);
        recyclerView.setAdapter(adapter);
    }
}