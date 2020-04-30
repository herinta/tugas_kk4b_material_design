package com.java.drawernav.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.java.drawernav.R;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;

    ImageView logo;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        logo = view.findViewById(R.id.imageView4);

        logo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText( getContext(),"Test Toast", Toast.LENGTH_SHORT).show();
            }
        });

        return view;

    }
}
