/**
 * Created by Moz on 5/20/2015.
 */

//importing nessecary files
import java.io.File;
import java.util.FormatterClosedException;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Formatter;

// a class to use and create files to use
public class CreateTextFile {
    Scanner input=new Scanner(System.in) ;
    private Formatter output;
        public void OpenOperation(){
        //Asking user to enter variables to create TransFile
            int TransOrMaster;
            System.out.println("Create transaction File and OldMaster file  \n" +
                    " Transaction file=1 \n OldMasterFile=2");

            TransOrMaster=input.nextInt();
            switch (TransOrMaster){
                case 1:
                    //input the various data for the file.
                    //create the file
                    try{
                    output=new Formatter("trans.txt");
                    }
                    catch(FileNotFoundException exception){
                        System.out.println("Sorry, can't open or create the desired file(trans.txt)");
                    }
                    catch(SecurityException exception){
                        System.out.println("Sorry, you don't have write access to this file");
                    }

                    System.out.println("Input the various data starting with the account No,the Name and the balance");
                    while(input.hasNext()){
                        TransactionRecord newRecord=new TransactionRecord();

                        try{
                            newRecord.SetAccountNo(input.nextInt());
                            newRecord.SetName(input.next());
                            newRecord.SetTransactionAmount(input.nextDouble());

                            output.format("%d %s %d,",newRecord.getAccountNo(),newRecord.getName(),newRecord.getTransactionAmount());
                        }catch(Exception exception){
                            System.out.println("Can't output to File");
                        }


                    }
                    break;
                case 2:
                    try{
                        output=new Formatter("oldmast.txt");
                    }
                    catch(FileNotFoundException exception){
                        System.out.println("Sorry, can't open or create the desired file(trans.txt)");
                    }
                    catch(SecurityException exception){
                        System.out.println("Sorry, you don't have write access to this file");
                    }

                    System.out.println("Input the various data starting with the account No,the Name and the balance");
                    while(input.hasNext()){
                        AccountRecord newRecord=new AccountRecord();

                        try{
                            newRecord.setAccount(input.nextInt());
                            newRecord.setFirstName(input.next());
                            newRecord.setLastName(input.next());
                            newRecord.setBalance(input.nextDouble());

                            output.format("%d %s %s %d,",newRecord.getAccount(),newRecord.getFirstName(),newRecord.getLastName(),newRecord.getBalance());
                        }catch(Exception exception){
                            System.out.println("Can't output to File");
                        }
                    }
                    break;
                default:
                    break;
            }


    }

}
