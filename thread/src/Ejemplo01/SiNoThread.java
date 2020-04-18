public class SiNoThread extends SiNo implements Runnable{

    public SiNoThread(String s){
        super(s);
    }
    public void run(){
        int i;
        for (i = 1; i <= 20; i++) {
            System.out.println(++contador + ":" + siNo + " ");
        }
    }
}
