package Perplexity.Chapter_1.Task1;

import java.util.Objects;

public class Employee extends Person{
    private int employeeId;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee person = (Employee) o;
        return super.equals(person)
                && person.getEmployeeId() == this.getEmployeeId();
    }

    @Override
    public int hashCode() {
        return super.hashCode() * getEmployeeId();
    }
}
