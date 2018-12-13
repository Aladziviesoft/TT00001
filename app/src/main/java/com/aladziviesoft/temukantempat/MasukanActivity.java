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
import android.widget.Button;
import android.widget.EditText;

import com.aladziviesoft.temukantempat.Adapter.MasukanAdapter;
import com.aladziviesoft.temukantempat.Model.MasukanModel;
import com.aladziviesoft.temukantempat.Utils.GlobalToast;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MasukanActivity extends AppCompatActivity {

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.etText)
    EditText etText;
    @BindView(R.id.btKirim)
    Button btKirim;
    @BindView(R.id.recListMasukan)
    RecyclerView recListMasukan;
    @BindView(R.id.Swipe)
    SwipeRefreshLayout Swipe;
    MasukanAdapter adapter;
    private ArrayList<MasukanModel> arrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_masukan);
        ButterKnife.bind(this);

        setSupportActionBar(toolbar);
        recListMasukan.setHasFixedSize(true);

        GridLayoutManager layoutManager = new GridLayoutManager(MasukanActivity.this, 1, LinearLayoutManager.VERTICAL, false);
        recListMasukan.setLayoutManager(layoutManager);

        adapter = new MasukanAdapter(MasukanActivity.this, arrayList);
        recListMasukan.setAdapter(adapter);

        Swipe.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                dataList();
            }
        });

        dataList();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.nav_close, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.nav_close){
            finish();
        }
        return true;

    }

    private void dataList() {
        arrayList.add(new MasukanModel("Muhammad Iqbal Maulana", "12-09-2018 08:15", "edia sosial kini tak hanya berfungsi sebagai sarana untuk terhubung orang lain di dunia maya, tetapi juga sebagai tempat untuk membangun komunitas. Di Facebook misalnya, kamu akan bertemu berbagai jenis orang, mulai dari si pembuat kata-kata bijak, si tukang jualan sampai tukang bikin provokasi."));
        arrayList.add(new MasukanModel("Muhammad Iqbal Maulana", "12-09-2018 08:15", "edia sosial kini tak hanya berfungsi sebagai sarana untuk terhubung orang lain di dunia maya, tetapi juga sebagai tempat untuk membangun komunitas. Di Facebook misalnya, kamu akan bertemu berbagai jenis orang, mulai dari si pembuat kata-kata bijak, si tukang jualan sampai tukang bikin provokasi."));
        arrayList.add(new MasukanModel("Muhammad Iqbal Maulana", "12-09-2018 08:15", "edia sosial kini tak hanya berfungsi sebagai sarana untuk terhubung orang lain di dunia maya, tetapi juga sebagai tempat untuk membangun komunitas. Di Facebook misalnya, kamu akan bertemu berbagai jenis orang, mulai dari si pembuat kata-kata bijak, si tukang jualan sampai tukang bikin provokasi."));
        arrayList.add(new MasukanModel("Muhammad Iqbal Maulana", "12-09-2018 08:15", "edia sosial kini tak hanya berfungsi sebagai sarana untuk terhubung orang lain di dunia maya, tetapi juga sebagai tempat untuk membangun komunitas. Di Facebook misalnya, kamu akan bertemu berbagai jenis orang, mulai dari si pembuat kata-kata bijak, si tukang jualan sampai tukang bikin provokasi."));
        arrayList.add(new MasukanModel("Muhammad Iqbal Maulana", "12-09-2018 08:15", "edia sosial kini tak hanya berfungsi sebagai sarana untuk terhubung orang lain di dunia maya, tetapi juga sebagai tempat untuk membangun komunitas. Di Facebook misalnya, kamu akan bertemu berbagai jenis orang, mulai dari si pembuat kata-kata bijak, si tukang jualan sampai tukang bikin provokasi."));
        arrayList.add(new MasukanModel("Muhammad Iqbal Maulana", "12-09-2018 08:15", "edia sosial kini tak hanya berfungsi sebagai sarana untuk terhubung orang lain di dunia maya, tetapi juga sebagai tempat untuk membangun komunitas. Di Facebook misalnya, kamu akan bertemu berbagai jenis orang, mulai dari si pembuat kata-kata bijak, si tukang jualan sampai tukang bikin provokasi."));
        arrayList.add(new MasukanModel("Muhammad Iqbal Maulana", "12-09-2018 08:15", "edia sosial kini tak hanya berfungsi sebagai sarana untuk terhubung orang lain di dunia maya, tetapi juga sebagai tempat untuk membangun komunitas. Di Facebook misalnya, kamu akan bertemu berbagai jenis orang, mulai dari si pembuat kata-kata bijak, si tukang jualan sampai tukang bikin provokasi."));
        arrayList.add(new MasukanModel("Muhammad Iqbal Maulana", "12-09-2018 08:15", "edia sosial kini tak hanya berfungsi sebagai sarana untuk terhubung orang lain di dunia maya, tetapi juga sebagai tempat untuk membangun komunitas. Di Facebook misalnya, kamu akan bertemu berbagai jenis orang, mulai dari si pembuat kata-kata bijak, si tukang jualan sampai tukang bikin provokasi."));


    }

    @OnClick(R.id.btKirim)
    public void onViewClicked() {
        GlobalToast.ShowToast(MasukanActivity.this, "Hai");
    }
}
