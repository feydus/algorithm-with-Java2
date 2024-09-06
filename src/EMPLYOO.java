public class EMPLYOO {
    public String name;
    public double salary;
    public int workHours;
    public int hireYear;

    EMPLYOO(int hireYear, int workHours, double salary, String name) {
        this.hireYear = hireYear;
        this.workHours = workHours;
        this.salary = salary;
        this.name = name;
    }

    public double tax() {
        if (this.salary >= 1000){
            return salary * 0.03;
        }
        return 0.0;
    }
    public double hireSalary(){
        int extraHours = this.workHours - 40;
        if (extraHours > 0){
            return 30 * extraHours;
        }
        return 0.0;
    }
    public double raiseSalary(){
        int year = 2020 - this.hireYear;
        if (year < 10 ){
            return salary * 0.05;
        } else if (year >= 10 && year < 20) {
            return salary * 0.1;
        }else{
            return salary * 0.15;
        }
    }
    public void toString (EMPLYOO emp1) {
        System.out.println("Tax : " + emp1.tax());
        System.out.println("Bonus : " + emp1.hireSalary());
        System.out.println("Increase Salary " + emp1.raiseSalary());
        double totalSalary = emp1.salary - emp1.tax() + emp1.raiseSalary();
        System.out.println("Total Salary : " + totalSalary);
        System.out.println("Total Salary with the raise of salary : " + (emp1.salary + emp1.raiseSalary()));

    }
}
