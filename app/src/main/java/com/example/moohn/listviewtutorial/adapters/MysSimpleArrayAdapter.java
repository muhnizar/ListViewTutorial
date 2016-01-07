package com.example.moohn.listviewtutorial.adapters;

import android.content.Context;
import android.widget.ArrayAdapter;

/**
 * Created by moohn on 1/8/2016.
 */
public class MysSimpleArrayAdapter extends ArrayAdapter<String> {

    private final Context context;
    private final String[] values;


    public MysSimpleArrayAdapter(Context context, int resource, String[] values) {
        super(context, -1, values);
        this.context = context;
        this.values = values;
    }

}
