//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // className objectName = new className ();
        calculator m1 = new calculator(10,5, "black");
        System.out.println(m1.multiplication());
        System.out.println(m1.division());
        System.out.println(m1.addition());
        System.out.println(m1.subtraction());

        calculator m2 = new calculator(23,3,"blue");
        System.out.println(m2.multiplication());
    }
}