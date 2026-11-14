package homeworks.employee;

import java.util.Scanner;

public class EmployeeDemo {
    private static Scanner scanner = new Scanner(System.in);
    private static EmployeeStorage employeeStorage = new EmployeeStorage();


    public static void main(String[] args) {
        boolean isRun = true;
        while (isRun) {
            System.out.println("Please input 0 for EXIT");
            System.out.println("Please input 1 for ADD EMPLOYEE");
            System.out.println("Please input 2 for PRINT ALL EMPLOYEES");
            System.out.println("Please input 3 for SEARCH EMPLOYEE BY ID");
            System.out.println("Please input 4 for SEARCH EMPLOYEES BY COMPANY NAME");
            System.out.println("Please input 5 for SEARCH EMPLOYEES BY MINIMUM SALARY");
            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    isRun = false;
                    System.out.println("Program finished");
                    break;
                case "1":
                    addEmployee();
                    break;
                case "2":
                    employeeStorage.print();
                    break;
                case "3":
                    searchEmployeeById();
                    break;
                case "4":
                    searchEmployeeByCompanyName();
                    break;
                case "5":
                    searchByMinimumSalary();
                    break;
                default:
                    System.out.println("Invalid command. Please try again");
            }
        }
    }

    private static void searchByMinimumSalary() {
        System.out.println("Please imput minimum sum of salary");
        String keyword = scanner.nextLine();
        employeeStorage.searchByMinimumSalary(keyword);
    }

    private static void searchEmployeeByCompanyName() {
        System.out.println("Please input company name:");
        String keyword = scanner.nextLine();
        employeeStorage.searchByCompany(keyword);
    }

    private static void searchEmployeeById() {
        System.out.println("Please input employee ID:");
        String keyword = scanner.nextLine();
        employeeStorage.searchById(keyword);
    }

    private static void addEmployee() {
        System.out.println("Please input employee name:");
        String name = scanner.nextLine();

        System.out.println("Please input employee surname:");
        String surname = scanner.nextLine();

        System.out.println("Please input employee ID:");
        String employeeID = scanner.nextLine();
        if (employeeStorage.existID(employeeID)) {
            System.out.println(("Employee with ID " + employeeID + " already exists"));
            return;
        }
        System.out.println("Please input employee salary:");
        String salary = scanner.nextLine();

        System.out.println("Please input company:");
        String company = scanner.nextLine();

        System.out.println("Please input employee position:");
        String position = scanner.nextLine();

        Employee employee = new Employee(name, surname, employeeID,
                salary, company, position);

        employeeStorage.add(employee);
        System.out.println("Employee added!");
    }
}


