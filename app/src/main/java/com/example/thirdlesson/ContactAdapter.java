package com.example.thirdlesson;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ContactAdapter extends RecyclerView.Adapter<ContactViewHolder> {

    ArrayList<String> adapterArrayList;

    public ContactAdapter(ArrayList<String> arrayList) {
        adapterArrayList = arrayList;
    }

    @NonNull
    @Override
    public ContactViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ContactViewHolder(
                LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.item_contact, parent, false)
        );
    }

    @Override
    public void onBindViewHolder(@NonNull ContactViewHolder holder, int position) {
        holder.onBind(adapterArrayList.get(position));
    }

    @Override
    public int getItemCount() {
        return adapterArrayList.size();
    }
}
