package Lab;
import java.util.*;
interface Student {
    void displayAll();
    void delete(String name);
    void nextName(String name);
    void previousName(String name);
    void add(String name);
    void displayAfterAddition();
}
class StudentFactory {
    public static Student getStudent(){
        return new StudentImpl();
    }
}
class StudentImpl implements Student {
    private List<String> studentList = new ArrayList<>();
    public StudentImpl() {
        studentList.add("Ajay");
        studentList.add("Bala");
        studentList.add("Cathey");
        studentList.add("Chella");
        studentList.add("Dolly");
        studentList.add("Ellan");
    }
    public void displayAll() {
        System.out.println("All students:");
        for (String student : studentList) {
            System.out.println(student);
        }
    }
    public void delete(String name) {
        studentList.remove(name);
        System.out.println(name + " is deleted from the register");
    }
    public void nextName(String name) {
        int index = studentList.indexOf(name);
        if(index == studentList.size()-1){
            System.out.println("No next name available");
        }else{
            System.out.println("Next name is " + studentList.get(index+1));
        }
    }
    public void previousName(String name) {
        int index = studentList.indexOf(name);
        if(index == 0){
            System.out.println("No previous name available");
        }else{
            System.out.println("Previous name is " + studentList.get(index-1));
        }
    }

    
    public void add(String name) {
        studentList.add(name);
        System.out.println(name + " is added to the register");
    }  
    public void displayAfterAddition() {
        System.out.println("All students after addition:");
        for (String student : studentList) {
            System.out.println(student);
        }
    }
}
public class Register {
    public static void main(String[] args) {
        Student Student = StudentFactory.getStudent();
        Student.displayAll();
        Student.delete("Chella");
        Student.nextName("Ajay");
        Student.previousName("Ellan");
        Student.add("Zara");
        Student.displayAfterAddition();
    }
}