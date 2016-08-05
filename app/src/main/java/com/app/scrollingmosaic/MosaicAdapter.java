package com.app.scrollingmosaic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by ouafaebenelkadi on 8/5/16.
 */
public class MosaicAdapter extends BaseAdapter {
        int [] imagesArray;
        Context context;
        int [] imageId;
        private static LayoutInflater inflater=null;
        public MosaicAdapter(MainActivity mainActivity, int[] prgmImages) {
            // TODO Auto-generated constructor stub
            imagesArray=prgmImages;
            context=mainActivity;
            imageId=prgmImages;
            inflater = (LayoutInflater)context.
                    getSystemService(Context.LAYOUT_INFLATER_SERVICE);
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
            TextView tv;
            ImageView img;
        }
        @Override
        public View getView(final int position, View convertView, ViewGroup parent) {
            // TODO Auto-generated method stub
            Holder holder=new Holder();
            View rowView;
            rowView = inflater.inflate(R.layout.list_item, null);
            holder.img=(ImageView) rowView.findViewById(R.id.imageView);
            holder.img.setImageResource(imageId[position]);

            return rowView;
        }


}
