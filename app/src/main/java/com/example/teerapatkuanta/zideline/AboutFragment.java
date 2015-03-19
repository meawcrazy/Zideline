package com.example.teerapatkuanta.zideline;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Teerapat Kuanta on 8/3/2558.
 */
public class AboutFragment extends Fragment {

    public static AboutFragment newInstance () {
        AboutFragment aboutFragment = new AboutFragment();
        return aboutFragment;
    }

    public AboutFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_about,container,false);
        return rootView;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

        ((MainActivity)activity).onSectionAttached(1);

    }
}
