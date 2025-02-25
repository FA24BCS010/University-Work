import java.util.Scanner;
public class Password{
    public class Initials{

        static String userName="Ahmer Ijaz";
        static String password="29March";
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);


        String inputName;
        String inputPassword;

        System.out.print("Enter Username:");
        inputName=input.nextLine();



        System.out.print("Enter Password:");
        inputPassword=input.nextLine();

        if (inputName.equals(Initials.userName)){
            System.out.print("\nUsername is a match");
        }
        else{
            System.out.print("\nIncorrect Username");
        }
        if (inputPassword.equals(Initials.password)) {
            System.out.print("\nPassword is a match");
        }
        else{
            System.out.print("\nIncorrect password");
        }
    }
}