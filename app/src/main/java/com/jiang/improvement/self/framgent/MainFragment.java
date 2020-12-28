package com.jiang.improvement.self.framgent;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jiang.improvement.R;
import com.jiang.improvement.self.common.CommonFragment;

public class MainFragment extends CommonFragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        View view = super.onCreateView(inflater, container, savedInstanceState);
//        View view = inflater.inflate(R.layout.frament_main, container,false);
        View view = inflater.inflate(R.layout.pager_main, container,false);
        return view;

    }
}
