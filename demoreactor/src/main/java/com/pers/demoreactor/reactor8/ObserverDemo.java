package main.java.com.pers.demoreactor.reactor8;

import java.util.Observable;

/**
 * @ClassName ObserverDemo
 * @Description //TODO
 * @Author LiuRan
 * @Date 2020/7/3 21:08
 * @Version 1.0
 */
public class ObserverDemo extends Observable {
    public static void main(String[] args) {
        ObserverDemo observerDemo = new ObserverDemo();
        //添加观察者
        observerDemo.addObserver((o,arg)->{
            System.out.println("发生了变化 has changed");
            System.out.println("发生变化 has changed");
        });
        observerDemo.addObserver((o,arg)->{
            System.out.println("收到被观察者的通知，准备改变 get message start changed");
            System.out.println("收到被观察者通知，准备改变 get message start changed");
        });
        observerDemo.setChanged();//数据变化
        observerDemo.notifyObservers();//通知
    }
}
