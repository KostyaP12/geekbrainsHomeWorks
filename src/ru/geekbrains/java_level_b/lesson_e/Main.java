package ru.geekbrains.java_level_b.lesson_e;

import java.util.Arrays;

public class Main  {
    static final int size = 10000000;
    static final int h = size / 2;

    public static void main(String[] args) {
        firstMethod();
        secondMethod();
    }
    public static void firstMethod (){
        float[] arr = new float[size];
        Arrays.fill(arr, 1);
        long a = System.currentTimeMillis();
        for(int i = 0; i < arr.length; i++){
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.currentTimeMillis();
        System.out.println(System.currentTimeMillis() - a);
    }

    public static synchronized void secondMethod (){

        float[] arr = new float[size];
        float[] a1 = new float[h];
        float[] a2 = new float[h];
        Arrays.fill(arr, 1);

        long a = System.currentTimeMillis();

        System.arraycopy(arr, 0, a1, 0, h);
        System.arraycopy(arr, h, a2, 0, h);

        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread());
                for(int i = 0; i < a1.length; i++){
                    a1[i] = (float)(a1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
            }
        };
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread());
                for(int i = 0; i < a2.length; i++){
                    a2[i] = (float)(a2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
            }
        };


        Thread t1 = new Thread(r, "Thread-1");
        t1.start();

        Thread t2 = new Thread(r1, "Thread-2");
        t2.start();

        try {
            t1.join();
            t2.join();

        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.arraycopy(a1, 0, arr, 0, h);
        System.arraycopy(a2, 0, arr, h, h);

        System.currentTimeMillis();
        System.out.println(System.currentTimeMillis() - a);
    }

    public Main() {
    }
}
