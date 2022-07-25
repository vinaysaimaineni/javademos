package practiseproject11;

public class MyRunnablethread implements Runnable{
	 
    public static int myCount = 0;
    public MyRunnablethread(){
         
    }
    public void run() {
        while(MyRunnablethread.myCount <= 10){
            try{
                System.out.println("Expl Thread: "+(++MyRunnablethread.myCount));
                Thread.sleep(100);
            } catch (InterruptedException iex) {
                System.out.println("Exception in thread: "+iex.getMessage());
            }
        }
    } 
    public static void main(String a[]){
        System.out.println("Starting Main Thread...");
        MyRunnablethread mrt = new MyRunnablethread();
        Thread t = new Thread(mrt);
        t.start();
        while(MyRunnablethread.myCount <= 10){
            try{
                System.out.println("Main Thread: "+(++MyRunnablethread.myCount));
                Thread.sleep(100);
            } catch (InterruptedException iex){
                System.out.println("Exception in main thread: "+iex.getMessage());
            }
        }
        System.out.println("End of Main Thread...");
    }
}