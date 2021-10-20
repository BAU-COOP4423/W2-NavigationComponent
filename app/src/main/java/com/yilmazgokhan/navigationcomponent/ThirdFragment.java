package com.yilmazgokhan.navigationcomponent;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

public class ThirdFragment extends Fragment {

    private final String TAG = "Custom_Tag_Nav";

    public ThirdFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.d(TAG, "onAttach: ThirdFragment");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate: ThirdFragment");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.d(TAG, "onCreateView: ThirdFragment");
        return inflater.inflate(R.layout.fragment_third, container, false);
    }
    
    @Override
    public void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: ThirdFragment");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: ThirdFragment");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: ThirdFragment");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: ThirdFragment");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d(TAG, "onDestroyView: ThirdFragment");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: ThirdFragment");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d(TAG, "onDetach: ThirdFragment");
    }
}