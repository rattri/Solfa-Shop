package com.solfashop.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import com.solfashop.BaseActivity;

/**
 * Created by Ratri on 9/30/2016.
 */
public abstract class BaseFragment extends Fragment {
    protected BaseActivity baseActivity;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public BaseActivity getBaseActivity(){
        return baseActivity;
    }
}
