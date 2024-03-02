package app.view;

import java.util.Scanner;

public class AppView {

    private final Scanner SCANNER = new Scanner(System.in);

    public String selectAction(){
        System.out.println("""
                ------------------------------------------
                Select an action:
                1 - Show all users
                2 - Show user by index
                ------------------------------------------
                """);
        return SCANNER.nextLine();
    }

    public String getIndex(int lastUserIndex){
        System.out.printf("""
                ------------------------------------------
                Введите индекс пользователя (от 0 до %d) :
                ------------------------------------------
                """, lastUserIndex);
        return SCANNER.nextLine();
    }

    public void getOutput(String output){
        System.out.println("------------------------------------------");
        System.out.println(output);
        System.out.println("------------------------------------------");
    }

}
