class Employee
{
    int employeeID;
    String name;
    double salary;

    Employee(int id, String n, double s)
    {
        employeeID = id;
        name = n;
        salary = s;
    }

    void display()
    {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args)
    {
        Employee e1 = new Employee(101, "Alice", 45000);
        e1.display();
    }
}