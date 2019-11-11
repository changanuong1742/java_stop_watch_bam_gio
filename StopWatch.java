import java.util.Scanner;

public class StopWatch {

    private long startTime = 0;
    private long stopTime = 0;


    public StopWatch() {
    }

    public StopWatch(long startTime, long stopTime) {
        this.startTime = startTime;
        this.stopTime = stopTime;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getStopTime() {
        return stopTime;
    }

    public void setStopTime(long stopTime) {
        this.stopTime = stopTime;
    }

    public long start() {
        return this.startTime = System.currentTimeMillis();
    }

    public long stop() {
        return this.stopTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return this.startTime - this.startTime;
    }


    public static void main(String[] args) {

        StopWatch dongHo = new StopWatch();

        Scanner input = new Scanner(System.in);
        int choice;


        do {
            System.out.println("1. Bắt Đầu");
            System.out.println("2. Dừng");
            System.out.println("0. Đặt lại");
            System.out.println("Enter your choice: ");

            choice = input.nextInt();

            switch (choice) {
                case 1:
                    dongHo.start();
                    System.out.println(dongHo.start());
                    break;
                case 2:
                    dongHo.stop();
                    System.out.println(dongHo.stop());
                    System.out.println("Chay duoc: " + dongHo.getElapsedTime());
                    break;
                case 0:
                    dongHo.start();
                    System.out.println(dongHo.start());

            }


        } while (choice != 0);
    }
}
