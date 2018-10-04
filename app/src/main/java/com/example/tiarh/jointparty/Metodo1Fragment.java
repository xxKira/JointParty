package com.example.tiarh.jointparty;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.text.BreakIterator;

/**
 * Created by tiarh on 13/09/2018.
 */

public class Metodo1Fragment extends Fragment {

    static TextView metodo1_contenuto1, metodo1_titolo;
    static ImageView metodo1_immagine1;
    static FloatingActionButton avanti_metodo1, indietro_metodo1;
    RelativeLayout relative;

    final Handler handler = new Handler();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tecnica1, container, false);

        metodo1_contenuto1 = view.findViewById(R.id.metodo1_contenuto1);
        metodo1_titolo = view.findViewById(R.id.metodo1_titolo1);

        metodo1_immagine1 = view.findViewById(R.id.metodo1_immagine1);

        avanti_metodo1 = view.findViewById(R.id.avanti_metodo1);
        indietro_metodo1 = view.findViewById(R.id.indietro_metodo1);

        relative = view.findViewById(R.id.relative);

        relative.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_MOVE) {
                    avanti_metodo1.show();
                    indietro_metodo1.show();
                } else {
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            avanti_metodo1.hide();
                            indietro_metodo1.hide();
                        }
                    }, 1500);
                }
                return true;
            }
        });

        return view;
    }
}
