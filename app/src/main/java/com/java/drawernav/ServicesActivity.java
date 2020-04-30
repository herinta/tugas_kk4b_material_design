package com.java.drawernav;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toolbar;

import com.java.drawernav.ui.main.SectionsPagerAdapter;

public class ServicesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_services);
        Toolbar toolbar = findViewById(R.id.toolbar);
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);
        FloatingActionButton fab = findViewById(R.id.fab);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup, container, Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.activity_services, container, false);
            TextView.textView= rootView.findViewById(R.id.section_label);
            text.setText(getString(R.string.section_format, (getArguments().getInt(ARG_SECTION_NUMBER))));

            int[] arrayGambar = {
                    R.drawable.haha,
                    R.drawable.hehe,
                    R.drawable.hihi
            };
            ImageView imageView = rootView.findViewById(R.id.section_image);
            ImageView.setImageResource(arrayGambar[(getArguments().getInt(ARG_SECTION_NUMBER)-1)]);
        }
    }
}