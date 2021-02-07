package com.example.navigationcomponentfragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

public class FirstFragment extends Fragment {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first, container, false);
        view.findViewById(R.id.btn1).setOnClickListener(view1 -> {
            Navigation.findNavController(getView()).navigate(R.id.action_firstFragment_to_secondFragment);
        });
        return view;
    }
}