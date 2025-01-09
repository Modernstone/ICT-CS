import java.util.Scanner;

public class favbook {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Fav Book :- ");
        String FavBook = sc.nextLine();

        System.out.print("Enter Book's Author Name :- ");
        String Author = sc.nextLine();

        System.out.print("Enter Book's Publish Year :- ");
        String Year = sc.nextLine();

        System.out.println("Your Favourite Book is " + FavBook + " by " + Author + " published in " + Year);
    }
}
