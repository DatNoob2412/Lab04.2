package com.example.lab042;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class MonHocAdapter extends RecyclerView.Adapter<MonHocAdapter.ViewHolder> {

    private Context context;
    private List<MonHoc> monHocList;

    public MonHocAdapter(Context context, List<MonHoc> monHocList) {
        this.context = context;
        this.monHocList = monHocList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_monhoc, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        MonHoc monHoc = monHocList.get(position);

        holder.imgHinhMonHoc.setImageResource(monHoc.getTenHinh());
        holder.tvMaHP.setText("Mã HP: " + monHoc.getMaHP());
        holder.tvTenHP.setText("Tên HP: " + monHoc.getTenHP());
        holder.tvTenGV.setText("Tên GV: " + monHoc.getTenGV());
    }

    @Override
    public int getItemCount() {
        return monHocList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgHinhMonHoc;
        TextView tvMaHP;
        TextView tvTenHP;
        TextView tvTenGV;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgHinhMonHoc = itemView.findViewById(R.id.imgHinhMonHoc);
            tvMaHP = itemView.findViewById(R.id.tvMaHP);
            tvTenHP = itemView.findViewById(R.id.tvTenHP);
            tvTenGV = itemView.findViewById(R.id.tvTenGV);
        }
    }
}
