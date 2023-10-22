package com.agendatoracme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.graphics.Color;
import android.os.Bundle;
import android.service.autofill.OnClickAction;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView lsvSchedule;
    private ArrayList<ItemListView> items;
    private AdapterListView adapterListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lsvSchedule = (ListView) findViewById(R.id.lsvSchedule);

        lsvSchedule.setOnItemClickListener(this);
        Init();
    }
    private void Init()
    {
        DisplaySchedule();
    }

    private ArrayList<ItemListView> CreateSchedule()
    {
        items = new ArrayList<ItemListView>();

        ItemListView item1 = new ItemListView(R.drawable.foto1, "Juju");
        ItemListView item2 = new ItemListView(R.drawable.foto2, "Nicolas");
        ItemListView item3 = new ItemListView(R.drawable.foto3, "Pado");
        ItemListView item4 = new ItemListView(R.drawable.foto4, "Loirona");
        ItemListView item5 = new ItemListView(R.drawable.foto5, "Ruiva");
        ItemListView item6 = new ItemListView(R.drawable.foto6, "Chuck");

        items.add(item1);
        items.add(item2);
        items.add(item3);
        items.add(item4);
        items.add(item5);
        items.add(item6);

        return items;
    }

    private void DisplaySchedule()
    {
        adapterListView = new AdapterListView(this, CreateSchedule());
        lsvSchedule.setAdapter((ListAdapter) adapterListView);
        lsvSchedule.setCacheColorHint(Color.TRANSPARENT);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        ItemListView item = (ItemListView) adapterListView.getItem(i);

        Toast.makeText(this, item.GetName(), Toast.LENGTH_SHORT).show();
    }
}