package com.solfashop;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.util.AttributeSet;
import android.view.View;

import com.solfashop.fragment.BaseFragment;
import com.solfashop.fragment.HomeFragment;
import com.solfashop.fragment.OrderFragment;
import com.solfashop.fragment.PriceFragment;

/**
 * Created by Ratri on 9/30/2016.
 */
public class ActivityMain extends BaseActivity{
    Intent caller;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        baseActivity = this;
        caller = getIntent();
        if (caller != null && caller.getExtras() != null){
            currentFragment = caller.getExtras().getInt(KEY_FRAGMENT);
        } else currentFragment = FRAGMENT_HOME;

        FragmentManager manager = getSupportFragmentManager();
        switch (currentFragment){
            case FRAGMENT_HOME:
                manager.beginTransaction().replace(R.id.container, HomeFragment.newInstance("INI HOME")).commit();
                break;
            case FRAGMENT_ORDER:
                manager.beginTransaction().replace(R.id.container, OrderFragment.newInstance("INI ORDER")).commit();
                break;
            case FRAGMENT_PRICELIST:
                manager.beginTransaction().replace(R.id.container, PriceFragment.newInstance("INI PRICE")).commit();
                break;
        }

    }

    @Override
    public View onCreateView(View parent, String name, Context context, AttributeSet attrs) {

        return super.onCreateView(parent, name, context, attrs);
    }


}
