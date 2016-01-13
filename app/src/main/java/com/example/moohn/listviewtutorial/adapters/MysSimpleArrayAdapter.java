package com.example.moohn.listviewtutorial.adapters;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.moohn.listviewtutorial.R;



public class MysSimpleArrayAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] values;


    static class ViewHolder {
        public TextView text;
        public ImageView image;
    }

    public MysSimpleArrayAdapter(Activity context , String[] values) {
        super(context, R.layout.rowlayout, values);
        this.context = context;
        this.values = values;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View rowView = convertView;

//        reuse view

        if (rowView ==  null){

            LayoutInflater layoutInflater = context.getLayoutInflater();
            rowView = layoutInflater.inflate(R.layout.rowlayout,null);

//          configure view holder
            ViewHolder viewHolder =  new ViewHolder();
            viewHolder.text = (TextView) rowView.findViewById(R.id.label);
            viewHolder.image = (ImageView) rowView.findViewById(R.id.icon);

            rowView.setTag(viewHolder);
        }

        // fill data
        ViewHolder holder = (ViewHolder) rowView.getTag();
        String s = values[position];

        holder.text.setText(s);

        if (s.contains("Windows")) {
            holder.image.setImageResource(R.drawable.no);
        } else {
            holder.image.setImageResource(R.drawable.ok);
        }

        return rowView;
    }
}
