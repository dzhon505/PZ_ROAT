public class Extends {
    static class Animal {
        public void move() {
            System.out.println("животное передвигается");
        }
    }

    static class Cat extends Animal {
        @Override
        public void move() {
            System.out.println("кошка бегает");
        }
    }

    static class Bird extends Animal {
        @Override
        public void move() {
            System.out.println("птица летает");
        }
    }

    static class Fish extends Animal {
        @Override
        public void move() {
            System.out.println("рыба плавает");
        }
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        Cat cat = new Cat();
        Bird bird = new Bird();
        Fish fish = new Fish();

        animal.move();
        cat.move();
        bird.move();
        fish.move();
    }
}
