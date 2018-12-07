package com.aladziviesoft.temukantempat.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.aladziviesoft.temukantempat.DetailTempat;
import com.aladziviesoft.temukantempat.Model.ListTempatModel;
import com.aladziviesoft.temukantempat.R;
import com.aladziviesoft.temukantempat.Utils.GlobalToast;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ListTempatAdapter extends RecyclerView.Adapter<ListTempatAdapter.ListTempatHolder> {


    private Context context;
    private ArrayList<ListTempatModel> arrayList;

    public ListTempatAdapter(Context context, ArrayList<ListTempatModel> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public ListTempatHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view = inflater.inflate(R.layout.item_list_tempat, viewGroup, false);

        return new ListTempatHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListTempatHolder holder, final int i) {
        holder.img.setImageResource(arrayList.get(i).getGambar());
        holder.ratingBar.setRating(arrayList.get(i).getRate());
        holder.txJamBuka.setText(arrayList.get(i).getJamBuka());
        holder.txNamaTempat.setText(arrayList.get(i).getNamaTempat());
        holder.cardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GlobalToast.ShowToast(context, "Clicked " + arrayList.get(i).getNamaTempat());
                Intent intent = new Intent(context, DetailTempat.class);
                intent.putExtra("namatempat", arrayList.get(i).getNamaTempat());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ListTempatHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.img)
        ImageView img;
        @BindView(R.id.ratingBar)
        RatingBar ratingBar;
        @BindView(R.id.txRate)
        TextView txRate;
        @BindView(R.id.txNamaTempat)
        TextView txNamaTempat;
        @BindView(R.id.txJamBuka)
        TextView txJamBuka;
        @BindView(R.id.cardview)
        CardView cardview;

        public ListTempatHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);

        }
    }
}
