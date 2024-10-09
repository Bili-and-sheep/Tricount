package com.example.tricountlevrai;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class TricountAdapter extends RecyclerView.Adapter<TricountAdapter.TricountViewHolder> {

    private List<Tricount> tricountList;
    private OnItemClickListener listener;

    public interface OnItemClickListener {
        void onItemClick(Tricount tricount);
    }

    public TricountAdapter(List<Tricount> tricountList, OnItemClickListener listener) {
        this.tricountList = tricountList;
        this.listener = listener;
    }

    @NonNull
    @Override
    public TricountViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_tricount, parent, false);
        return new TricountViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TricountViewHolder holder, int position) {
        Tricount tricount = tricountList.get(position);
        holder.bind(tricount, listener);
    }

    @Override
    public int getItemCount() {
        return tricountList.size();
    }

    public static class TricountViewHolder extends RecyclerView.ViewHolder {
        TextView nameTextView, typeTextView;

        public TricountViewHolder(View itemView) {
            super(itemView);
            nameTextView = itemView.findViewById(R.id.tricountName);
            typeTextView = itemView.findViewById(R.id.tricountType);
        }

        public void bind(final Tricount tricount, final OnItemClickListener listener) {
            nameTextView.setText(tricount.getName());
            typeTextView.setText(tricount.getType());
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onItemClick(tricount);
                }
            });
        }
    }
}
