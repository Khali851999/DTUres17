package com.example.sachin.dtures;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class SE extends AppCompatActivity {


    String type;
    private RecyclerView subjectrecyclerView;
    String[] semthreesub={"Analog Electronics","Data Structures","Object Oriented Programming","Web Technology","Modelling and Simulation","Engineering Economics","Java Programming"};
    String[] semfoursub={"Digital Electronics","Software Engineering","Computer Oraganization and Architecture","DataBase Management System","Discrete Structure","Fundamental of Management"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coe);
        final ArrayList<abcd> subject=new ArrayList<>();
        subject.add(new abcd("papa","dad",R.drawable.computerblack));
        subject.add(new abcd("Ma","Mom",R.drawable.computerblack));
        subject.add(new abcd("Beta","Son",R.drawable.computerblack));
        subject.add(new abcd("Beti","Daughter",R.drawable.computerblack));
        subject.add(new abcd("nani","grandmom",R.drawable.computerblack));
        subject.add(new abcd("nana","granddad",R.drawable.computerblack));

        ListView list = findViewById(R.id.lvf);
        wordextender item = new wordextender(this, subject);
        list.setAdapter(item);
        COE.ListUtils.setDynamicHeight(list);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                abcd word = subject.get(position);
                //Jo Karna Hai aage;
            }
        });

        final ArrayList<abcd> subject2 = new ArrayList<>();
        subject2.add(new abcd("Analog Electronics", "....", R.drawable.computerblack));
        subject2.add(new abcd("Data Structure", "....", R.drawable.computerblack));
        subject2.add(new abcd("Object Oriented Programming", "....", R.drawable.computerblack));
        subject2.add(new abcd("Digital Electronics", "....", R.drawable.computerblack));
        subject2.add(new abcd("Discrete Structures", "....", R.drawable.computerblack));

        ListView list2 = findViewById(R.id.lvf2);
        wordextender item2 = new wordextender(this, subject2);
        list2.setAdapter(item2);
        COE.ListUtils.setDynamicHeight(list2);
        list2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                abcd word = subject2.get(position);
                //Jo Karna Hai aage;
            }
        });

    }

    public static class ListUtils {
        public static void setDynamicHeight(ListView mListView) {
            ListAdapter mListAdapter = mListView.getAdapter();
            if (mListAdapter == null) {
                // when adapter is null
                return;
            }
            int height = 0;
            int desiredWidth = View.MeasureSpec.makeMeasureSpec(mListView.getWidth(), View.MeasureSpec.UNSPECIFIED);
            for (int i = 0; i < mListAdapter.getCount(); i++) {
                View listItem = mListAdapter.getView(i, null, mListView);
                listItem.measure(desiredWidth, View.MeasureSpec.UNSPECIFIED);
                height += listItem.getMeasuredHeight();
            }
            ViewGroup.LayoutParams params = mListView.getLayoutParams();
            params.height = height + (mListView.getDividerHeight() * (mListAdapter.getCount() - 1));
            mListView.setLayoutParams(params);
            mListView.requestLayout();
        }

    }
}
