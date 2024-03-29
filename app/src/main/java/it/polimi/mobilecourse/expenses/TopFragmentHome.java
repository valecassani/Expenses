package it.polimi.mobilecourse.expenses;

import android.app.Fragment;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;


/**
 * Created by Matteo on 16/11/2014.
 */
public class TopFragmentHome extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.top_fragment, container, false);

        ImageView plusButton=(ImageView) rootView.findViewById(R.id.imageView);
        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent myintent=new Intent(view.getContext(),NewOperation.class);
                startActivity(myintent);
            }
        });

        ImageView buttonadd=(ImageView)rootView.findViewById(R.id.linkbar);
        buttonadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myint=new Intent(rootView.getContext(),ProvaInsert.class);
                startActivity(myint);
            }
        });

        ImageView buttonshow=(ImageView)rootView.findViewById(R.id.imageView3);
        buttonshow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myi=new Intent(rootView.getContext(),ProvaShowResult.class);
                startActivity(myi);
            }
        });





        return rootView;






    }
}