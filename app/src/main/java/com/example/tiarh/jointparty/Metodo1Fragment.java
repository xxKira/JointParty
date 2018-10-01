package com.example.tiarh.jointparty;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.BreakIterator;

/**
 * Created by tiarh on 13/09/2018.
 */

public class Metodo1Fragment extends Fragment{

    static TextView metodo1_contenuto1, metodo1_titolo;
    static ImageView metodo1_immagine1;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tecnica1, container, false);

        metodo1_contenuto1 = view.findViewById(R.id.metodo1_contenuto1);
        metodo1_titolo = view.findViewById(R.id.metodo1_titolo1);

        metodo1_immagine1 = view.findViewById(R.id.metodo1_immagine1);

        return view;
    }
}
