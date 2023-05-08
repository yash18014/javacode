import java.util.Scanner;
public class Main {
            public static void main(String[] args) {
                System.out.println("Taking input from user");
                Scanner sc = new Scanner(System.in);
                System.out.println("enter total marks");
                float out = sc.nextFloat();
                System.out.println("enter marks of subject 1");
                float sub1 = sc.nextFloat();
                System.out.println("enter marks of subject 2");
                float sub2 = sc.nextFloat();
                System.out.println("enter marks of subject 3");
                float sub3 = sc.nextFloat();
                System.out.println("enter marks of subject 4");
                float sub4 = sc.nextFloat();
                System.out.println("enter marks of subject 5");
                float sub5 = sc.nextFloat();

                float Total = ((sub1 + sub2 + sub3 + sub4 + sub5) / (5 * out)) * 100;
                System.out.println(Total);

            }
        }