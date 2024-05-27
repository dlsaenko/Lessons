import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Barsik");
        cats[1] = new Cat("Murzik");
        cats[2] = new Cat("Tom");

        Bowl bowl = new Bowl(15);

        for (Cat cat : cats) {
            cat.eat(bowl);
            cat.run(100);
            cat.swim(5);
            System.out.println(cat);
        }

        System.out.println("Количество созданных котов: " + Cat.getCount());
    }
}

class Animal {
    protected String name;
    protected int runLimit;
    protected int swimLimit;

    public Animal(String name, int runLimit, int swimLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
    }

    public void run(int distance) {
        if (distance <= runLimit) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не может пробежать так далеко.");
        }
    }

    public void swim(int distance) {
        if (swimLimit == 0) {
            System.out.println(name + " не умеет плавать.");
        } else if (distance <= swimLimit) {
            System.out.println(name + " проплыл " + distance + " м.");
        } else {
            System.out.println(name + " не может проплыть так далеко.");
        }
    }
}

class Cat extends Animal {
    private static int count;

    private boolean fullness;

    public Cat(String name) {
        super(name, 200, 0);
        count++;
        this.fullness = false;
    }

    public void eat(Bowl bowl) {
        if (bowl.decreaseFood()) {
            fullness = true;
            System.out.println(name + " поел.");
        } else {
            System.out.println("Миска пуста, " + name + " не смог поесть.");
        }
    }

    public boolean isFull() {
        return fullness;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", fullness=" + fullness +
                '}';
    }
}

class Bowl {
    private int food;

    public Bowl(int food) {
        this.food = food;
    }

    public boolean decreaseFood() {
        if (food >= 5) {
            food -= 5;
            return true;
        } else {
            return false;
        }
    }

    public void addFood(int amount) {
        food += amount;
    }
}