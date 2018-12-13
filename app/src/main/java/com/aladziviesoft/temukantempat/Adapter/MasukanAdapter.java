package com.aladziviesoft.temukantempat.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.aladziviesoft.temukantempat.Model.MasukanModel;
import com.aladziviesoft.temukantempat.R;
import com.aladziviesoft.temukantempat.Utils.GlobalToast;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MasukanAdapter extends RecyclerView.Adapter<MasukanAdapter.MasukanHolder> {

    private Context context;
    private ArrayList<MasukanModel> arrayList;

    public MasukanAdapter(Context context, ArrayList<MasukanModel> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public MasukanHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view = inflater.inflate(R.layout.item_list_masukan, viewGroup, false);
        return new MasukanHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MasukanHolder holder, int i) {
        holder.txNamaUser.setText(arrayList.get(i).getNamaUser());
        holder.txTextKomentar.setText(arrayList.get(i).getTextKomentar());
        holder.txWaktuUserKomentar.setText(arrayList.get(i).getWaktu());
        holder.layItemKomentar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GlobalToast.ShowToast(context, "Hai");
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class MasukanHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.txNamaUser)
        TextView txNamaUser;
        @BindView(R.id.txWaktuUserKomentar)
        TextView txWaktuUserKomentar;
        @BindView(R.id.txTextKomentar)
        TextView txTextKomentar;
        @BindView(R.id.lay_item_komentar)
        LinearLayout layItemKomentar;

        public MasukanHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);

        }
    }
}
