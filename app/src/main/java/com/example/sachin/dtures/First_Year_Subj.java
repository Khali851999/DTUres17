package com.example.sachin.dtures;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class First_Year_Subj extends AppCompatActivity {



    private RecyclerView subjectrecyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first__year__subj);
        String type=getIntent().getStringExtra("type");
        final ArrayList<abcd> subject = new ArrayList<>();
        subject.add(new abcd("papa", "dad", R.drawable.computerblack));
        subject.add(new abcd("Ma", "Mom", R.drawable.computerblack));
        subject.add(new abcd("Beta", "Son", R.drawable.computerblack));
        subject.add(new abcd("Beti", "Daughter", R.drawable.computerblack));
        subject.add(new abcd("nani", "grandmom", R.drawable.computerblack));
        subject.add(new abcd("nana", "granddad", R.drawable.computerblack));

        ListView list = (ListView) findViewById(R.id.lvf);
        wordextender item = new wordextender(this, subject);
        list.setAdapter(item);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                abcd word = subject.get(position);
                //Jo Karna Hai aage;
            }
        });
    }
}
