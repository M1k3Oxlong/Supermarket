public class Staff {

    private String name;
    private double salary;

    public Staff(String name){
        this.name = name;
        this.salary = Math.random() * 2200+400;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }
}
