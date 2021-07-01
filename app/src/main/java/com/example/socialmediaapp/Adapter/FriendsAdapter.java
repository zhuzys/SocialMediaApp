package com.example.socialmediaapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.socialmediaapp.Model.Friends;
import com.example.socialmediaapp.R;

import java.util.ArrayList;

public class FriendsAdapter extends  RecyclerView.Adapter<FriendsAdapter.MyViewHolder> {
    Context context;
    ArrayList<Friends> friends;

    public FriendsAdapter(Context context, ArrayList<Friends> friends) {
        this.context = context;
        this.friends = friends;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.friends_rv_sample, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Friends model = friends.get(position);
        holder.profile.setImageResource(model.getProfile());

    }

    @Override
    public int getItemCount() {
        return friends.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView profile;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            profile = itemView.findViewById(R.id.profile_image);
        }
    }
}
