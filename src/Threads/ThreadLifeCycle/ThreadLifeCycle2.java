package Threads.ThreadLifeCycle;

class ThreadLifeCycle2 implements Runnable {
    Message msg;

    public ThreadLifeCycle2(Message msg) {
        this.msg = msg;
    }

    @Override
    public void run() {
        try {
            synchronized (msg) {
                msg.wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}