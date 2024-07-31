public class EmployeeManagementSystem {
    private Employee[] employees;
    private int count;

    public EmployeeManagementSystem(int size) {
        employees = new Employee[size];
        count = 0;
    }

    public void addEmployee(Employee employee) {
        if (count < employees.length) {
            employees[count] = employee;
            count++;
        } else {
            System.out.println("Employee list is full");
        }
    }

    public Employee searchEmployee(int employeeId) {
        for (Employee employee : employees) {
            if (employee != null && employee.getEmployeeId() == employeeId) {
                return employee;
            }
        }
        return null;
    }

    public void traverseEmployees() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    public boolean deleteEmployee(int employeeId) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getEmployeeId() == employeeId) {
                employees[i] = null;
                count--;
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        EmployeeManagementSystem ems = new EmployeeManagementSystem(10);

        // Adding Employees
        ems.addEmployee(new Employee(1, "Alice", "Developer", 70000));
        ems.addEmployee(new Employee(2, "Bob", "Designer", 65000));

        // Searching for an Employee
        System.out.println(ems.searchEmployee(1));  // Output: Employee{employeeId=1, name='Alice', position='Developer', salary=70000.0}

        // Traversing Employees
        ems.traverseEmployees();

        // Deleting an Employee
        ems.deleteEmployee(2);
        ems.traverseEmployees();
    }
}

//Array Representation in Memory:

//Contiguous Memory Allocation:

//Arrays in Java are stored in contiguous memory locations. This allows for O(1) time complexity for accessing any element using its index.
//Index-Based Access:

//Elements in an array can be accessed directly using their index, which provides very fast retrieval compared to other data structures like linked lists.
//Fixed Size:

//The size of an array is fixed at the time of its creation. This means the amount of memory required is determined beforehand and cannot be changed dynamically.
//Advantages of Arrays:

//Fast Access:

//Direct indexing allows O(1) access time to elements.
//Predictable Memory Usage:

//Memory allocation is straightforward since the size is fixed.
//Simplicity:

//Arrays are simple to understand and implement, making them a good choice for static data storage.
//Time Complexity Analysis:

//Add Operation:

//Best Case: O(1) (when there is space available in the array)
//Worst Case: O(1) (always O(1) since adding is independent of the array size if space is available)
//Search Operation:

//Best Case: O(1) (if the employee is at the first position)
//Worst Case: O(n) (if the employee is at the last position or not present)
//Traverse Operation:

//Best Case: O(n) (must visit all elements)
//Worst Case: O(n) (must visit all elements)
//Delete Operation:

//Best Case: O(1) (if the employee is at the first position)
//Worst Case: O(n) (if the employee is at the last position or not present)
//Limitations of Arrays:

//Fixed Size:

//Arrays cannot dynamically resize, leading to potential wasted space or overflow if the array is too large or too small.
//Insertion and Deletion Overhead:

//Adding or removing elements, especially in the middle, can be expensive as it may require shifting elements.
//Memory Contiguity Requirement:

//Requires a contiguous block of memory, which can be challenging for very large arrays.
//When to Use Arrays:

//Fast Index-Based Access:

//When you need quick access to elements using their index.
//Predictable Size:

//When the number of elements is known beforehand and does not change.
//Simple Data Structures:

//When the simplicity of implementation is preferred over flexibility.