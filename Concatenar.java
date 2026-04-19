package app;

public class Concatenar {
    public static void main(String[] args) {

        String product1 = "Computer";
        String product2 = "Office Desk";
        int age = 30;
        int code = 5290;
        String gender = "f";
        double prince1 = 2100.0;
        double prince2 = 650.50;
        double measure = 53.234567;

        System.out.println("Products:");
        System.out.printf("%s, which price is $%.2f %s , which price is %.2f", product1, prince1, product2, prince2);
        System.out.println("");

        System.out.printf("Record: %d years old, code %d and gender:%s", age, code, gender);
        System.out.println("");
        System.out.printf("Measure with eight decimal places:%.8f Rouded:%.3f US decimal point:%.3f", measure, measure, measure);
        
    }
}
