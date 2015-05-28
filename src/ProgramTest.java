/**
 * Created by Moz on 5/19/2015.
 */
import java.util.Scanner;

//main testing file
public class ProgramTest {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        CreateTextFile Application=new CreateTextFile();
        // the int option variable is used to note when what a user selects

        int option=1;
        while(option==1){
            System.out.println("Create a file choose a type");
            Application.OpenOperation();
            System.out.println("Do you want to create another file.\n1. yes \n2.no");
            char yesOrno;

            yesOrno=input.next();
            if(yesOrno=='y'||)


        }


    }

}
