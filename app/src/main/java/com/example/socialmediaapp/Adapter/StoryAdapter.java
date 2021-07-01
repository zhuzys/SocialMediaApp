package com.example.socialmediaapp.Adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.socialmediaapp.Model.Story;
import com.example.socialmediaapp.R;



import java.util.ArrayList;

public class StoryAdapter extends RecyclerView.Adapter<StoryAdapter.MyViewHolder> {
   Context context;
    ArrayList<Story> stories;

    public StoryAdapter(Context context, ArrayList<Story> stories) {
        this.context = context;
        this.stories = stories;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.story_rv_design, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Story story = stories.get(position);
        holder.storyImg.setImageResource(story.getStory());
        holder.storyType.setImageResource(story.getStoryType());
        holder.profile.setImageResource(story.getProfile());
        holder.name.setText(story.getName());
    }

    @Override
    public int getItemCount() {
        return stories.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView storyImg, profile, storyType;
        TextView name;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.user_name);
            storyImg = itemView.findViewById(R.id.story);
            profile = itemView.findViewById(R.id.profile_image);
            storyType = itemView.findViewById(R.id.storyType);


        }
    }
}
