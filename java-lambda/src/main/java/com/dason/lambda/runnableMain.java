package com.dason.lambda;

public class runnableMain {

    public static void main(String[] args) {

        System.out.println("= ()-＞多线程任务执行");

        Runnable runnable = new Runnable(){
            public void run(){
                System.out.println("多线程任务执行");
            }
        };
        Runnable runnable1 = ()->{

            System.out.println("多线程任务执行11");

        };
        new Thread(runnable).start();
        new Thread(runnable1).start();


        new Thread( () -> System.out.println("多线程任务执行22")).start();
        new Thread( () -> System.out.println("多线程任务执行33")).start();
    }
}
