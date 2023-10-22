package com.agendatoracme;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AdapterListView extends BaseAdapter {

    private final LayoutInflater fragmentInflater;
    private final ArrayList<ItemListView> items;

    public AdapterListView(Context context, ArrayList<ItemListView> _items)
    {
        items = _items;
        fragmentInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int index) {
        return items.get(index);
    }

    @Override
    public long getItemId(int index) {
        return index;
    }

    @SuppressLint({"ViewHolder", "InflateParams"})
    @Override
    public View getView(int index, View view, ViewGroup viewGroup) {
        ItemListView item = items.get(index);
        view = fragmentInflater.inflate(R.layout.item_listview, null);

        ((TextView) view.findViewById(R.id.txtName)).setText(item.GetName());
        ((ImageView) view.findViewById(R.id.imgPhoto)).setImageResource(item.GetPhoto());

        return view;
    }
}
