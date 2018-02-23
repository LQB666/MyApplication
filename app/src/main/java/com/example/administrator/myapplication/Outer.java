package com.example.administrator.myapplication;

/**
 * Created by Administrator on 2016/12/12.
 */

public class Outer {
  private int i= 100;
    private static int n=200;
    //创建内部类
    // public static class Inner{
     //   private int j=50;
    //    public void innerMethod(){
           // System.out.println("i is"+n);
//
//

   // }

     public void outMethod(){
        class Inner {
            int k=10;
            public void jubu(){
                System.out.println("n is"+n);
                System.out.println("k is"+k);

            }
        }
     }
   // public void makeInner(){

        //外部类方法中创建内部类对象
     //   Inner in =new Inner();
    //}


}
class Test{
    public static void main(String[] args){
        // Outer out=new Outer();
        // Outer.Inner inner= out.new Inner();//常规内部类的访问方法

        // inner.innerMethd();
        // Outer.Inner inner=new Outer.Inner();
        // inner.innerMethod();

        Outer outer=new Outer();
        outer.outMethod();


    }
}