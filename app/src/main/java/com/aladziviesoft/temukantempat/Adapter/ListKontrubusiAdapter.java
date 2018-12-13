package com.aladziviesoft.temukantempat.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.aladziviesoft.temukantempat.Model.ListKontribusiModel;
import com.aladziviesoft.temukantempat.R;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ListKontrubusiAdapter extends RecyclerView.Adapter<ListKontrubusiAdapter.ListKOntribusiHolder> {

    private Context context;
    private ArrayList<ListKontribusiModel> arrayList;

    public ListKontrubusiAdapter(Context context, ArrayList<ListKontribusiModel> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public ListKOntribusiHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view = inflater.inflate(R.layout.item_list_kontribusi, viewGroup, false);
        return new ListKOntribusiHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListKOntribusiHolder holder, int i) {
        holder.img.setImageResource(arrayList.get(i).getImg());
        holder.txNamaTempat.setText(arrayList.get(i).getNamaTempat());
        holder.txKeterangan.setText(arrayList.get(i).getKeterangan());
        holder.txWaktu.setText(arrayList.get(i).getWaktu());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ListKOntribusiHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.txNamaTempat)
        TextView txNamaTempat;
        @BindView(R.id.txWaktu)
        TextView txWaktu;
        @BindView(R.id.img)
        ImageView img;
        @BindView(R.id.txKeterangan)
        TextView txKeterangan;

        public ListKOntribusiHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
