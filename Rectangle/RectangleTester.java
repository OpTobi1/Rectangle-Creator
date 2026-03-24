package Rectangle;

import java.util.Scanner;

public class RectangleTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] width = {2, 3, 4, 5, 6};
        double[] height = {3, 4, 5, 6, 7};
        double totalGrade = 0;

        for (int i = 0; i < width.length; i++) {
            Rectangle1 r = new Rectangle1(width[i], height[i]);
            double currentGrade = 0;

            System.out.println("let width of Rectangle1 be " + r.getWidth());
            System.out.println("let height of Rectangle1 be " + r.getHeight());

            System.out.println(": insert area of Rectangle1");
            double userArea = scanner.nextDouble();

            System.out.println(": insert perimeter of Rectangle1");
            double userPerimeter = scanner.nextDouble();

            System.out.println(": insert diagonal of Rectangle1");
            double userDiagonal = scanner.nextDouble();

            System.out.println(":The answer is");
            System.out.println(r);

            if (Math.abs(userArea - r.getArea()) < 0.01) {
                System.out.println("you got the area correct +3");
                currentGrade += 3;
            }
            if (Math.abs(userPerimeter - r.getPerimeter()) < 0.01) {
                System.out.println("you got the perimeter correct +3");
                currentGrade += 3;
            }
            if (Math.abs(userDiagonal - r.getDiagonal()) < 0.01) {
                System.out.println("you got the diagonal correct +4");
                currentGrade += 4;
            }

            System.out.println("*****");
            totalGrade += currentGrade;
        }

        System.out.println("**********\nyour grade is: " + (totalGrade / width.length)); // מנרמל ציון

        System.out.println("\n--- Part B ---");

        Rectangle1 r1 = new Rectangle1(2, 3);
        Rectangle1 r2 = new Rectangle1(1, 6);
        Rectangle1 r3 = new Rectangle1(3, 4);
        Rectangle1[] rects = {r1, r2, r3};

        for (int i = 0; i < rects.length; i++) {
            for (int j = i + 1; j < rects.length; j++) {
                if (Math.abs(rects[i].getArea() - rects[j].getArea()) < 0.001) {
                    System.out.println(":the area of the next two Rectangle1s is equal");
                    System.out.println(rects[i]);
                    System.out.println(rects[j]);
                }
            }
        }
        scanner.close();
    }
}