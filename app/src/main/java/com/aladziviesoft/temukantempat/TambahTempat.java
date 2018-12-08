package com.aladziviesoft.temukantempat;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class TambahTempat extends AppCompatActivity {

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.explore)
    Button explore;
    @BindView(R.id.take)
    Button take;
    @BindView(R.id.Img)
    ImageView Img;
    @BindView(R.id.btSimpan)
    Button btSimpan;
    @BindView(R.id.btEdit)
    Button btEdit;
    String title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambah_tempat);
        ButterKnife.bind(this);

        setSupportActionBar(toolbar);

        title = getIntent().getStringExtra("title");
        toolbar.setTitle(title);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    @OnClick({R.id.take, R.id.Img, R.id.btSimpan, R.id.btEdit})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.take:
                break;
            case R.id.Img:
                break;
            case R.id.btSimpan:
                break;
            case R.id.btEdit:
                break;
        }
    }
}
