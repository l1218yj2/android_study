package com.drakeash.okhttp3;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Mathpresso2 on 2015-09-10.
 */
public class CatAdapter extends CustomAdapter<Image, CatAdapter.CatViewHolder> {


    public CatAdapter(Context context, List<Image> data) {
        super(context, data);
    }

    @Override
    public CatViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        CatViewHolder viewHolder;
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        viewHolder = new CatViewHolder(
                inflater.inflate(R.layout.item_cat, parent, false)
        );

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(CatViewHolder holder, int position) {

        Image Image = mItems.get(position);

        Glide.with(mContext)
                .load(Image.getUrl())
                .into(holder.imgvCat);
    }


    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class CatViewHolder extends RecyclerView.ViewHolder {
        public View mView;
        @Bind(R.id.imgvCat)
        ImageView imgvCat;

        public CatViewHolder(View v) {
            super(v);
            mView = itemView;
            ButterKnife.bind(this, v);
        }
    }
}
