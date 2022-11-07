import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Hello, join the magic game!" + "\n");
        System.out.println("Name your character:");
        String name=sc.nextLine();
        System.out.println("Set the character clas:");
        String clas=sc.nextLine();
        System.out.println("Set the powerpoints:");
        int powerpoints=sc.nextInt();
        System.out.println("Set the manapoints:");
        int manapoints=sc.nextInt();
        System.out.println("Is this a new character?:");
        boolean newCharacter=sc.nextBoolean();
        Hero Hero1=new Hero(name, clas, powerpoints, manapoints, newCharacter);
        System.out.println("Summary:" + "\n" + "Character name: " + Hero1.getName() +"\n"+ "Character clas: " + Hero1.getClas() +"\n"+ "Character powerpoints: " + Hero1.getPowerpoints() +"\n"+ "Character manapoints: " + Hero1.getManapoints() +"\n"+ "New character?: " + Hero1.getNewcharacter());
    }
}