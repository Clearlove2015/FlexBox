package com.odbpo.fenggo.flexbox;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import com.google.android.flexbox.FlexboxLayoutManager;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.odbpo.fenggo.flexbox.adapter.GiftAdapter;
import com.odbpo.fenggo.flexbox.bean.GiftBean;
import com.odbpo.fenggo.flexbox.utils.ReadAssetsUtil;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.rv_gift)
    RecyclerView rvGift;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        init();
    }

    private void init() {
        String json = ReadAssetsUtil.getJson(this, "data.json");
        Gson gson = new Gson();
        List<GiftBean> mList = gson.fromJson(json, new TypeToken<List<GiftBean>>() {}.getType());
        initRV(mList);
    }

    private void initRV(List<GiftBean> mList){
        FlexboxLayoutManager layoutManager = new FlexboxLayoutManager(this);
        rvGift.setLayoutManager(layoutManager);
        rvGift.setAdapter(new GiftAdapter(mList));
    }
}
