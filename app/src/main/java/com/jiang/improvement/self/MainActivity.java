package com.jiang.improvement.self;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.jiang.improvement.R;
import com.jiang.improvement.self.framgent.MainFragment;

/**
 * 一个改造自我的App
 * 1.列出当前的不好
 *
 * 2.
 */
public class MainActivity extends AppCompatActivity {
    MainFragment mMainFragment;
    FragmentManager mFragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mMainFragment = new MainFragment();
        mFragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = mFragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.main_fragment, mMainFragment);
        fragmentTransaction.commit();
    }
}
