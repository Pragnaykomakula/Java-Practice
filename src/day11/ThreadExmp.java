package day11;

public class ThreadExmp {
    public static void main(String[] args) {

        FileDownloader f1 = new FileDownloader("Inventory_Update.zip");
        FileDownloader f2 = new FileDownloader("Database_Backup.db");


        Thread t1 = new Thread(f1);
        Thread t2 = new Thread(f2);
        t1.start();
        t2.start();


    }
}
class FileDownloader implements Runnable{
    private String fileName;
    FileDownloader(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void run() {

            try {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Downloading " + fileName + ": " + (i * 20) + "%");
                    Thread.sleep(1000);
                }
                System.out.println("SUCCESS: " + fileName + " is ready.");
            }
            catch (InterruptedException e) {
                System.out.println("Thread Interrupted");
            }

    }
}
