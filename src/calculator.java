public class calculator {
    public int number1; // public's mean : ı can access this from any class ı want
    public int number2; //I defined a variable for this class
    public String renk;//private's mean : ı can only use the variable ı assign with in this class
    calculator (int number1, int number2, String renk){
        this.number1 = number1;
        this.number2 = number2;
        this.renk = renk;
    }
    public int addition () {
        return number1 + number2;
    }
    public int subtraction() {
        return number1 - number2;
    }
    public int multiplication(){
        return number1 * number2;
    }
    public int division() {
        return number1 / number2;
    }
}
