public class MainProgram {
    public static void main(String[] args) {

        Staff[] staffList = new Staff[10];

        double sumOfSalaries = 0;
        for(int i=0; i<10; i++) {
            staffList[i] = new Staff("bob" + (i+1));
            System.out.println(staffList[i].getName() + ": Salary: " + staffList[i].getSalary());

            sumOfSalaries += staffList[i].getSalary();
        }
        System.out.println("Sum of all Salaries: "+sumOfSalaries);
    }
}
