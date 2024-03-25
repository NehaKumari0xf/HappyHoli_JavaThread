class holi extends Thread{
    public void run(){
        int i=3;
        while(i>=1){
            System.out.println(i+"...");
            i--;
            try {
                Thread.sleep(250);
            } catch (Exception e) {
                System.out.println(e);
            }
        }System.out.println("Let's go...");
    }
}

class holiHai extends Thread{
    public void run(){
        int i=0;
        while (true) {
            try {
                System.out.println("Happy Holi To All Of You...");
                Thread.sleep(200);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
