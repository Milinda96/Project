package com.example.milindasenaka.immunizesrilanka.feature;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class UpdateFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        ((HomeActivity)getActivity()).setActionBarTitle("Update Stock");
        return inflater.inflate(R.layout.activity_update,container,false);
    }
}
