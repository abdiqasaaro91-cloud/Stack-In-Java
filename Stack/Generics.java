package Stack;

class Box<T> {
    private T item;
    public void set(T item) {
        this.item = item;
    }
    public T get() {
        return item;
    }
}

public class Generics  {
    static void main() {
        Box<Integer> Age = new Box<Integer>();
        Age.set(25);
        int age = Age.get();
        Box<String> Name = new Box<String>();
        Name.set("Abdulaahi");
        String name = Name.get();
        System.out.println("Age holds " + age);
        System.out.println("Name holds " + name);
    }
}
