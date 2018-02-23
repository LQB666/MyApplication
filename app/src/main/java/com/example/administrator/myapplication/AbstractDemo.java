package com.example.administrator.myapplication;

/**
 * Created by Administrator on 2016/12/12.
 */

public  class AbstractDemo {
   public static void main(String[] args){
         B b=new B();
       b.setName("jack");
         b.work();
       C c=new C();
       c.setName("rose");
       c.work();
   }
}
abstract  class A {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    abstract public void work();
}
class B extends A{
    @Override
    public void work() {
        System.out.println("我的名字叫"+super.getName());
    }

}
class C extends A{
    @Override
    public void work() {
        System.out.println("我的名字叫"+this.getName());
    }
}