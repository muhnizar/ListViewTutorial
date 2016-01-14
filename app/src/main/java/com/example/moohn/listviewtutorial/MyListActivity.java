package com.example.moohn.listviewtutorial;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import com.example.moohn.listviewtutorial.adapters.MySimpleArrayAdapter;

public class MyListActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[] values = buildData();
//  Custom adapater
        MySimpleArrayAdapter mySimpleArrayAdapter = new MySimpleArrayAdapter(this, values);
        setListAdapter(mySimpleArrayAdapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        String item = (String) getListAdapter().getItem(position);
        Toast.makeText(this, item + " selected", Toast.LENGTH_LONG).show();
    }

    protected static String[] buildData() {

        return new String[] { "Android", "iPhone", "WindowsMobile",
                "Blackberry", "WebOS", "Ubuntu", "Windows7", "Max OS X",
                "Linux", "OS/2", "Ubuntu", "Windows7", "Max OS X", "Linux",
                "OS/2", "Ubuntu", "Windows7", "Max OS X", "Linux", "OS/2",
                "Android", "iPhone", "WindowsMobile", "Blackberry", "WebOS",
                "Ubuntu", "Windows7", "Max OS X", "Linux", "OS/2", "Ubuntu",
                "Windows7", "Max OS X", "Linux", "OS/2", "Ubuntu", "Windows7",
                "Max OS X", "Linux", "OS/2", "Android", "iPhone",
                "WindowsMobile", "Blackberry", "WebOS", "Ubuntu", "Windows7",
                "Max OS X", "Linux", "OS/2", "Ubuntu", "Windows7", "Max OS X",
                "Linux", "OS/2", "Ubuntu", "Windows7", "Max OS X", "Linux",
                "OS/2", "Android", "iPhone", "WindowsMobile", "Blackberry",
                "WebOS", "Ubuntu", "Windows7", "Max OS X", "Linux", "OS/2",
                "Ubuntu", "Windows7", "Max OS X", "Linux", "OS/2", "Ubuntu",
                "Windows7", "Max OS X", "Linux", "OS/2" };
    }
}
