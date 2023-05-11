package com.example.thirdlesson;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ContactViewHolder extends RecyclerView.ViewHolder {

    TextView name, secondName;
    ImageView photo;

    public ContactViewHolder(@NonNull View itemView) {
        super(itemView);
    }

    public void onBind(String contactName) {
        name = itemView.findViewById(R.id.tv_name);
//        secondName = itemView.findViewById(R.id.tv_second_name);
        photo = itemView.findViewById(R.id.iv_photo);

        name.setText(contactName);
    }

}
