package com.example.sachin.dtures;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class EE extends AppCompatActivity {

    String type;
    private RecyclerView subjectrecyclerView;
    String[] semthreesub = {"Numerical and Engineering ", "Network Analysis and Synthesis", "Electronics Devices and Circuits", "ElectroMechanical Energy Conversion and Transformers", "", "Engineering Economics"};
    String[] semfoursub = {"Power Plant Engineering ", "Electromagnetic Field Theory", "Digital Circuits and Systems", "Control System", "Asynchronous and Synchronous Machine", "Fundamental of Management"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coe);
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
        final ArrayList<abcd> subject2=new ArrayList<>();
        subject2.add(new abcd("papaKABETA","dad",R.drawable.computerblack));
        subject2.add(new abcd("Ma","Mom",R.drawable.computerblack));
        subject2.add(new abcd("Beta","Son",R.drawable.computerblack));
        subject2.add(new abcd("Beti","Daughter",R.drawable.computerblack));
        subject2.add(new abcd("nani","grandmom",R.drawable.computerblack));
        subject2.add(new abcd("nana","granddad",R.drawable.computerblack));
        ListView list2=findViewById(R.id.lvf2);
        wordextender item2=new wordextender(this,subject2);
        list2.setAdapter(item2);

        list2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                abcd word=subject2.get(position);
                //Jo Karna Hai aage;
            }
        });
    }
}
