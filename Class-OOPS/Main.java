// 1."CLASS WITH MULTIPLE OBJECTS"

// class animal {
//     String name;
//     int age;
//     String breed;

// }

// class Main {
//     public static void main(String[] args) {
//         animal a1 = new animal();

//         a1.name = "tiger";
//         a1.age = 5;
//         a1.breed = "cat";
//         System.out.println("Name of the animal :" + a1.name);
//         System.out.println("Name of the breed :" + a1.breed);
//         System.out.println("Animal age :" + a1.age);

//         animal a2 = new animal();
//         a2.name = "Lion";
//         a2.age = 4;
//         a2.breed = "cat";

//         System.out.println("Name of the animal :" + a2.name);
//         System.out.println("Name of the breed :" + a2.breed);
//         System.out.println("Animal age :" + a2.age);

//     }
// }
// CLASS WITH VARIABLE AND METHOD 

// class Student {
//     String name;
//     int age;
//     String course;

//     void display() {
//         System.out.println("Student Name : " + name);
//         System.out.println("Student Age : " + age);
//         System.out.println("Student Course : " + course);
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Student s1 = new Student();
//         s1.name = "Kirubhakaran R";
//         s1.age = 25;
//         s1.course = "Java Fullstack Development";
//         s1.display();
//         System.out.println(" --------------------");
//         Student s2 = new Student();
//         s2.name = "Arun";
//         s2.age = 31;
//         s2.course = "Python Fullstack Development";
//         s2.display();
//     }
// }

//USING METHOD WITH A PARAMEETER VALUE
// class Employee{
//     void display(String name, int age){
//         System.out.println("Employee Name : "+name);
//         System.out.println("Employee Age : "+ age);

//     }
// }
// class Main{
//     public static void main(String[] args) {
//         Employee e1=new Employee();
//         e1.display("Suresh", 30);
//         System.out.println("-----------");
//         Employee e2=new Employee();
//         e2.display("Ramesh", 28);

//     }
// }
// PRACTICING USING THE RETURN TYPE 
// class Calculator{
//     int  add (int a,int b){
//         return a+b;
//     }
// }
// class Main{
//     public static void main(String[] args) {
//         Calculator c1=new Calculator();
//         int Answer =c1.add(333, 444);
//         System.out.println("Addition of two values : "+Answer);
//     }
// }

// USING MULTIPLE METHODS 

// class Calculator {
//     int add(int a, int b) {
//         return a + b;
//     }

//     int sub(int a, int b) {
//         return a - b;
//     }

//     double divide(double a, double b) {
//         return a / b;
//     }

//     int mul(int a, int b) {
//         return a * b;
//     }
// }
// class Main{
//     public static void main(String[] args) {
//         Calculator c1=new Calculator();
//         System.out.println("Addition : "+ c1.add(5,6));
//         System.out.println("Subtraction : "+ c1.sub(5,6));
//         System.out.println("Division : "+ c1.divide(5,6));
//         System.out.println("Multiplication : "+ c1.mul(5,6));
//     }
// }

// class BankAccountManagement {
//     String AccountHolder;
//     double balance;
//     double withdraw;

//     void display(double amountDeposited) {
//         balance = balance + amountDeposited;
//         System.out.println("Deposited Amount: " + amountDeposited);
//     }

//     void displayBalance() {
//         System.out.println("After Deposited Account Balance : " + balance);
//     }

//     void displayWithdraw() {
//         System.out.println("After withdraw : " + (balance - withdraw));

//     }
// }

// class Main {
//     public static void main(String[] args) {
//         BankAccountManagement b1 = new BankAccountManagement();
//         b1.AccountHolder = "Kirubhakaran R";
//         b1.balance = 15000;
//         b1.withdraw = 10000;

//         System.out.println("Account Holder Name : " + b1.AccountHolder);

//         System.out.println("Account Balance : " + b1.balance);
//         b1.display(50000);

//         b1.displayBalance();
//         System.out.println("Withdraw Amount : " + b1.withdraw);
//         b1.displayWithdraw();

//     }
// }