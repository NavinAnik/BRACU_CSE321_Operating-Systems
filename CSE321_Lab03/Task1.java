class myt extends Thread{
    public void run() {
        for(int i=1; i<=30; i++) {
            System.out.println("Output from:" + getName() + ": " + i);
            if (i==10) {
                mytf2 mythread2 = new mytf2();
                mythread2.start();

                try {
                    mythread2.join();
                } catch (InterruptedException e) {

                    e.printStackTrace();
                }
                i=20;
            }
            try {
                sleep(2000);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
        }
    }
}

class mytf2 extends Thread{
    @Override
    public void run() {

        for(int i=11; i<=20; i++) {
            System.out.println("Output from:" + getName() + ": " + i);
            try {
                sleep(2000);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
        }

    }
}

 class task1 {

    public static void main(String[] args) {



        myt mythread1 = new myt();


        mythread1.run();

    }

}
