import Ejemplo01.SiNoThread;

public class Main {
    public static void main(String[] args){

        Thread newThread1 = new Thread(new SiNoThread("SI"));
        Thread newThread2 = new Thread(new SiNoThread("NO"));


        //siNoThread1.setPriority(1);
        //siNoThread2.setPriority(9);

        newThread1.start();
        newThread2.start();

    }
}
