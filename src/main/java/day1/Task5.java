package day1;

public class Task5 {
    public static void main(String[] args) {
        for(int year = 1980; year <= 2020; year++){
            System.out.println("Олимпиада " + year + " года");
            year += 3;
        }
    }
}
