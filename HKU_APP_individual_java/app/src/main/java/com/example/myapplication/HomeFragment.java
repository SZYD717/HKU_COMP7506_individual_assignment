package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.example.myapplication.adapter.HomepageAdapter;

import java.util.LinkedList;
import java.util.List;

public class HomeFragment extends Fragment{
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.recycleView);
        //Just a simple example of data loading in adapter
        List<Integer> nums = new LinkedList<>();
        for(int i=0;i<10;i++){
            nums.add(i);
        }
        HomepageAdapter homepageAdapter = new HomepageAdapter(nums);
        recyclerView.setAdapter(homepageAdapter);
        return view;
    }
}
