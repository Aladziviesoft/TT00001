package com.aladziviesoft.temukantempat;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.aladziviesoft.temukantempat.Adapter.DashAdapter;
import com.aladziviesoft.temukantempat.Model.DashModel;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class Home extends Fragment {

    @BindView(R.id.recMenu)
    RecyclerView recMenu;
    Unbinder unbinder;
    FragmentActivity mActivity;
    DashAdapter adapter;
    ArrayList<DashModel> arrayList = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_home, container, false);
        unbinder = ButterKnife.bind(this, view);
        mActivity = getActivity();

        recMenu.setHasFixedSize(true);

        GridLayoutManager layoutManager = new GridLayoutManager(mActivity, 3, LinearLayoutManager.VERTICAL, false);
        recMenu.setLayoutManager(layoutManager);

        DashAdapter adapter = new DashAdapter(mActivity, arrayList);
        recMenu.setAdapter(adapter);

        setMenu();

        return view;

    }

    private void setMenu() {
        arrayList.add(new DashModel(R.drawable.tukang_jahit, "Tempat Jahit"));
        arrayList.add(new DashModel(R.drawable.pom_bensin, "POM Bensin"));
        arrayList.add(new DashModel(R.drawable.laundry, "Laundry"));
        arrayList.add(new DashModel(R.drawable.apotek, "Apotek"));
        arrayList.add(new DashModel(R.drawable.kantor_polisi, "Kantor Polisi"));
        arrayList.add(new DashModel(R.drawable.masjid, "Masjid"));
        arrayList.add(new DashModel(R.drawable.rumah_sakit, "Rumah Sakit"));
        arrayList.add(new DashModel(R.drawable.sd, "SD"));
        arrayList.add(new DashModel(R.drawable.smp, "SMP"));
        arrayList.add(new DashModel(R.drawable.sma, "SMA"));
        arrayList.add(new DashModel(R.drawable.supermarket, "Super Market"));
        arrayList.add(new DashModel(R.drawable.tambal_ban, "Tambal Ban"));
        arrayList.add(new DashModel(R.drawable.warung_makan, "Warung Makan"));
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
