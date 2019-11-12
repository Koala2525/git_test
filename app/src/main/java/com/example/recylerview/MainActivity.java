package com.example.recylerview;

import android.support.annotation.Nullable;
//import android.support.v7.app.AlertController;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private LinearLayoutManager linearLayoutManager;
    //private List<String> lists;

//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        //模拟一些数据加载
//        lists = new ArrayList<>();
//        for (int i = 0; i < 50; i++) {
//            lists.add(i + "item");
//        }
//        recyclerView = (RecyclerView) findViewById(R.id.recy_test_one);
//        //这里使用线性布局像listview那样展示列表,第二个参数可以改为 HORIZONTAL实现水平展示
//        linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
////使用网格布局展示
////        recyclerView.setLayoutManager(new GridLayoutManager(this, 5));
//        recyclerView.setLayoutManager(linearLayoutManager);
//        final RecycleViewAdapter adapter = new RecycleViewAdapter(this, lists);
//        //设置分割线使用的divider
//        recyclerView.addItemDecoration(new android.support.v7.widget.DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
//        recyclerView.setAdapter(adapter);
//    }

    private List<lithoitem> lithoitemlists;

    private String[] data = new String[]{
        "这是一段短的测试文字，在屏幕上最多展示为两行，再加一段后缀文字。",
            "百度百科是百度公司2006年4月20日发布的开放式网络百科全书，2008年4月21日推出正式版，" +
             "截止到2018年10月其条目总量已超过1,559万。 百度官方表示，百度百科在创建一部网络百科全书的同时，" +
             "亦作为百度为网友提供的信息存储空间。百度百科在精神上主张“平等、协作、分享、自由”。",
                "这段文字没有意义"
    };

    @Override
    protected void onCreate(@Nullable Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_main);

        lithoitemlists=new ArrayList<>();
        initlithoitem();
        recyclerView=(RecyclerView)findViewById(R.id.recy_test_one);
        linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);
        final lithotestAdapter adapter=new lithotestAdapter(this,lithoitemlists);

        recyclerView.addItemDecoration(new android.support.v7.widget.DividerItemDecoration(this,DividerItemDecoration.VERTICAL));

        recyclerView.setAdapter(adapter);
    }

    public void initlithoitem(){
        for(int i=0;i<5;++i){
            lithoitem item_1=new lithoitem("大圣","1572870645724",R.drawable.multi_image_1,
                    R.drawable.icon_test,data[0],R.drawable.image_test_1,800,1066);
            lithoitemlists.add(item_1);
            lithoitem item_2=new lithoitem("罗小黑","1572870645725",R.drawable.multi_image_2,
                    R.drawable.icon_test,data[1],R.drawable.image_test_2,800,480);
            lithoitemlists.add(item_2);
            lithoitem item_3=new lithoitem("哪吒","1572870645726",R.drawable.multi_image_3,
                    R.drawable.icon_test,data[2],R.drawable.image_test_3,700,934);
            lithoitemlists.add(item_3);
        }
    }
}
