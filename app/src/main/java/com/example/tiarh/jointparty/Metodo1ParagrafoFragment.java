package com.example.tiarh.jointparty;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

import static com.example.tiarh.jointparty.Metodo1Fragment.avanti_metodo1;
import static com.example.tiarh.jointparty.Metodo1Fragment.indietro_metodo1;
import static com.example.tiarh.jointparty.Metodo1Fragment.metodo1_contenuto1;
import static com.example.tiarh.jointparty.Metodo1Fragment.metodo1_immagine1;
import static com.example.tiarh.jointparty.Metodo1Fragment.metodo1_titolo;


public class Metodo1ParagrafoFragment extends Fragment implements View.OnClickListener {

    CardView paragrafo1, paragrafo2, paragrafo3, paragrafo4, paragrafo5, paragrafo6, paragrafo7;

    int nPagina = 0;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tecnica1_paragrafi, container, false);

        paragrafo1 = view.findViewById(R.id.paragrafo1);
        paragrafo2 = view.findViewById(R.id.paragrafo2);
        paragrafo3 = view.findViewById(R.id.paragrafo3);
        paragrafo4 = view.findViewById(R.id.paragrafo4);
        paragrafo5 = view.findViewById(R.id.paragrafo5);
        paragrafo6 = view.findViewById(R.id.paragrafo6);
        paragrafo7 = view.findViewById(R.id.paragrafo7);


        paragrafo1.setOnClickListener(this);
        paragrafo2.setOnClickListener(this);
        paragrafo3.setOnClickListener(this);
        paragrafo4.setOnClickListener(this);
        paragrafo5.setOnClickListener(this);
        paragrafo6.setOnClickListener(this);
        paragrafo7.setOnClickListener(this);

        return view;
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    private void PopolaMetodo_1(int titolo, int contenuto, int image){

        metodo1_titolo.setText(titolo);
        metodo1_contenuto1.setText(contenuto);
        metodo1_immagine1.setImageDrawable(getActivity().getDrawable(image));

        avanti_metodo1.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                Cambio_Pagina(nPagina++);
            }
        });

        indietro_metodo1.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                Cambio_Pagina(nPagina--);
            }
        });
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    private void Cambio_Pagina(int nPagina) {
        nPagina = this.nPagina;

        switch (nPagina) {
            case 1:
                PopolaMetodo_1(R.string.sottoTitolo_metodo1_passo1, R.string.contenuto_metodo1_passo1, R.drawable.metodo1_passo1);
                indietro_metodo1.hide();
                break;
            case 2:
                PopolaMetodo_1(R.string.sottoTitolo_metodo1_passo2, R.string.contenuto_metodo1_passo2, R.drawable.metodo1_passo2);
                indietro_metodo1.show();
                break;
            case 3:
                PopolaMetodo_1(R.string.sottoTitolo_metodo1_passo3, R.string.contenuto_metodo1_passo3, R.drawable.metodo1_passo3);
                break;
            case 4:
                PopolaMetodo_1(R.string.sottoTitolo_metodo1_passo4, R.string.contenuto_metodo1_passo4, R.drawable.metodo1_passo4);
                break;
            case 5:
                PopolaMetodo_1(R.string.sottoTitolo_metodo1_passo5, R.string.contenuto_metodo1_passo5, R.drawable.metodo1_passo5);
                break;
            case 6:
                PopolaMetodo_1(R.string.sottoTitolo_metodo1_passo6, R.string.contenuto_metodo1_passo6, R.drawable.metodo1_passo6);
                avanti_metodo1.show();
                break;
            case 7:
                PopolaMetodo_1(R.string.sottoTitolo_metodo1_passo7, R.string.contenuto_metodo1_passo7, R.drawable.metodo1_passo7);
                avanti_metodo1.hide();
                break;

            default:
                break;
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.paragrafo1:
                MainActivity.setViewPager(6);
                Cambio_Pagina(nPagina = 1);
                break;
            case R.id.paragrafo2:
                MainActivity.setViewPager(6);
                Cambio_Pagina(nPagina = 2);
                break;
            case R.id.paragrafo3:
                MainActivity.setViewPager(6);
                Cambio_Pagina(nPagina = 3);
                break;
            case R.id.paragrafo4:
                MainActivity.setViewPager(6);
                Cambio_Pagina(nPagina = 4);
                break;
            case R.id.paragrafo5:
                MainActivity.setViewPager(6);
                Cambio_Pagina(nPagina = 5);
                break;
            case R.id.paragrafo6:
                MainActivity.setViewPager(6);
                Cambio_Pagina(nPagina = 6);
                break;
            case R.id.paragrafo7:
                MainActivity.setViewPager(6);
                Cambio_Pagina(nPagina = 7);

                break;
                default:break;
        }
    }
}
