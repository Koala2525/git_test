package com.example.recylerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class lithotestAdapter extends RecyclerView.Adapter<lithotestAdapter.ViewHolder> {
    private List<lithoitem> litholist;
    private Context context;

    static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView image_1;//用户头像
        ImageView image_2;//右上角icon
        ImageView image_3;//文本图片

        TextView text_1;//用户姓名
        TextView text_2;//用户id
        TextView text_3;//文本信息

        /**
         *
         * @param view
         * 用来给各个对象赋值
         */
        public ViewHolder(View view) {
            super(view);
            image_1 = (ImageView) view.findViewById(R.id.imageView_1);
            image_2 = (ImageView) view.findViewById(R.id.imageView_2);
            image_3 = (ImageView) view.findViewById(R.id.imageView_3);


            text_1 = (TextView) view.findViewById(R.id.textView_1);
            //text_1.getPaint().setFakeBoldText(true); //字体加粗变黑
            text_2 = (TextView) view.findViewById(R.id.textView_2);
            text_3 = (TextView) view.findViewById(R.id.textView_3);
        }
    }

    public lithotestAdapter(Context context,List<lithoitem> lithoitemList){

        this.litholist=lithoitemList;
        this.context=context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent,int viewType){
        View view = LayoutInflater.from(context)
                .inflate(R.layout.items_test_fou,parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position){
        lithoitem litho=litholist.get(position);

        holder.text_1.setText(litho.getName());
        holder.text_2.setText(litho.getId());
        holder.text_3.setText(litho.getTextMessage());

        holder.image_1.setImageResource(litho.getImageId_1());
        holder.image_2.setImageResource(litho.getImageId_2());

        //if(litho.getImageId_3_x()>litho.getImageId_3_y())
        holder.image_3.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
//        holder.image_3.getLayoutParams().height=(litho.getImageId_3_y()*3/4);
//        holder.image_3.getLayoutParams().width=(litho.getImageId_3_x()*3/4);

        if(litho.getImageId_3_x()>litho.getImageId_3_y()){
            holder.image_3.getLayoutParams().height=350;
            holder.image_3.getLayoutParams().width=350*litho.getImageId_3_x()/litho.getImageId_3_y();
        }
        else
        {
            holder.image_3.getLayoutParams().width=400;
            holder.image_3.getLayoutParams().height=400*litho.getImageId_3_y()/litho.getImageId_3_x();
        }
        holder.image_3.setImageResource(litho.getImageId_3());
    }

    @Override
    public int getItemCount(){
        return litholist.size();
    }
}
