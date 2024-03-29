package it.polimi.mobilecourse.expenses;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * Created by Matteo on 16/11/2014.
 */
public class BottomFragmentHome extends Fragment {


    ArrayAdapter<String> arrayAdapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View bottomView = inflater.inflate(R.layout.bottom_fragment, container, false);
        String [] actions= getResources().getStringArray(R.array.array_options);
        List<String> azioni=new ArrayList<String>();
        azioni.addAll(Arrays.asList(actions));
        arrayAdapter=new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,azioni);
        ListView lista=(ListView)bottomView.findViewById(R.id.listAction);

        lista.setAdapter(arrayAdapter);

        return bottomView;
    }

}