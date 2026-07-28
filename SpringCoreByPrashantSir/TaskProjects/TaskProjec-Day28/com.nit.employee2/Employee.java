
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {

    @Value("${employee.name}")
    private String name;

    @Value("${employee.department}")
    private String department;

    @Value("${employee.empId}")
    private int empId;

    @Value("${employee.salary}")
    private int salary;

    @Value("${employee.experience}")
    private int experience;

    @Override
    public String toString() {
        return name + " " + department + " " + empId + " " + salary + " " + experience;
    }
}

