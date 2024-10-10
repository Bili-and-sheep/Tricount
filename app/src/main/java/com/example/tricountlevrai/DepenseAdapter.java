package com.example.tricountlevrai;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;

public class DepenseAdapter extends RecyclerView.Adapter<DepenseAdapter.DepenseViewHolder> {

    private List<Depense> depenseList;

    public DepenseAdapter(List<Depense> depenseList) {
        if (depenseList == null) {
            throw new IllegalArgumentException("La liste des dépenses ne peut pas être nulle");
        }
        this.depenseList = depenseList;
    }

    @NonNull
    @Override
    public DepenseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_depense, parent, false);
        return new DepenseViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DepenseViewHolder holder, int position) {
        Depense depense = depenseList.get(position);

        holder.libelleTextView.setText(depense.getLibelle());
        holder.montantTextView.setText(String.format(Locale.getDefault(), "%.2f €", depense.getMontantDepense()));

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
        holder.dateTextView.setText(dateFormat.format(depense.getDate()));
    }

    @Override
    public int getItemCount() {
        return depenseList.size();
    }

    public static class DepenseViewHolder extends RecyclerView.ViewHolder {
        TextView libelleTextView, montantTextView, dateTextView, typeTextView;

        public DepenseViewHolder(View itemView) {
            super(itemView);
            libelleTextView = itemView.findViewById(R.id.libelle);
            montantTextView = itemView.findViewById(R.id.montantf);
            typeTextView = itemView.findViewById(R.id.type);
            dateTextView = itemView.findViewById(R.id.date);
        }
    }
}