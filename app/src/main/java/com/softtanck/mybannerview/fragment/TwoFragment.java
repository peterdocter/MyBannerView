package com.softtanck.mybannerview.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.softtanck.mybannerview.R;

/**
 * @author : Tanck
 * @Description : TODO
 * @date 7/17/2015
 */
public class TwoFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_three, container, false);
    }
}
