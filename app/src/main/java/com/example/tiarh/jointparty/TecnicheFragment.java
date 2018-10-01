package com.example.tiarh.jointparty;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by tiarh on 12/09/2018.
 */

public class TecnicheFragment extends Fragment implements View.OnClickListener {

    private CardView metodo_1, metodo_2;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tecniche, container, false);

        metodo_1 = view.findViewById(R.id.metodo_1);
        metodo_2 = view.findViewById(R.id.metodo_2);

        metodo_1.setOnClickListener(this);
        metodo_2.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {

        switch(v.getId()) {
            case R.id.metodo_1: MainActivity.setViewPager(5); break; //5
            case R.id.metodo_2: MainActivity.setViewPager(7); break;
            default:break;
        }
    }
}
