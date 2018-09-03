package com.queen;

/***
 *
 *  .--,       .--,
 * ( (  \.---./  ) )
 *  '.__/o   o\__.'
 *     {=  ^  =}
 *      >  -  <
 *     /       \
 *    //       \\
 *   //|   .   |\\
 *   "'\       /'"_.-~^`'-.
 *      \  _  /--'         `
 *    ___)( )(___
 *   (((__) (__)))    高山仰止,景行行止.虽不能至,心向往之。
 */
public class Main {
    public static void main(String[] args) {
        /**
         * 线程
         *
         * 进程
         * 一个应用程序 就是一个进程
         * 进程里有很多个线程
         * 浏览器 是一个进程  每一个单独的网页是线程
         * 进程只有一个
         *
         * 线程的并发/并行  多个线程同时执行
         * 线程的串行 多个线程穿插执行
         * 线程的同步  当一个线程执行完后再执行另一个线程
         * 线程的异步  可以理解成并行
         *
         * 线程的各个阶段
         * 1.创建状态
         * 2.准备状态
         * 3.运行状态
         * 4.阻塞状态
         * 5.销毁状态
         *
         * 创建线程两种方式
         * 第一 继承 Thread类 复写run方法
         * 第二 实现Runnable接口 复写run方法
         *
         * 任务管理器 cmd +alt +Esc
         */

        //开启线程的方式(Thread)

//        new  MyThread("线程1").start();
//        new  MyThread("线程2").start();
//        new  MyThread("线程3").start();
//        new  MyThread("线程4").start();


        //用Runnable 开启需要依附于Thread

//        new Thread(new MyRunnable()).start();
//        new Thread(new MyRunnable()).start();
//        new Thread(new MyRunnable()).start();
//        new Thread(new MyRunnable()).start();
//

        //因为java只允许单继承 所以若继承Thread类则无法再继承其他类
        //实现Runnable 接口可以继承其他父类

        //子线程主要是帮助我们完成耗时操作
//        new MyThread("wei").start();
//        new MyThread("wei").start();
//        new MyThread("wei").start();
//        new MyThread("wei").start();
//        new MyThread("wei").start();
        //new Sleep("yang").start();

        new Thread(new MyRunnable("/Users/dllo/Desktop/ww.txt","/Users/dllo/Desktop/w.txt",0)).start();
        new Thread(new MyRunnable("/Users/dllo/Desktop/5805773ed2199.jpg","/Users/dllo/Desktop/11.jpg",6000)).start();

    }
}
