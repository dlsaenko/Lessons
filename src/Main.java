public class Main {

    public static class Employee {
        private String fullName;
        private String position;
        private String email;
        private String phoneNumber;
        private int salary;
        private int age;

        public Employee(String fullName, String position, String email, String phoneNumber, int salary, int age) {
            this.fullName = fullName;
            this.position = position;
            this.email = email;
            this.phoneNumber = phoneNumber;
            this.salary = salary;
            this.age = age;
        }

        public void printInfo() {
            System.out.println("ФИО: " + fullName);
            System.out.println("Должность: " + position);
            System.out.println("Email: " + email);
            System.out.println("Телефон: " + phoneNumber);
            System.out.println("Зарплата: " + salary);
            System.out.println("Возраст: " + age);
            System.out.println();
        }
    }

    public static class Park {

        public class Attraction {
            private String name;
            private String workingHours;
            private int cost;

            public Attraction(String name, String workingHours, int cost) {
                this.name = name;
                this.workingHours = workingHours;
                this.cost = cost;
            }

            public String getName() {
                return name;
            }

            public String getWorkingHours() {
                return workingHours;
            }

            public int getCost() {
                return cost;
            }
        }
    }

    public static void main(String[] args) {

        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Иванов Иван", "Инженер", "ivivan@mailbox.com", "892312312", 30000, 30);
        employees[1] = new Employee("Петров Петр", "Менеджер", "petrov@mailbox.com", "891512512", 40000, 35);
        employees[2] = new Employee("Сидоров Сидор", "Программист", "sidorov@mailbox.com", "893712712", 50000, 25);
        employees[3] = new Employee("Козлов Константин", "Администратор", "kozlov@mailbox.com", "895312812", 35000, 28);
        employees[4] = new Employee("Михайлов Михаил", "Дизайнер", "mikhailov@mailbox.com", "894112412", 45000, 32);

        for (Employee employee : employees) {
            employee.printInfo();
        }

        Park park = new Park();
        Park.Attraction attraction1 = park.new Attraction("Колесо обозрения", "10:00 - 22:00", 500);
        Park.Attraction attraction2 = park.new Attraction("Американские горки", "12:00 - 20:00", 700);
        Park.Attraction attraction3 = park.new Attraction("Детские карусели", "11:00 - 18:00", 300);

        System.out.println("Информация об аттракционах в парке:");
        System.out.println("Аттракция: " + attraction1.getName() + ", Время работы: " + attraction1.getWorkingHours() + ", Стоимость: " + attraction1.getCost());
        System.out.println("Аттракция: " + attraction2.getName() + ", Время работы: " + attraction2.getWorkingHours() + ", Стоимость: " + attraction2.getCost());
        System.out.println("Аттракция: " + attraction3.getName() + ", Время работы: " + attraction3.getWorkingHours() + ", Стоимость: " + attraction3.getCost());
    }
}
