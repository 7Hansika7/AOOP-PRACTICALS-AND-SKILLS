class Student
{
    int studentID;
    String name;
    int age;

    void display()
    {
        System.out.println("Student ID: " + studentID);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println();
    }

    public static void main(String[] args)
    {
        Student s1 = new Student();
        s1.studentID = 101;
        s1.name = "Alice";
        s1.age = 19;

        Student s2 = new Student();
        s2.studentID = 102;
        s2.name = "Bob";
        s2.age = 20;

        Student s3 = new Student();
        s3.studentID = 103;
        s3.name = "Charlie";
        s3.age = 21;

        s1.display();
        s2.display();
        s3.display();
    }
}