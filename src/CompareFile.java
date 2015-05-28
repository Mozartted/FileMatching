/**
 * Created by Moz on 5/25/2015.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class CompareFile {
    //this class compares files in the oldmast and newmast to find a record that matches
    //any that does not is put into a log file
    Scanner inOldMast;
    Scanner inNewMast;

    public void OpenFilesToCompare(){
        try{
        inOldMast=new Scanner(new File("oldmast.txt"));
            inNewMast=new Scanner(new File("newmast"));


        }catch(FileNotFoundException e){
            System.out.println("Sorry, the files  not be found");
        }

    }

    public void Compare(){
        //reading input from files
        AccountRecord RecordOldmast=new AccountRecord();
        RecordOldmast.setAccount(inOldMast.nextInt());
        RecordOldmast.setFirstName(inOldMast.next());
        RecordOldmast.setLastName(inOldMast.next());
        RecordOldmast.setBalance(inOldMast.nextDouble());

        //comparing and updating balance
         boolean IndicatorOldMast=true;
        boolean IndicatorNewMast=true;

        while(IndicatorOldMast){
            boolean primeIndicator=false;
            //checking the next file
            while( IndicatorNewMast){
                AccountRecord RecordNewMast=new AccountRecord();
                RecordNewMast.setAccount(inNewMast.nextInt());
                RecordOldmast.setFirstName(inNewMast.next());
                RecordNewMast.setBalance(inNewMast.nextDouble());

                //the comparisim
                if(RecordOldmast.getAccount()==RecordNewMast.getAccount()) {
                    RecordOldmast.combine(RecordNewMast);
                    IndicatorNewMast = false;
                    primeIndicator=true;
                }else{
                    IndicatorNewMast=inNewMast.hasNext();
                    try{
                        Formatter LogFileOutput=new Formatter(new File("LogFile.txt"));
                        LogFileOutput.format("%d", RecordNewMast.getAccount());
                    }catch(Exception e){
                        System.out.println("Sorry,, the file the file LogFile.txt can't be created");
                    }
                }

            }

            //if a match is found
            if(primeIndicator==true){
                IndicatorOldMast=inOldMast.hasNext();

            }
        }
    }
}




