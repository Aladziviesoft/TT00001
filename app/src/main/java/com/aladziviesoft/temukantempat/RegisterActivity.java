package com.aladziviesoft.temukantempat;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.aladziviesoft.temukantempat.Utils.AndLog;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class RegisterActivity extends AppCompatActivity {

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.etNama)
    EditText etNama;
    @BindView(R.id.etUsername)
    EditText etUsername;
    @BindView(R.id.etPassword)
    EditText etPassword;
    @BindView(R.id.etPekerjaan)
    EditText etPekerjaan;
    @BindView(R.id.etHp)
    EditText etHp;
    @BindView(R.id.etAlamat)
    EditText etAlamat;
    @BindView(R.id.rbL)
    RadioButton rbL;
    @BindView(R.id.rbP)
    RadioButton rbP;
    @BindView(R.id.Rgjk)
    RadioGroup Rgjk;
    @BindView(R.id.btRegistrasi)
    Button btRegistrasi;
    @BindView(R.id.btKembali)
    Button btKembali;
    String ses;
    @BindView(R.id.btUpdate)
    Button btUpdate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);


        ses = getIntent().getStringExtra("update");
        AndLog.ShowLog("psps", ses);

        if (ses.equals("update")) {
            btKembali.setVisibility(View.GONE);
            btRegistrasi.setVisibility(View.GONE);
            btUpdate.setVisibility(View.VISIBLE);
            toolbar.setTitle("Update Data Pribadi");

        } else {

            btKembali.setVisibility(View.VISIBLE);
            btRegistrasi.setVisibility(View.VISIBLE);
            btUpdate.setVisibility(View.GONE);
            toolbar.setTitle("Registrasi");
//            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

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

    @OnClick({R.id.btRegistrasi, R.id.btKembali, R.id.btUpdate})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btRegistrasi:
                break;
            case R.id.btKembali:
                finish();
                break;
            case R.id.btUpdate:
                break;
        }
    }
}
