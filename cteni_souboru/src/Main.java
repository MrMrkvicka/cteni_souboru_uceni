import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.IOException;  // Import the IOException class to handle errors
import java.io.FileWriter;   // Import the FileWriter class

public class Main {
    public static void main(String[] args) {


        EvidenceUzivatelu evidence = new EvidenceUzivatelu();
        try{
            evidence.nactiZeSouboru("resources/uzivatel.txt",";");
            evidence.getKopieSeznamu().forEach(System.out::println );

        }catch (EvidenceChybaSouboruException e){
            System.out.println(e.getMessage());
        }












    }
}