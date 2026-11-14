package homeworks.employee;

public class EmployeeStorage {
    private Employee[] employeearray = new Employee[10];
    int employee = 0;

    public void add(Employee e) {
        if (employee == employeearray.length) {
            extend();
        }
        employeearray[employee++] = e;
    }

    private void extend() {
        Employee[] tmp = new Employee[employeearray.length + 10];
        for (int i = 0; i < employeearray.length; i++) {
            tmp[i] = employeearray[i];
        }
        employeearray = tmp;
    }

    public void searchById(String keyword) {
        boolean found = false;
        for (int i = 0; i < employee; i++) {
            if (employeearray[i].getEmployeeID() != null && employeearray[i].getEmployeeID().equals(keyword)) {
                System.out.print(employeearray[i] + " ");
                found = true;
            }
        }
        if (!found) {
            System.out.println("Employee not found!");
        }
    }

    public void searchByCompany(String keyword) {
        boolean found = false;
        for (int i = 0; i < employee; i++) {
            if (employeearray[i].getCompany() != null && employeearray[i].getCompany().equals(keyword)) {
                System.out.println(employeearray[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Employee not found!");
        }
    }

    public void print() {
        if (employee == 0) {
            System.out.println("No employees found");
            return;
        }
        for (int i = 0; i < employee; i++) {
            System.out.println("Employee " + (i + 1) + ":");
            System.out.println(employeearray[i]);
            System.out.println();
        }
    }

    public boolean existID(String employeeID) {
        for (int i = 0; i < employee; i++) {
            if (employeearray[i].getEmployeeID().equals(employeeID)) {
                return true;
            }
        }
        return false;
    }

    public void searchByMinimumSalary(String keyword) {
        boolean found = false;
        for (int i = 0; i < employee; i++) {
            if (employeearray[i].getSalary() != null && employeearray[i].getSalary().compareTo(keyword) >= 0) {
                System.out.println(employeearray[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Employee with this salary doesn't exist");
        }
    }
}


