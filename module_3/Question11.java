class DownloadThread extends Thread {
    private volatile boolean running = true;

    public void stopDownload() {
        running = false;
    }

    public void run() {
        int chunk = 1;
        while (running) {
            System.out.println("Downloading chunk " + chunk);
            chunk++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // If interrupted, stop the thread
                running = false;
            }
        }
        System.out.println("Download stopped.");
    }
}

public class Question11 {
    public static void main(String[] args) {
        DownloadThread downloadThread = new DownloadThread();
        downloadThread.start();

        // Let the download run for 5 seconds
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Stop the download
        System.out.println("Stopping download...");
        downloadThread.stopDownload();
    }
}
