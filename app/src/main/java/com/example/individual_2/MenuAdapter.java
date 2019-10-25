package com.example.individual_2;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.ItemViewHolder>{

    private ArrayList<MenuItem> itemsToAdapt;

    public void setData(ArrayList<MenuItem> itemsToAdapt) {

        this.itemsToAdapt = itemsToAdapt;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.menu_item, parent, false);
        ItemViewHolder itemViewHolder = new ItemViewHolder(view);
        return itemViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        final MenuItem itemAtPosition = itemsToAdapt.get(position);
        holder.itemName.setText(itemAtPosition.getItemName());
        holder.itemImageView.setImageResource(itemAtPosition.getItemImageId());

        holder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = view.getContext();

                Intent intent = new Intent(context, ItemDetailActivity.class);
                intent.putExtra("ItemID", itemAtPosition.getItemId());
                context.startActivity(intent);
            }
        });


        holder.itemImageView.setImageResource(itemAtPosition.getItemImageId());
    }

    @Override
    public int getItemCount() {
        return itemsToAdapt.size();
    }

    public static class ItemViewHolder extends RecyclerView.ViewHolder {
        private View view;
        private TextView itemName = null;
        private ImageView itemImageView = null;

        public ItemViewHolder (View itemView) {
            super(itemView);

            if(itemView != null)
            {
                view = itemView;
                itemName = (TextView)itemView.findViewById(R.id.itemName);
                itemImageView = (ImageView)itemView.findViewById(R.id.itemPhoto);
            }
        }
    }
}
