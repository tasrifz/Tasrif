/*
1)Make the instance variables private so that they cannot be accessed directly from outside the class. You can only set and get values of these variables through the methods of the class.
2)Have getter and setter methods in the class to set and get the values of the fields.

 */
package jan10;

/**
 *
 * @author TASRIF ZAMAN
 */
class Student{
    private int id;
    private String name;
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{ " + " Id = " + id + ", Name = " + name + ", Age = " + age + '}';
    }
    
}
public class Task3 {
    public static void main(String[] args) {
        Student s = new Student();
        s.setId(1292685);
        s.setName("Tasrif");
        s.setAge(28);
        System.out.println(s);
    }
}
