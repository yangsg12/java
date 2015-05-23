package com.example.myapp;

import android.provider.BaseColumns;

/**
 * Created by Yang on 2015/5/20.
 */
public class FeedReaderContract {
    public FeedReaderContract(){}

    public static abstract class FeedEntry implements BaseColumns{
        public static final String TABLE_NAME = "entry";
        public static final String COLUMN_NAME_ENTRY_ID = "entryid";
        public static final String COLUMN_NAME_TITLE = "title";
        public static final String COLUMN_NAME_SUBTITLE = "subtitle";
    }
}
