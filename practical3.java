class Equation {
public static void main(String[] args) {


double a = 3.4; 
double b = 50.2;
 double e = 41.5;

double c = 2.1;
 double d = 0.55;
  double f = 5.9;


        
        double denominator = (a * d) - (b * c); 
        System.out.printf("Denominator = %.3f\n", denominator);


        double x = ((e * d) - (b * f)) / denominator; 
        System.out.printf("e * f = %.3f\n", (41.5 * 0.55));
        System.out.printf("b * f = %.3f\n", (50.2 * 5.9));
        System.out.println("x = ((41.5 * 0.55) - (50.2 * 5.9)) / " + denominator);
        System.out.printf("x = %.3f\n", x);

       double y = ((a * f) - (e * c)) / denominator; 
        System.out.printf("a * f = %.3f\n", (3.4 * 5.9));
        System.out.printf("e * c = %.3f\n", (41.5 * 2.1));
       System.out.println("y = ((3.4 * 5.9) - (41.5 * 2.1)) / " + denominator);
       System.out.printf("y = %.3f\n", y);
}
}
