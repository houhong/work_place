package 售票系统;


/**
    -----操作系统
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
    	
    	//锁对象
        synchronized (mutex) {

            if(ticketCount > 0) {

                ticketCount--;

                System.out.println(Thread.currentThread()+"售出票" + ticketCount);

                try {

                    Thread.sleep(1000);

                } catch (InterruptedException e) {

                    e.printStackTrace();

                }

            } else {

                System.out.println("票已经售罄");

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


