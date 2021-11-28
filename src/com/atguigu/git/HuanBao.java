package com.atguigu.git;

public class HuanBao {

    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis()/1000);
        long l = System.currentTimeMillis()/1000;
        junge(l,l-100000000);
    }

    private static void junge(long start,long end){
        long l = end - start;
        if(l < 0){
            System.out.println("时间为负数");
        }else{
            if( l / 86400 < 24){
                System.out.println("时间对了");
            }else{
                System.out.println("时间不在24小时里");
            }
        }
    }

}
