package com.solfashop;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Ratri on 9/30/2016.
 */
public abstract class BaseActivity extends AppCompatActivity {
    public static final int FRAGMENT_HOME = 0;
    public static final int FRAGMENT_ORDER = 1;
    public static final int FRAGMENT_PRICELIST = 2;
    public static final String KEY_FRAGMENT = "solfa.fragment";
    protected int currentFragment = FRAGMENT_HOME;
    public static BaseActivity baseActivity;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    protected void setupToolbar(){

    }

    protected void setupNavabar(){

    }

    public static BaseActivity getBaseActivity() {
        return baseActivity;
    }

    public void startFragment(int TYPE, String judul){
        Intent i = new Intent(this, ActivityMain.class);
        i.putExtra(KEY_FRAGMENT, TYPE);
        i.putExtra("judul", judul);
        startActivity(i);
    }
}
