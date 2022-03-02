package com.example.gridview;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<Brands> brandsArrayList;
    MyAdapter myAdapter;
    String[] brandsHeading;
    int[] imageResourceId;

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);

        brandsArrayList = new ArrayList<Brands>();

        myAdapter = new MyAdapter(this, brandsArrayList);
        recyclerView.setAdapter(myAdapter);

        brandsHeading = new String[]{
                "StumpTown",
                "Intelligentsia",
                "MountHagen",
                "La Colombe",
                "Death Whish",
                "Seattle's",
                "Lavazza",
                "Peerless",
                "New England",
                "Red Bay Coffee",
                "Counter Culture",
                "Green Mountain Coffee"

        };

        imageResourceId = new int[]{
                R.drawable.stumptown,
                R.drawable.intelligentsia,
                R.drawable.mounthagen,
                R.drawable.coloumbe,
                R.drawable.deathwish,
                R.drawable.seattle,
                R.drawable.lavazzar,
                R.drawable.peerless,
                R.drawable.newengland,
                R.drawable.redbay,
                R.drawable.counterculture,
                R.drawable.greenmountain
        };

        getData();


    }

        private void getData() {
            for (int i = 0; i < brandsHeading.length; i++) {
                Brands brands = new Brands(brandsHeading[i], imageResourceId[i]);
                brandsArrayList.add(brands);
            }
            myAdapter.notifyDataSetChanged();
        }
        }



