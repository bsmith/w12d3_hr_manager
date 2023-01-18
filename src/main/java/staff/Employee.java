package staff;

public abstract class Employee {
    private String name;
    private String niNumber;
    private double salary;

    public Employee(String name, String niNumber, double salary) {
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNiNumber() {
        return niNumber;
    }

    public double getSalary() {
        return salary;
    }

    public String raiseSalary(double increment) {
        if (increment > 0) {
            this.salary += increment;
//            return ((Double)this.salary).toString();
            return String.format("%.2f", this.salary);
        }
        else {
            return "wrong increment";
        }
    }

    public double payBonus() {
        return 0.01 * this.salary;
    }
}
