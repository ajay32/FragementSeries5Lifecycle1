package com.hackingbuzz.fragementlifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Avi Hacker on 8/18/2016.
 */
public class Fragment1 extends Fragment  {

    public static final String TAG = "frago";

    Button b4;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.d(TAG, "onCreateView() Called");
        return inflater.inflate(R.layout.frag1,container,false);

    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d(TAG, "onActivityCreated() Called");
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate() Called");
    }

    @Override
    public void onAttach(Activity activity) {      // see this gets called
        super.onAttach(activity);
        Log.d(TAG, "onAttachDepricated() Called");
    }

    @Override
    public void onAttach(Context context) {   // this does not called as far as i it showing
        super.onAttach(context);
        Log.d(TAG, "onAttach() Called");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(TAG, "onStart() Called");

    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG, "onStop() Called");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG, "onResume() Called");

    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG, "onPause() Called");

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestory() Called");

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d(TAG, "onDestoryView() Called");

    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d(TAG, "onDetach() Called");

    }


}
