# 24 Class Relationships

# [클래스 간 관계](https://javapapers.com/oops/association-aggregation-composition-abstraction-generalization-realization-dependency/)

## 분석 단계

![Untitled](24%20Class%20Relationships%2002546075255442d2ba8ff2a9dfd25381/Untitled.png)

- Dependence(Use-A)
    
    ![Untitled](24%20Class%20Relationships%2002546075255442d2ba8ff2a9dfd25381/Untitled%201.png)
    
    Change in structure or behaviour of a class affects the other related class.
    
- Association(Has-A)
    
    ![Untitled](24%20Class%20Relationships%2002546075255442d2ba8ff2a9dfd25381/Untitled%202.png)
    
    a relationship between two objects
    
    ex) ****A Student and a Faculty
    
    - Aggregation(a special case of association)
        
        ![Untitled](24%20Class%20Relationships%2002546075255442d2ba8ff2a9dfd25381/Untitled%203.png)
        
        A directional association between objects
        
    - Composition(a restricted aggregation)
        
        ![Untitled](24%20Class%20Relationships%2002546075255442d2ba8ff2a9dfd25381/Untitled%204.png)
        
        The contained object cannot exist without the existence of container object.
        
- Inheritance(Is-A)
    
    ![Untitled](24%20Class%20Relationships%2002546075255442d2ba8ff2a9dfd25381/Untitled%205.png)
    
    (At a very broader level you can understand this as  [Generalization](https://www.geeksforgeeks.org/generalization-and-specialization-in-java/).)
    
    Common structure and behaviour are used from the specializtion to the generalized class.
    

> ++ [Realization](https://www.geeksforgeeks.org/interfaces-in-java/)
> 
> 
> ![Untitled](24%20Class%20Relationships%2002546075255442d2ba8ff2a9dfd25381/Untitled%206.png)
> 
> A relationship between the blueprint class and the object containing its respective implementation level details
> 
> You can understand this as the relationship between the interface and the [implementing class.](http://distinctjava.blogspot.com/2013/04/generalization-specialization.html)
> 
> Unlike Inheritance, a class can implement more than one interface.
> 
> ![Untitled](24%20Class%20Relationships%2002546075255442d2ba8ff2a9dfd25381/Untitled%207.png)
> 

## 설계 단계

![Untitled](24%20Class%20Relationships%2002546075255442d2ba8ff2a9dfd25381/Untitled%208.png)

### [포함, 의존](https://www.geeksforgeeks.org/association-composition-aggregation-java/)

클래스 내에서 해당 클래스 타입을 사용한다.

```java
// https://www.geeksforgeeks.org/association-composition-aggregation-java/

// Java Program to illustrate the
// Concept of Association

// Importing required classes
import java.io.*;
import java.util.*;
 
// Class 1
// Bank class
class Bank {
 
    // Attributes of bank
    private String name;
 
    **private Set<Employee> employees;**
    // Constructor of this class
    Bank(String name)
    {
        // this keyword refers to current instance itself
        this.name = name;
    }
 
    // Method of Bank class
    public String getBankName()
    {
        // Returning name of bank
        return this.name;
    }
 
    public void setEmployees(Set<Employee> employees)
    {
        this.employees = employees;
    }
    public Set<Employee> getEmployees(Set<Employee> employees)
    {
        return this.employees;
    }
}
 
// Class 2
// Employee class
class Employee {
    // Attributes of employee
    private String name;
    // Employee name
    Employee(String name)
    {
        // This keyword refers to current instance itself
        this.name = name;
    }
 
    // Method of Employee class
    public String getEmployeeName()
    {
        // returning the name of employee
        return this.name;
    }
}
 
// Class 3
// Association between both the
// classes in main method
class GFG {
 
    // Main driver method
    public static void main(String[] args)
    {
 
        // Creating objects of bank and Employee class
        **Bank bank = new Bank("ICICI");
        Employee emp = new Employee("Ridhi");**
 
        Set<Employee> employees = new HashSet<>();
        employees.add(emp);
 
        bank.setEmployees(employees);
 
        System.out.println(emp.getEmployeeName()
                           + " belongs to bank "
                           + bank.getBankName());
    }
}
```

### [상속](https://www.geeksforgeeks.org/inheritance-in-java/)

- 클래스 선언
    
    `extends`
    
- 생성자
    
    `super(parameter);`
    

```java
// https://www.geeksforgeeks.org/inheritance-in-java/

// Java program to illustrate the
// concept of inheritance
  
// base class
class Bicycle {
    // the Bicycle class has two fields
    public int gear;
    public int speed;
  
    // the Bicycle class has one constructor
    public Bicycle(int gear, int speed)
    {
        this.gear = gear;
        this.speed = speed;
    }
  
    // the Bicycle class has three methods
    public void applyBrake(int decrement)
    {
        speed -= decrement;
    }
  
    public void speedUp(int increment)
    {
        speed += increment;
    }
  
    // toString() method to print info of Bicycle
    public String toString()
    {
        return ("No of gears are " + gear + "\n"
                + "speed of bicycle is " + speed);
    }
}
  
// derived class
class MountainBike **extends** Bicycle {
  
    // the MountainBike subclass adds one more field
    public int seatHeight;
  
    // the MountainBike subclass has one constructor
    public MountainBike(int gear, int speed,
                        int startHeight)
    {
        **// invoking base-class(Bicycle) constructor
        super(gear, speed);**
        seatHeight = startHeight;
    }
  
    // the MountainBike subclass adds one more method
    public void setHeight(int newValue)
    {
        seatHeight = newValue;
    }
  
    // overriding toString() method
    // of Bicycle to print more info
    @Override public String toString()
    {
        return (super.toString() + "\nseat height is "
                + seatHeight);
    }
}
  
// driver class
public class Test {
    public static void main(String args[])
    {
  
        MountainBike mb = new MountainBike(3, 100, 25);
        System.out.println(mb.toString());
    }
}
```