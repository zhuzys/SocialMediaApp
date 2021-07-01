package com.example.socialmediaapp.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.socialmediaapp.Adapter.NotifAdapter;
import com.example.socialmediaapp.Model.Notification;
import com.example.socialmediaapp.R;

import java.util.ArrayList;

public class Notif2Fragment extends Fragment {
    ArrayList<Notification> notifications;
    RecyclerView recyclerView;

    public Notif2Fragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view =  inflater.inflate(R.layout.fragment_notif2, container, false);
        recyclerView= view.findViewById(R.id.notif2RV);
        notifications = new ArrayList<>();
        notifications.add(new Notification(R.drawable.zhuzy, "<b>@zhuzy_</b> mention you in a comment : try again", "13:59"));
        notifications.add(new Notification(R.drawable.pz, "<b>@zhaniya</b> mention you in a comment : Beauty", "18:89"));
        notifications.add(new Notification(R.drawable.metwo, "<b>@peri</b> mention you in a comment :  Nicee", "20:00"));
        notifications.add(new Notification(R.drawable.fav, "<b>@aiya</b>  mention you in a comment : Well done", "21:15"));

        NotifAdapter adapter = new NotifAdapter(getContext(), notifications);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
        return view;
    }
}