package com.aladziviesoft.temukantempat.Adapter;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.aladziviesoft.temukantempat.ListTempat;
import com.aladziviesoft.temukantempat.MapsActivity;
import com.aladziviesoft.temukantempat.Model.DashModel;
import com.aladziviesoft.temukantempat.R;
import com.aladziviesoft.temukantempat.TambahTempat;
import com.aladziviesoft.temukantempat.Utils.GlobalToast;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DashAdapter extends RecyclerView.Adapter<DashAdapter.DashHolder> {


    private Context context;
    private ArrayList<DashModel> models;

    public DashAdapter(Context context, ArrayList<DashModel> models) {
        this.context = context;
        this.models = models;
    }

    @NonNull
    @Override
    public DashHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view = inflater.inflate(R.layout.item_dashboard, viewGroup, false);
        return new DashHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DashHolder dashHolder, final int i) {

        dashHolder.img.setImageResource(models.get(i).getGambar());
        dashHolder.nama.setText(models.get(i).getNama());
        dashHolder.cardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String[] colors = {"List Data", "Lihat Maps", "Tambah Tempat"};

                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                builder.setTitle("Pilih Aksi");
                builder.setItems(colors, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // the user clicked on colors[which]
                        Intent intent;
                        switch (which) {

                            case 0:
                                colors[0] = "List Data";
//                                GlobalToast.ShowToast(context, "Button Active!");
                                intent = new Intent(context, ListTempat.class);
                                intent.putExtra("title", models.get(i).getNama());
                                context.startActivity(intent);
//                                Intent intent = new Intent(context, TambahActivity.class);
//                                String id = arrayList.get(position).getId();
//                                intent.putExtra("id", id);
//                                intent.putExtra("e","1");
//                                AndLog.ShowLog("dsd", id);
//                                context.startActivity(intent);
                                break;
                            case 1:
                                colors[1] = "Lihat Maps";
                                GlobalToast.ShowToast(context, "Button Active!");
                                intent = new Intent(context, MapsActivity.class);
                                context.startActivity(intent);
//                                Delete(arrayList.get(position).getId());
                                break;

                            case 2:
                                colors[2] = "Tambah Tempat";
//                                GlobalToast.ShowToast(context, "Button Active!");
//                                Delete(arrayList.get(position).getId());
                                intent = new Intent(context, TambahTempat.class);
                                intent.putExtra("title", models.get(i).getNama());
                                context.startActivity(intent);
                                break;

                        }
                    }
                });
                builder.show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return models.size();
    }


    public class DashHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.img)
        ImageView img;
        @BindView(R.id.nama)
        TextView nama;
        @BindView(R.id.cardview)
        CardView cardview;

        public DashHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
