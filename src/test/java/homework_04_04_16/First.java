package homework_04_04_16;


import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by Яна Костюк on 04.04.2016.
 */

/* Множество всех животных
1. Внутри класса Solution создать public static классы Cat, Dog.
2. Реализовать метод createCats, котороый должен возвращать множество с 4 котами.
3. Реализовать метод createDogs, котороый должен возвращать множество с 3 собаками.

4. Реализовать метод join, котороый должен возвращать объединенное множество всех животных - всех котов и собак.
5. Реализовать метод removeCats, котороый должен удалять из множества pets всех котов, которые есть в множестве cats.
6. Реализовать метод printPets, котороый должен выводить на экран всех животных, которые в нем есть.
Каждое животное с новой строки
*/

public class First {

    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
//        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        Set<Cat> cats = new LinkedHashSet<Cat>();
        cats.add(new Cat("Cat1"));
        cats.add(new Cat("Cat2"));
        cats.add(new Cat("Cat3"));
        cats.add(new Cat("Cat4"));

        return cats;
    }

    public static Set<Dog> createDogs() {
        Set<Dog> dogs = new LinkedHashSet<Dog>();
        dogs.add(new Dog("Dog1"));
        dogs.add(new Dog("Dog2"));
        dogs.add(new Dog("Dog3"));
        dogs.add(new Dog("Dog4"));

        return dogs;
    }


    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        Set<Object> pets = new LinkedHashSet<Object>();
        pets.addAll(cats);
        pets.addAll(dogs);

        return pets;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        pets.removeAll(cats);
    }

    public static void printPets(Set<Object> pets) {

        for(Object cat:pets){
            System.out.println(cat);
        }

        for(Object dog:pets){
            System.out.println(dog);
        }

    }

    public static class Cat {
        public String name;

        @Override
        public String toString() {
            return getClass().getName()+"_"+name;
        }

        public Cat(String name) {
            this.name = name;
        }
    }

    public static class Dog {
        public String name;

        @Override
        public String toString() {
            return getClass().getName()+"_"+name;
        }

        public Dog(String name) {

            this.name = name;
        }
    }
}