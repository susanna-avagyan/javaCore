package homeworks.employee;

import java.util.Objects;

public class Employee {
    private String name;
    private String surname;
    private String employeeID;
    private String salary;
    private String company;
    private String position;

    public Employee() {
    }

    public Employee(String name, String surname, String employeeID, String salary, String company, String position) {
        this.name = name;
        this.surname = surname;
        this.employeeID = employeeID;
        this.salary = salary;
        this.company = company;
        this.position = position;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }


    @Override
    public String toString() {
        return "Name: " + name +
                "\nSurname: " + surname +
                "\nID: " + employeeID +
                "\nSalary " + salary +
                "\nCompany: " + company +
                "\nPosition: " + position;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }

        Employee employee = (Employee) obj;
        if (employeeID != null && !employeeID.equals(employee.employeeID)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(employeeID);
    }
}






