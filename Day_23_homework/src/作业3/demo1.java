package ��ҵ3;


public class demo1 {

    public static void main(String[] args) {

        //����һ��ͬ���������������߳̽������

        Object lock = new Object();

 

        Thread digit = new Thread(new Runnable() {

            @Override

            public void run() {

                //Ҫ�Ȼ��lock�����������ܽ�������Ĵ����

                synchronized (lock){

 

                    for (int i = 1; i <= 52;){

                        System.out.print(i++);

                        System.out.print(i++);

                        try {

                            lock.wait();

                        } catch (InterruptedException e) {

                            e.printStackTrace();

                        }

                        lock.notify();

                    }

                }

            }

        });

 

        Thread word = new Thread(new Runnable() {

            @Override

            public void run() {

                synchronized (lock){

                    lock.notify();

                    try {

                        Thread.sleep(100);

                    } catch (InterruptedException e) {

                        e.printStackTrace();

                    }

                    for (int i = 'a'; i <= 'z';i++){

                        System.out.print((char)i+" ");

                        try {

 

                            lock.wait();

 

                        } catch (InterruptedException e) {

                            e.printStackTrace();

                        }

                        lock.notify();

                    }

                }

            }

        });

 

        digit.start();

        word.start();

    }

}

