package com.example.recylerview;

public class lithoitem {
    private String text_1;//用户名
    private String text_2;//用户id
    private int imageId_1;//用户头像
    private int imageId_2;//右上角icon
    private String text_3;//文本信息
    private int imageId_3;//文本图片
    private int imageId_3_x;
    private int imageId_3_y;

    public lithoitem(String user_name, String user_id,int imageId_1,int imageId_2,
                        String text_3,int imageId_3,int imageId_3_x,int imageId_3_y){
        this.text_1=user_name;
        this.text_2=user_id;
        this.imageId_1=imageId_1;
        this.imageId_2=imageId_2;
        this.text_3=text_3;
        this.imageId_3=imageId_3;
        this.imageId_3_x=imageId_3_x;
        this.imageId_3_y=imageId_3_y;
    }

    public String getName(){
        return text_1;
    }

    public String getId(){
        return text_2;
    }

    public int getImageId_1(){
        return imageId_1;
    }

    public int getImageId_2(){
        return imageId_2;
    }

    public String getTextMessage(){return text_3; }

    public int getImageId_3() {
        return imageId_3;
    }

    public int getImageId_3_x() {
        return imageId_3_x;
    }

    public int getImageId_3_y() {
        return imageId_3_y;
    }
}
