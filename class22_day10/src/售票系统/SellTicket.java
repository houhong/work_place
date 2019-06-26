package ��Ʊϵͳ;


/**
    -----����ϵͳ
 * Created by Gavin on 2018/8/26.

 */

class SellTicket implements Runnable {

    private Integer ticketCount = 9;

    private Object mutex = new Object();

    @Override

    public void run() {

        while (true) {

            if(ticketCount > 0) {

                sell();

            }
            else{
            	break;
            }

        }

    }

    private void sell() {
    	
    	//������
        synchronized (mutex) {

            if(ticketCount > 0) {

                ticketCount--;

                System.out.println(Thread.currentThread()+"�۳�Ʊ" + ticketCount);

                try {

                    Thread.sleep(1000);

                } catch (InterruptedException e) {

                    e.printStackTrace();

                }

            } else {

                System.out.println("Ʊ�Ѿ�����");

            }

        }

    }

    public static void main(String[] args) {

        SellTicket s = new SellTicket();

        new Thread(s).start();

        new Thread(s).start();

        new Thread(s).start();

    }

}


