package com.agendatoracme;

public class ItemListView {
    private int photo;
    private String name;

    ItemListView(int _photo, String _name)
    {
        photo = _photo;
        name = _name;
    }

    public int GetPhoto()
    {
        return photo;
    }

    public void SetPhoto(int _photo)
    {
        photo = _photo;
    }

    public String GetName()
    {
        return name;
    }

    public void SetName(String _name)
    {
        name = _name;
    }
}
