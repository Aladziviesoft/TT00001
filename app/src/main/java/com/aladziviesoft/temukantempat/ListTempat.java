package com.aladziviesoft.temukantempat;

import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.aladziviesoft.temukantempat.Adapter.ListTempatAdapter;
import com.aladziviesoft.temukantempat.Model.ListTempatModel;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ListTempat extends AppCompatActivity {

    @BindView(R.id.recDataTempat)
    RecyclerView recDataTempat;
    @BindView(R.id.Swipe)
    SwipeRefreshLayout Swipe;
    ListTempatAdapter adapter;
    ArrayList<ListTempatModel> arrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_tempat);
        ButterKnife.bind(this);

        recDataTempat.setHasFixedSize(true);
        GridLayoutManager layoutManager = new GridLayoutManager(ListTempat.this, 1, LinearLayoutManager.VERTICAL, false);
        recDataTempat.setLayoutManager(layoutManager);

        adapter = new ListTempatAdapter(ListTempat.this, arrayList);
        recDataTempat.setAdapter(adapter);

        setContoh();
    }

    private void setContoh() {
        arrayList.add(new ListTempatModel(R.drawable.pombensin, 3.5,"Sego Pecel","08:000"));
        arrayList.add(new ListTempatModel(R.drawable.pombensin, 1,"Sego Pecel", "08:000"));
        arrayList.add(new ListTempatModel(R.drawable.pombensin, 3,"Sego Pecel", "08:000"));
        arrayList.add(new ListTempatModel(R.drawable.pombensin, 2.5,"Sego Pecel", "08:000"));
        arrayList.add(new ListTempatModel(R.drawable.pombensin, 4.5,"Sego Pecel", "08:000"));
        arrayList.add(new ListTempatModel(R.drawable.pombensin, 5,"Sego Pecel", "08:000"));


    }
}
