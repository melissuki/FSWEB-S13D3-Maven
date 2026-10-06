package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
    }

    public class Person {
        String firstName;
        String lastName;
        int age;

        String email;
        String gender;
        boolean isEmployed;

        public Person(String firstName, String lastName, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }

        public Person(String firstName, String lastName, int age, String email, String gender, boolean isEmployed) {
            //constructor chaining
            this(firstName, lastName, age);
            this.email = email;
            this.gender = gender;
            this.isEmployed = isEmployed;
        }

        public String getFirstName() {
            return firstName;
        }
        public String getLastName() {
            return lastName;
        }

        public int getAge() {
            return age;
        }
        public boolean isTeen {
            return age >= 13 && age <= 19;
        }
    }
    Person person = new Person("John", "Doe", 20);

    System.out.println("Firstname: " + person.getFirstName());

    System.out.println("LastName: " + person.getLastName());

    System.out.println("Age: " + person.getAge());

    public class Wall {
        double width;
        double height;

        public Wall(double width, double height) {
            setWidth(width);
            setHeight(height);
        }

        public double getWidth() {
            return width;
        }
        public double getHeight() {
            return height;
        }

        public void setWidth(double width) {
            if (width < 0) {
                this.width = 0;
            } else {
                this.width = width;
            }
        }

        public void setHeight(double height) {
            if(height < 0) {
                this.height = 0;
            } else {
                this.height = height;
        }
    }

    public double getArea() {
        return this.width * this.height;
        }
    }



}
