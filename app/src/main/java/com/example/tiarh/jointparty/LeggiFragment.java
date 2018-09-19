package com.example.tiarh.jointparty;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

/**
 * Created by tiarh on 12/09/2018.
 */

public class LeggiFragment extends Fragment {

    ////////////////////////// CUSTOM BANDIERE //////////////////////////

    String ListItemsName[] = new String[]{"Afganistan", "Albania", "Algeria", "Andorra", "Barbuda", "Argentina", "Armenia", "Australia", "Azerbaijan", "Bahamas", "Bahrain", "Bangladesh",
                                          "Barbados", "Belarus", "Belgium", "Belize", "Benin", "Bhutan", "Bolivia", "Bosnia", "Botswana", "Brazil", "Brunei", "Bulgaria", "Burkina-Faso",
                                          "Burundi", "cambodia", "cameroon", "canada", "Cape Verde", "Africa Centrale", "Chad", "Chile", "China", "Colombia", "Comoros", "Congo democratic",
                                          "Congo republic", "Costa Rica", "Cote d'Ivoire", "Croatia", "Cuba", "Cyprus", "Czech republic", "Denmark", "Djibouti", "Dominica", "Dominican republic",
                                          "East Timor", "Ecuador", "Egypt", "El Salvador", "Equatorial Guinea", "Eritrea", "Estonia", "Ethiopia", "Fiji", "Finland", "France", "Gabon", "Gambia",
                                          "Georgia", "Germany", "Ghana", "Grecee", "Grenada", "Guatemale", "Guinea", "Guinea Bissau", "Guyana", "Haiti", "Honduras", "Hungary", "Iceland", "India",
                                          "Indonesia", "Iran", "Iraq", "Ireland", "Israel", "Italy", "Jamaica", "Japan", "Jordan", "Kazakhstan", "Kenya"};
    Integer ImageName[] = {
            R.drawable.afghanistan,
            R.drawable.albania,
            R.drawable.algeria,
            R.drawable.andorra,
            R.drawable.antigua_and_barbuda,
            R.drawable.argentina,
            R.drawable.armenia,
            R.drawable.australia,
            R.drawable.azerbaijan,
            R.drawable.bahamas,
            R.drawable.bahrain,
            R.drawable.bangladesh,
            R.drawable.barbados,
            R.drawable.belarus,
            R.drawable.belgium,
            R.drawable.belize,
            R.drawable.benin,
            R.drawable.bhutan,
            R.drawable.bolivia,
            R.drawable.bosnia_and_herzegovina,
            R.drawable.botswana,
            R.drawable.brazil,
            R.drawable.brunei,
            R.drawable.bulgaria,
            R.drawable.burkina_faso,
            R.drawable.burundi,
            R.drawable.cambodia,
            R.drawable.cameroon,
            R.drawable.canada,
            R.drawable.cape_verde,
            R.drawable.central_african_republic,
            R.drawable.chad,
            R.drawable.chile,
            R.drawable.china,
            R.drawable.colombia,
            R.drawable.comoros,
            R.drawable.congo_democratic,
            R.drawable.congo_republic,
            R.drawable.costa_rica,
            R.drawable.cote_d_ivoire,
            R.drawable.croatia,
            R.drawable.cuba,
            R.drawable.cyprus,
            R.drawable.czech_republic,
            R.drawable.denmark,
            R.drawable.djibouti,
            R.drawable.dominica,
            R.drawable.dominican_republic,
            R.drawable.east_timor,
            R.drawable.ecuador,
            R.drawable.egypt,
            R.drawable.el_salvador,
            R.drawable.equatorial_guinea,
            R.drawable.eritrea,
            R.drawable.estonia,
            R.drawable.ethiopia,
            R.drawable.fiji,
            R.drawable.finland,
            R.drawable.france,
            R.drawable.gabon,
            R.drawable.gambia,
            R.drawable.georgia,
            R.drawable.germany,
            R.drawable.ghana,
            R.drawable.grecee,
            R.drawable.grenada,
            R.drawable.guatemala,
            R.drawable.guinea,
            R.drawable.guinea_bissau,
            R.drawable.guyana,
            R.drawable.haiti,
            R.drawable.honduras,
            R.drawable.hungary,
            R.drawable.iceland,
            R.drawable.india,
            R.drawable.indonesia,
            R.drawable.iran,
            R.drawable.iraq,
            R.drawable.ireland,
            R.drawable.israel,
            R.drawable.italy,
            R.drawable.jamaica,
            R.drawable.japan,
            R.drawable.jordan,
            R.drawable.kazakhstan,
            R.drawable.kenya};
    GridView gridView;
    CustomAdapterBandiere customAdapterBandiere;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_leggi, container, false);

        ////////////////////////// CUSTOM BANDIERE //////////////////////////
        gridView = (GridView) view.findViewById(R.id.gridview);
        customAdapterBandiere = new CustomAdapterBandiere(getActivity(), ListItemsName, ImageName);
        gridView.setAdapter(customAdapterBandiere);

        return view;
    }
}
