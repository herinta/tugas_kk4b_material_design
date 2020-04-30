package com.java.drawernav.ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.java.drawernav.R;

public class SendFragment extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intent sms = new Intent(Intent.ACTION_SENDTO, Uri.parse("smsto:088983013546"));
        sms.putExtra("sms_body", "haloo gaessss");
        startActivity(sms);
        return inflater.inflate(R.layout.fragment_slideshow, container, true);

    }
}
