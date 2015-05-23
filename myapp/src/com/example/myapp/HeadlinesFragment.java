package com.example.myapp;

import android.app.Activity;
import android.app.ListFragment;

/**
 * Created by Yang on 2015/5/20.
 */
public class HeadlinesFragment extends ListFragment {
    OnHeadlineSelectedListener mCallback;

    public interface OnHeadlineSelectedListener{
        public void onArticleSelected(int position);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        mCallback = (OnHeadlineSelectedListener) activity;
    }
}
