package com.app.scrollingmosaic;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;


/**
 * Created by ouafaebenelkadi on 8/5/16.
 */
public class MosaicAdapter extends RecyclerView.Adapter<MosaicAdapter.MosaicViewHolders> {

    private int [] imagesArray;
    private Context context;

    public MosaicAdapter(Context context, int[]  itemList) {
        this.imagesArray = itemList;
        this.context = context;
    }

    @Override
    public MosaicViewHolders onCreateViewHolder(ViewGroup parent, int viewType) {

        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, null);
        MosaicViewHolders rcv = new MosaicViewHolders(layoutView);
        return rcv;
    }

    @Override
    public void onBindViewHolder(MosaicViewHolders holder, int position) {
        holder.image.setImageResource(imagesArray[position]);
    }

    @Override
    public int getItemCount() {
        return imagesArray.length;
    }

    public class MosaicViewHolders extends RecyclerView.ViewHolder implements View.OnClickListener {

        public ImageView image;

        public MosaicViewHolders(View v) {
            super(v);
            v.setOnClickListener(this);
            image = (ImageView) v.findViewById(R.id.mosaic_photo);
        }

        @Override
        public void onClick(View view) {

        }
    }
}