package p5;

import java.util.Scanner;
import java.util.function.*;

public class Main {

    public static void main(String[] args) {

        Predicate<Integer> isPos = x -> x >0;
        System.out.println(isPos.test(50));
        System.out.println(isPos.test(-10));

        BinaryOperator<Integer> binaryOperator = (x,y) ->x*y;
        System.out.println(binaryOperator.apply(3, 5));

        UnaryOperator<Integer> unaryOperator = x->x*x;
        System.out.println(unaryOperator.apply(5));

        Function<Integer, String> convert = x -> String.valueOf(x) + "$$$";
        System.out.println(convert.apply(10));

        Consumer<Integer> printer = x-> System.out.printf("%d $$$ \n", x);
        printer.accept(100);

        Supplier<User> userFactory = () -> {
            Scanner in = new Scanner(System.in);
            System.out.println("Name:");
            String name = in.nextLine();
            return new User(name);
        };

        User user1 = userFactory.get();
        User user2 = userFactory.get();
        System.out.println(user1.getName());
        System.out.println(user2.getName());



    }

}

class User{
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
