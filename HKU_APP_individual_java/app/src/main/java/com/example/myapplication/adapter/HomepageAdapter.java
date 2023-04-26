package com.example.myapplication.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;

import java.util.List;


public class HomepageAdapter  extends RecyclerView.Adapter<HomepageAdapter.ViewHolder> {
    List<Integer> contentList;
    public HomepageAdapter(List<Integer> list) {
        this.contentList = list;
    }
    @NonNull
    @Override
    public HomepageAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_home_list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HomepageAdapter.ViewHolder holder, int position) {
        Integer num = contentList.get(position);
        holder.getContent().setText(num.toString());
    }

    @Override
    public int getItemCount() {
        return contentList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView content;
        public ViewHolder(View view) {
            super(view);
            this.content = view.findViewById(R.id.textContent);
        }

        public TextView getContent() {
            return content;
        }
    }
}
