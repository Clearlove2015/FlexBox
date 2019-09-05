package com.odbpo.fenggo.flexbox.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.odbpo.fenggo.flexbox.R;
import com.odbpo.fenggo.flexbox.bean.GiftBean;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * @author: zc
 * @Time: 2019/9/5 13:22
 * @Desc:
 */
public class GiftAdapter extends RecyclerView.Adapter {

    private Context context;
    private List<GiftBean> mData;

    public GiftAdapter(List<GiftBean> mData) {
        this.mData = mData;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        this.context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_gift, parent, false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ItemViewHolder itemHolder = (ItemViewHolder) holder;
        GiftBean bean = mData.get(position);
        Glide.with(context).load(bean.getImage()).into(itemHolder.ivImg);
        itemHolder.tvNum.setText("x" + bean.getScopeNum());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    class ItemViewHolder extends RecyclerView.ViewHolder {
        @Bind(R.id.iv_img)
        ImageView ivImg;
        @Bind(R.id.tv_num)
        TextView tvNum;

        public ItemViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
