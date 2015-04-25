package com.example.geniucodepointer.smr_v1.Actions;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;

import com.example.geniucodepointer.smr_v1.R;
/**
 * Created by The King on 4/23/2015.
 */
public class DoActions implements Actions {


    public void initlizedFragmentManager(FragmentManager fragmentManager,Fragment fr){
        FragmentManager fm = fragmentManager;
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.main_fragment, fr);
        fragmentTransaction.commit();


    }
    @Override
    public void settings(FragmentManager fragmentManager,Fragment fr) {
        initlizedFragmentManager(fragmentManager,fr);

    }

    @Override
    public void editImage(FragmentManager fragmentManager,Fragment fr) {
        initlizedFragmentManager(fragmentManager,fr);


    }

    @Override
    public void getFriends(FragmentManager fragmentManager,Fragment fr) {
        initlizedFragmentManager(fragmentManager,fr);

    }
}
