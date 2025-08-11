package org.example;

import java.util.Arrays;
import java.util.OptionalInt;

public class Main {
    public static void modifyValue(int value) {
        value = 100;
        System.out.println("Inside method: " + value);
    }

    public static void printMessages(String... messages) {
        System.out.println("Number of messages: " + messages.length);
        for (String msg : messages) {
            System.out.print(msg + " ");
        }
        System.out.println("\n");
    }

    public static void findLargest(int... numbers) {
        OptionalInt largest = Arrays.stream(numbers).max();
        if(largest == OptionalInt.empty()){
            largest = OptionalInt.of(Integer.MIN_VALUE);
        }


        System.out.println("Largest " + ((numbers.length == 0)? "with no numbers": "in " + Arrays.toString(numbers) + " is: ") + largest.getAsInt());
    }

    public static void main(String[] args) {

//        //1. Designing Methods
//        Car myCar = new Car();
//        myCar.startEngine();
//        String status = myCar.drive(60);
//        System.out.println(status);
//        myCar.turnOffEngine();

        //2. Passing Parameters: Primitives vs. Objects
//        int originalValue = 50;
//        System.out.println("Before method call: " + originalValue);
//        modifyValue(originalValue);
//        System.out.println("After method call: " + originalValue);
//        Student alex = new Student("Alex");
//        System.out.println("Name before change: " + alex.getName());
//        alex.changeStudentName(alex,"Jordan");
//        System.out.println("Name after change: " + alex.getName());

        //3. Using Varargs
//        printMessages("Hello", "World");
//        printMessages("Testing", "Varargs", "Here");
//        printMessages();
//        findLargest(10, 5, 25, 15);
//        findLargest(-5, -1, -10);
//        findLargest();
    }
}

class Car{
    public void startEngine() {
        System.out.println("Engine has started.");
    }

    public String drive(int speed) {
        return "The car is moving at " + speed + " mph.";
    }

    public void turnOffEngine(){
        System.out.println("Engine has been turned off.");
    }
}

class Student{
    private String name;

    public Student(String name){
        this.name = name;
    }

    void changeStudentName(Student student, String newName){
        student.name = newName;
    }

    public String getName(){
        return this.name;
    }
}