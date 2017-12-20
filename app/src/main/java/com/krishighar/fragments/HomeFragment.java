package com.krishighar.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.krishighar.R;

public class HomeFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        initializeViews(view);
        initialiseListeners();
        setUpRecyclerView();
        return view;
    }

    private void initializeViews(View view) {

    }

    private void initialiseListeners() {


    }

    private void setUpRecyclerView() {
    }

}
