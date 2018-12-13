package com.aladziviesoft.temukantempat;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.aladziviesoft.temukantempat.Utils.GlobalToast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import de.hdodenhof.circleimageview.CircleImageView;

public class Anda extends Fragment {

    @BindView(R.id.btLogin)
    Button btLogin;
    @BindView(R.id.btRegistrasi)
    Button btRegistrasi;
    Unbinder unbinder;
    FragmentActivity mActivity;
    @BindView(R.id.img)
    CircleImageView img;
    @BindView(R.id.txNamaLengkap)
    TextView txNamaLengkap;
    @BindView(R.id.txNoHp)
    TextView txNoHp;
    @BindView(R.id.btListKontribusi)
    RelativeLayout btListKontribusi;
    @BindView(R.id.btMasukanTentangAplikasi)
    RelativeLayout btMasukanTentangAplikasi;
    @BindView(R.id.btEditData)
    RelativeLayout btEditData;
    @BindView(R.id.formLogin)
    LinearLayout formLogin;
    @BindView(R.id.formProfil1)
    RelativeLayout formProfil1;
    @BindView(R.id.formProfil2)
    CardView formProfil2;
    @BindView(R.id.formProfil3)
    CardView formProfil3;
    String status;
    @BindView(R.id.btLogout)
    RelativeLayout btLogout;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_anda, container, false);
        unbinder = ButterKnife.bind(this, view);
        mActivity = getActivity();
//        status = "aktif";
        if (mActivity != null) {
            status = mActivity.getIntent().getStringExtra("aktif");
        }

        if (status.equals("aktif")) {
            formProfil1.setVisibility(View.VISIBLE);
            formProfil2.setVisibility(View.VISIBLE);
            formProfil3.setVisibility(View.VISIBLE);
            formLogin.setVisibility(View.GONE);
        } else {
            formProfil1.setVisibility(View.GONE);
            formProfil2.setVisibility(View.GONE);
            formProfil3.setVisibility(View.GONE);
            formLogin.setVisibility(View.VISIBLE);
        }
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    @OnClick({R.id.btLogin, R.id.btRegistrasi, R.id.btListKontribusi, R.id.btMasukanTentangAplikasi, R.id.btEditData, R.id.btLogout})
    public void onViewClicked(View view) {
        Intent intent;
        switch (view.getId()) {
            case R.id.btLogin:
                intent = new Intent(mActivity, LoginActivity.class);
                startActivity(intent);
                break;
            case R.id.btRegistrasi:
                intent = new Intent(mActivity, RegisterActivity.class);
                intent.putExtra("update", "registrasi");
                startActivity(intent);
                break;
            case R.id.btListKontribusi:
                intent = new Intent(mActivity, ListKontribusiActivity.class);
                startActivity(intent);
                break;
            case R.id.btMasukanTentangAplikasi:
                intent = new Intent(mActivity, MasukanActivity.class);
                startActivity(intent);
                break;
            case R.id.btEditData:
                intent = new Intent(mActivity, RegisterActivity.class);
                intent.putExtra("update", "update");
                startActivity(intent);
                break;
            case R.id.btLogout:
                GlobalToast.ShowToast(mActivity, "Logout");
                formProfil1.setVisibility(View.GONE);
                formProfil2.setVisibility(View.GONE);
                formProfil3.setVisibility(View.GONE);
                formLogin.setVisibility(View.VISIBLE);
                break;
        }
    }
}
