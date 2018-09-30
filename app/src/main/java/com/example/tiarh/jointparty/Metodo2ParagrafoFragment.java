package com.example.tiarh.jointparty;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Metodo2ParagrafoFragment extends Fragment implements View.OnClickListener {

    CardView introduzione;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tecnica2_paragrafi, container, false);

        introduzione = view.findViewById(R.id.introduzione);

        introduzione.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {

        switch(v.getId()) {
            case R.id.introduzione: MainActivity.setViewPager(6);break;
            default:break;
        }
    }
}
