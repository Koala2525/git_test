package com.example.recylerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.ViewHolder> {
    private List<String> lists;
    private Context context;

    public RecycleViewAdapter(Context context, List<String> lists) {
        this.context = context;
        this.lists = null;
        this.lists = lists;
    }
    //自定义ViewHolder,包含item的所有界面元素
    public static class ViewHolder extends RecyclerView.ViewHolder {
        public final TextView textView;
        public ViewHolder(View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.textView2);
        }
    }

    //创建View,被LayoutManager所用
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.items_test_sec,parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }


    //数据的绑定
    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.textView.setText(lists.get(position));
    }

    @Override
    public int getItemCount(){
        return lists.size();
    }
}