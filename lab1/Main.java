package lab1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Monitor msg = new Monitor("red", 27f, 68f);
        Monitor msg2 = new Monitor("red", 47f, 89f);

        System.out.println("First monitor specs are:\nColor - " + msg.color + "\nDimension - " + msg.dimension +
                "\nResolution - " + msg.resolution);
        System.out.println("Second monitor specs are:\nColor - " + msg2.color + "\nDimension - " + msg2.dimension +
                "\nResolution - " + msg2.resolution + "\n");

        if (msg.color.equals(msg2.color)) {
            System.out.println("Colors are the same");
        } else {
            System.out.println("Colors are not the same");
        }

        if (msg.dimension == msg2.dimension) {
            System.out.println("\nDimensions are the same");
        }
        else System.out.println("Dimensions are not the same");
        if (msg.resolution == msg2.resolution) {
            System.out.println("\nResolutions are the same");
        }
        else System.out.println("Resolutions are not the same\n");


        Students tmp = new Students(19, 9.7f, "Mihai Filipescu");
        Students tmp2 = new Students(19, 9.0f, "Dumitru Dodi");
        Students tmp3 = new Students(19, 9.2f, "Cristi Dodi");
        Students tmp4 = new Students(20, 8.8f, "Oleg Pavlov");
        Students tmp5 = new Students(25, 9.3f, "Jora Pascal");
        Students tmp6 = new Students(18, 9.5f, "Abdula Cioban");

        ArrayList<Students> students1 = new ArrayList<Students>();
        students1.add(tmp);
        students1.add(tmp2);
        University utp = new University("UTM", 1964, students1);

        ArrayList<Students> students2 = new ArrayList<Students>();
        students2.add(tmp3);
        students2.add(tmp4);
        University utp2 = new University("ASEM", 2007, students2);

        ArrayList<Students> students3 = new ArrayList<Students>();
        students3.add(tmp5);
        students3.add(tmp6);
        University utp3 = new University("USM", 1939, students3);


        System.out.println("Average in first university - " + utp.getAverage());
        System.out.println("Average in second university - " + utp2.getAverage());
        System.out.println("Average in third university - " + utp3.getAverage());

    }
}
