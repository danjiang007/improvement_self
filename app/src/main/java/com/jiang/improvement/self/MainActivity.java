package com.jiang.improvement.self;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.jiang.improvement.R;

/**
 * 一个改造自我的App
 * 1.列出当前的不好
 *
 * 2.
 */
public class MainActivity extends AppCompatActivity {
    TextView mMainTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mMainTextView = findViewById(R.id.main);

        mMainTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("chicha://domain/path?goodsId=10011002"));
                startActivity(intent);
            }
        });
        
        Thread thread = new Thread();

        Thread.State state = thread.getState();
//        HandlerThread

    }
}
