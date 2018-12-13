package com.aladziviesoft.temukantempat;

import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.aladziviesoft.temukantempat.Adapter.ListKontrubusiAdapter;
import com.aladziviesoft.temukantempat.Model.ListKontribusiModel;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ListKontribusiActivity extends AppCompatActivity {

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.recListKontribusi)
    RecyclerView recListKontribusi;
    @BindView(R.id.Swipe)
    SwipeRefreshLayout Swipe;
    ListKontrubusiAdapter adapter;
    private ArrayList<ListKontribusiModel> arrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_kontribusi);
        ButterKnife.bind(this);

        setSupportActionBar(toolbar);
        recListKontribusi.setHasFixedSize(true);

        GridLayoutManager layoutManager = new GridLayoutManager(ListKontribusiActivity.this, 1, LinearLayoutManager.VERTICAL, false);
        recListKontribusi.setLayoutManager(layoutManager);

        adapter = new ListKontrubusiAdapter(ListKontribusiActivity.this, arrayList);
        recListKontribusi.setAdapter(adapter);

        Swipe.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                datalist();
            }
        });

        datalist();
    }

    private void datalist() {
        arrayList.add(new ListKontribusiModel(R.drawable.pombensin, "Pom Bensin", "12-09-2018 18:00", "Blablabla BlablablaBlablablaBlablablaBlablablaBlablablaBlablablaBlablablaBlablabla"));
        arrayList.add(new ListKontribusiModel(R.drawable.pombensin, "Pom Bensin", "12-09-2018 18:00", "Blablabla BlablablaBlablablaBlablablaBlablablaBlablablaBlablablaBlablablaBlablabla"));
        arrayList.add(new ListKontribusiModel(R.drawable.pombensin, "Pom Bensin", "12-09-2018 18:00", "Blablabla BlablablaBlablablaBlablablaBlablablaBlablablaBlablablaBlablablaBlablabla"));
        arrayList.add(new ListKontribusiModel(R.drawable.pombensin, "Pom Bensin", "12-09-2018 18:00", "Blablabla BlablablaBlablablaBlablablaBlablablaBlablablaBlablablaBlablablaBlablabla"));
        arrayList.add(new ListKontribusiModel(R.drawable.pombensin, "Pom Bensin", "12-09-2018 18:00", "Blablabla BlablablaBlablablaBlablablaBlablablaBlablablaBlablablaBlablablaBlablabla"));
        arrayList.add(new ListKontribusiModel(R.drawable.pombensin, "Pom Bensin", "12-09-2018 18:00", "Blablabla BlablablaBlablablaBlablablaBlablablaBlablablaBlablablaBlablablaBlablabla"));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.nav_close, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.nav_close) {
            finish();
        }
        return true;

    }
}
