class MyThread extends Thread {

    public void run() {
        System.out.println("Thread is running created by extending to parent Thread class");
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}
