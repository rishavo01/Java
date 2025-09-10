class Employee {
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double calculateBonus() {
        return salary * 0.10;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Salary: " + salary + ", Bonus: " + calculateBonus());
    }
}

class Manager extends Employee {
    public Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double calculateBonus() {
        return salary * 0.20;
    }
}

class Developer extends Employee {
    public Developer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double calculateBonus() {
        return salary * 0.15;
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] employees = new Employee[4];
        employees[0] = new Manager("Alice", 80000);
        employees[1] = new Manager("Bob", 90000);
        employees[2] = new Developer("Charlie", 70000);
        employees[3] = new Developer("David", 75000);

        for (Employee e : employees) {
            e.displayInfo();
            System.out.println("-------------------");
        }
    }
}
