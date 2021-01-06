package com.example.fragments_prac;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


public class Fragment2nd extends Fragment {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // Button b1= getActivity().findViewById(R.id.button);
       // b1.setOnClickListener(new View.OnClickListener() {
         //   @Override
           // public void onClick(View v) {
               // Toast.makeText(getActivity(), "Clicked", Toast.LENGTH_SHORT).show();
            //}
        //});
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        return inflater.inflate(R.layout.fregment_input,container,false);
    }
}
