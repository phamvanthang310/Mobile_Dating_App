package com.example.thang.DatingApp.SildingTab;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.example.thang.DatingApp.AddNewFriends;
import com.example.thang.DatingApp.R;

/**
 * Created by Thang on 5/10/2015.
 */
public class Tab2  extends Fragment{
    //initial Float Action Button in tab-2
    ImageButton fab;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.tab_2,container,false);

        //set Float Action Button
        fab = (ImageButton) v.findViewById(R.id.fabAddNew);
        fab.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
//                Toast.makeText(getActivity(), "FAB is clicked", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(),AddNewFriends.class);
                startActivity(intent);
            }
        });

        return v;

    }
}
