package p4;

public class Main {

    public static void main(String[] args) {
        Operation func = action(1);
        int a = func.execute(6, 10);
        System.out.println(a);

        int b = action(2).execute(8,5);
        System.out.println(b);
    }

    public static Operation action(int number){
        switch (number){
            case 1: return ((x, y) -> x+y);
            case 2: return ((x, y) -> x-y);
            case 3: return ((x, y) -> x*y);
            default: return ((x, y) -> 0);
        }
    }

}

interface Operation{
    int execute(int x, int y);
}

