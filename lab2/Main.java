package lab2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box(5);
        Box box3 = new Box(10,15,14);
        System.out.println("Volume of the box " + box3.getVolume());
        System.out.println("Surface area of the box " + box3.getSurfaceArea());
        Scanner sc = new Scanner(System.in);

        System.out.println("0 - limitless queue");
        System.out.println("1 - finite queue");
        int isLimitless = sc.nextInt();
        Queue queue;

        if(isLimitless == 0){
            queue = new Queue();
        }
        else {
            System.out.println("Insert queue size");
            int size = sc.nextInt();
            queue = new Queue(size);
        }

        System.out.println("1 - Push a number");
        System.out.println("2 - Pop a number");
        System.out.println("3 - Verify is the queue is full");
        System.out.println("4 - Verify if the queue is empty");
        System.out.println("5 - Print the current queue");
        System.out.println("0 - End the operation");

        int num;
        int command = 99;
        while(command != 0){
            command = sc.nextInt();
            switch (command){
                case 0:
                    break;
                case 1:
                    System.out.println("Insert the number");
                    num = sc.nextInt();
                    queue.QueuePush(num);
                    break;
                case 2:
                    queue.QueuePop();
                    break;
                case 3:
                    queue.isFull();
                    break;
                case 4:
                    queue.isEmpty();
                    break;
                case 5:
                    queue.printQueue();
                    break;
            }

        }
//        Queue queue = new Queue();
//        Queue queue = new Queue(3);
//        queue.QueuePush(5);
//        queue.QueuePush(7);
//        queue.QueuePush(10);
//        queue.QueuePush(11);
//
//        queue.QueuePop();
//        queue.QueuePop();
//        queue.QueuePop();
//        queue.QueuePop();
    }
}
