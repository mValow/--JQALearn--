package Homework5;

public class Main {
    public static void main(String[] args) {
        Person[] people = new Person[10];
        //Person Objects
        people[0] = new Person("Ivan", 27, true);
        people[1] = new Person("Gergana", 25, false);
        people[2] = new Person("Georgi", 24, true);
        //Student Objects
        people[3] = new Student("Dimitar", 19, true, 5.5);
        people[4] = new Student("Johny", 21, true, 5.0);
        people[5] = new Student("Alex", 22, false, 6.0);
        people[6] = new Student("Diona", 20, false, 4.0);
        //Employee Objects
        people[7] = new Employee("Kevin", 30, true, 100);
        people[8] = new Employee("Larry", 17, true, 40);
        people[9] = new Employee("Joshua", 18, true, 50);

        for (Person person : people) {
            if (person instanceof Student) {
                ((Student) person).showStudentInfo();
            } else if (person instanceof Employee) {
                ((Employee) person).showEmployeeInfo();
            } else {
                person.showPersonInfo();
            }

        }
        for (Person person : people) {
            if (person instanceof Employee) {
                Employee employee = (Employee) person;
                double overtimeSum = employee.calculateOvertime(2);
                System.out.printf("%s overtime sum for 2 hours: %.2f lv.\n", employee.name, overtimeSum);
            }
        }
    }

}

