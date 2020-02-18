import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        double a = scanner.nextDouble();
        System.out.println("Enter b: ");
        double b = scanner.nextDouble();
        System.out.println("Enter c: ");
        double c = scanner.nextDouble();

        QuadraticEquation q = new QuadraticEquation(a, b, c);

        if (q.getDiscriminant()<0)
            System.out.println("Equation has no root.");
        else if (q.getDiscriminant()==0)
            System.out.println("Equation has 1 root: " +q.getRoot1());
        else
            System.out.println("Equation has 2 roots: "+q.getRoot1()+ " and " +q.getRoot2());
    }
}
