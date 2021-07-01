package com.example.socialmediaapp.Fragment;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.socialmediaapp.Adapter.DashboardAdapter;
import com.example.socialmediaapp.Adapter.StoryAdapter;
import com.example.socialmediaapp.Model.Dashboard;
import com.example.socialmediaapp.Model.Story;
import com.example.socialmediaapp.R;

import java.util.ArrayList;

public class HomeFragment extends Fragment {
    RecyclerView storyRV, dashRV;
    ArrayList<Story> list;
    Context context;
    ArrayList<Dashboard> dashList;

    public HomeFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_home, container, false);
        storyRV = view.findViewById(R.id.storyRV);
        list= new ArrayList<>();
        list.add(new Story(R.drawable.me, R.drawable.ic_baseline_videocam_24, R.drawable.zhuzy, "zhuzy_"));
        list.add(new Story(R.drawable.puzi, R.drawable.ic_baseline_videocam_24, R.drawable.fav, "zhuzy_"));
        list.add(new Story(R.drawable.zhuzy, R.drawable.ic_baseline_videocam_24, R.drawable.puzi, "zhuzy_"));
        list.add(new Story(R.drawable.puzi, R.drawable.ic_life, R.drawable.zhuzy, "zhuzy_"));
        StoryAdapter adapter = new StoryAdapter(getContext(), list);
        LinearLayoutManager linearLayoutManager= new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        storyRV.setLayoutManager(linearLayoutManager);
        storyRV.setNestedScrollingEnabled(false);
        storyRV.setAdapter(adapter);

       dashRV = view.findViewById(R.id.dashRV);
       dashList = new ArrayList<>();
       dashList.add(new Dashboard(R.drawable.zhuzy, R.drawable.metwo, R.drawable.ic_saved_foreground,"Zhuzy", "Happy", "450", "12", "6" ));
       dashList.add(new Dashboard(R.drawable.zhuzy, R.drawable.fav, R.drawable.ic_bookmark_foreground,"Zhuzy", "Wedding Day", "1450", "46", "7" ));
        dashList.add(new Dashboard(R.drawable.zhuzy, R.drawable.friends, R.drawable.ic_saved_foreground,"Zhuzy", "Friends", "4850", "36", "6" ));
        dashList.add(new Dashboard(R.drawable.zhuzy, R.drawable.me, R.drawable.ic_bookmark_foreground,"Zhuzy", "Just me", "1850", "56", "6" ));
        LinearLayoutManager linear = new LinearLayoutManager(getContext());
        DashboardAdapter adapter1 = new DashboardAdapter(dashList, getContext());

        dashRV.setLayoutManager(linear);
        dashRV.setNestedScrollingEnabled(false);
        dashRV.setAdapter(adapter1);
        return view;
    }
}