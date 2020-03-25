package loose.oose.fis.lab.student.manager.model;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private double meanGrade;

public void Student(String firstName, String lastName, int age, double meanGrade) {
        //assignments
    this.firstName=firstName;
    this.lastName=lastName;
    this.age=age;
    this.meanGrade=meanGrade;
}

@Override
public String toString() {
        //toString generated implementation
    public String toString() {
        return "First Name: '" + this.firstName + "', Last Name: '" + this.lastName + "', age: '" + this.age + "', mean Grade"+ this.meanGrade+ "'";
    }
}

@Override
public boolean equals(Object o) {
        //equals generated implementation
    return (o instanceof Student) && ((firstName.equals((Student)o)firstName)) && (lastName.equals((Student)o)firstName)) && (age==((Student)o)age) && (meanGrade==((Student)o)meanGrade);

}

    @Override
public int hashCode() {
        //hashCode generated implementation
}

    //generated getters and setters for all fields

}
