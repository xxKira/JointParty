package com.example.tiarh.jointparty;

import android.app.Activity;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by tiarh on 17/09/2018.
 */

public class CustomAdapterBandiere extends ArrayAdapter<String> {

    private final Activity Context;
    private final String[] ListItemsName;
    private final Integer[] ImageName;

    public CustomAdapterBandiere(Activity context, String[] content, Integer[] ImageName) {
        super(context, R.layout.layout_bandiere, content);

        this.Context = context;
        this.ListItemsName = content;
        this.ImageName = ImageName;
    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = Context.getLayoutInflater();
        View GridViewSingle = inflater.inflate(R.layout.layout_bandiere, parent, false);

        TextView tx = (TextView) GridViewSingle.findViewById(R.id.tx);
        ImageView img = (ImageView) GridViewSingle.findViewById(R.id.img);

        tx.setText(ListItemsName[position] + "\n");
        img.setImageResource(ImageName[position]);
        return GridViewSingle;
    }
}
