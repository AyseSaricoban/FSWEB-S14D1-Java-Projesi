package DeveloperCompany;

public class MidDeveloper extends Employee{
    public MidDeveloper(String id, String name) {
        super(id, name);

    }
    @Override
    public void work() {
        setSalary(Salaries.MID.getSalary());
        System.out.println(getName() + " Mid Developer starts to working...");
    }

}
