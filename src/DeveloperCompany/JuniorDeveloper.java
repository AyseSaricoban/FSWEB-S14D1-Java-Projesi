package DeveloperCompany;


public class JuniorDeveloper extends Employee {
    public JuniorDeveloper(String id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        setSalary(Salaries.JRDEVELOPER.getSalary());
        System.out.println(getName() + " Jr Developer starts to working...");
    }
}
