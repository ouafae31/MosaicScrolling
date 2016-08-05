package com.app.scrollingmosaic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ouafaebenelkadi on 8/5/16.
 */
public class MosaicAdapter extends BaseAdapter {
    private int [] imagesArray;
    private LayoutInflater inflater;
    private int [] imageId;

    public MosaicAdapter(Context context,int[] prgmImages)
    {
        inflater = LayoutInflater.from(context);
        imagesArray = prgmImages;
        imageId=prgmImages;

    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return imagesArray.length;
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    public class Holder
    {
        ImageView img;
    }
    @Override
    public View getView(int position, View view, ViewGroup viewGroup)
    {
        View v = view;
        ImageView picture;


        if(v == null)
        {
            v = inflater.inflate(R.layout.list_item, viewGroup, false);
            v.setTag(R.id.picture, v.findViewById(R.id.picture));
            v.setTag(R.id.text, v.findViewById(R.id.text));
        }

        picture = (ImageView)v.getTag(R.id.picture);




        picture.setImageResource(imageId[position]);


        return v;
    }



}
