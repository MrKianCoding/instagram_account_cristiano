package com.example.instagram_account_cristiano;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class PhotoAdapter extends RecyclerView.Adapter<PhotoAdapter.photoViewHolder> {

    List<PhotoModel> photoModelList;

    public PhotoAdapter(List<PhotoModel> photoModelList) {
        this.photoModelList = photoModelList;
    }

    @NonNull
    @Override
    public photoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new photoViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_photo,null));
    }

    @Override
    public void onBindViewHolder(@NonNull photoViewHolder holder, int position) {
        holder.setData(photoModelList.get(position));

    }

    @Override
    public int getItemCount() {
        return photoModelList.size();
    }

    static class photoViewHolder extends RecyclerView.ViewHolder {


        ImageView imageViewPhoto, imageViewIcon;

        public photoViewHolder(@NonNull View itemView) {
            super(itemView);

            imageViewPhoto = itemView.findViewById(R.id.photo);
            imageViewIcon = itemView.findViewById(R.id.icon);
        }

        void setData(PhotoModel photoModel){
            Glide.with(itemView.getContext()).load(photoModel.getPhoto()).into(imageViewPhoto);
            if (photoModel.getType().equals("multiple")){
                imageViewIcon.setImageDrawable(itemView.getContext().getResources().getDrawable(R.drawable.multiple_icon));
            } else if (photoModel.getType().equals("video")){
                imageViewIcon.setImageDrawable(itemView.getContext().getResources().getDrawable(R.drawable.video_select));
            } else {
                imageViewIcon.setVisibility(View.GONE);
            }
        }
    }
}
