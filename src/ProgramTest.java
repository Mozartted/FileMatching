/**
 * Created by Moz on 5/19/2015.
 */
import java.io.File;
import java.io.FileNotFoundException;
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
            String yesOrno;

            yesOrno=input.next();
            if(yesOrno=="no"||yesOrno=="No"||yesOrno=="NO"){
                option=2;
            }

        }

        //comparing the files
        CompareFile comparision=new CompareFile();
        comparision.OpenFilesToCompare();
        comparision.Compare();

        //outputting the files
        try{
            Scanner outOldmast=new Scanner(new File("oldmast.txt"));
            Scanner outNewMast=new Scanner(new File("newmast.txt"));
            Scanner outLog=new Scanner(new File("LogFile.txt"));

        }catch(FileNotFoundException e){
            System.out.println("Sorry on ore more files could not be accessed");
        }



    }

}
