package DeveloperCompany;

public class SeniorDeveloper extends Employee {
    public SeniorDeveloper(String id, String name) {
        super(id, name);
    }
    @Override
    public void work() {
        setSalary(Salaries.SENIOR.getSalary());
        System.out.println(getName() + " Senior Developer starts to working...");
    }
}
