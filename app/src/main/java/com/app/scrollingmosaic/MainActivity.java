package com.app.scrollingmosaic;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    GridView gridView ;
    public static int [] prgmImages={R.mipmap.homify1,R.mipmap.homify2,R.mipmap.homify3,R.mipmap.homify4,R.mipmap.homify5,R.mipmap.homify7,R.mipmap.homify8,R.mipmap.homify9,R.mipmap.homify10};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GridView gridView = (GridView)findViewById(R.id.gridView);
        gridView.setAdapter(new MosaicAdapter(this,prgmImages));
    }
}
