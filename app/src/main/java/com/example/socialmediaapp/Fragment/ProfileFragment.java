package com.example.socialmediaapp.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;

import com.example.socialmediaapp.Adapter.FriendsAdapter;
import com.example.socialmediaapp.Model.Friends;
import com.example.socialmediaapp.R;

import java.util.ArrayList;

public class ProfileFragment extends Fragment {
    RecyclerView recyclerView;
    ArrayList<Friends> list;



    public ProfileFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_profile, container, false);
        recyclerView = view.findViewById(R.id.friendsRV);

        list = new ArrayList<>();
        list.add(new Friends(R.drawable.zhuzy));
        list.add(new Friends(R.drawable.puzi));
        list.add(new Friends(R.drawable.pz));
        list.add(new Friends(R.drawable.metwo));
        list.add(new Friends(R.drawable.photo));
        list.add(new Friends(R.drawable.me));
        list.add(new Friends(R.drawable.fav));
        FriendsAdapter adapter = new FriendsAdapter(getContext(), list);
        LinearLayoutManager layoutManager= new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

        return  view;
    }

}