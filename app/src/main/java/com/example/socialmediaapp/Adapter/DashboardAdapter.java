package com.example.socialmediaapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.socialmediaapp.Model.Dashboard;
import com.example.socialmediaapp.R;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class DashboardAdapter  extends RecyclerView.Adapter<DashboardAdapter.MyViewHolder> {
    ArrayList<Dashboard> list;
    Context context;

    public DashboardAdapter(ArrayList<Dashboard> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.dashboard_rv_sample, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Dashboard dashboard = list.get(position);
        holder.name.setText(dashboard.getName());
        holder.about.setText(dashboard.getAbout());
        holder.profile.setImageResource(dashboard.getProfile());
        holder.postImage.setImageResource(dashboard.getPostImage());
        holder.save.setImageResource(dashboard.getSave());
        holder.comment.setText(dashboard.getComment());
        holder.share.setText(dashboard.getShare());
        holder.like.setText(dashboard.getLike());



    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView profile, postImage, save;
        TextView name,about, like, comment, share;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            profile = itemView.findViewById(R.id.profile_image);
            postImage = itemView.findViewById(R.id.myPhoto);
            save = itemView.findViewById(R.id.save);
            name = itemView.findViewById(R.id.username);
            about = itemView.findViewById(R.id.about);
            like= itemView.findViewById(R.id.tv_like);
            comment = itemView.findViewById(R.id.tv_chat);
            share = itemView.findViewById(R.id.tv_shared);
        }
    }
}
