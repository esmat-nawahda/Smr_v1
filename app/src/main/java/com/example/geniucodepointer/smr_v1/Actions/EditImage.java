package com.example.geniucodepointer.smr_v1.Actions;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.geniucodepointer.smr_v1.R;

/**
 * Created by The King on 4/23/2015.
 */
public class EditImage extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        //Inflate the layout for this fragment

        return inflater.inflate(
                R.layout.editImage_fragment, container, false);
    }
}

