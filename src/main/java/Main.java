import java.util.Scanner;



/**
 * Created by oliva on 13.03.2017.
 */
public class Main {
    public static void main(String[] args) {

        String fileName = "Create_file";
        String content = " insert string test2";

        System.out.println("Please enter name file");
        Scanner inp = new Scanner(System.in);
        fileName = inp.nextLine();
        System.out.println("Please enter string content");
        content = inp.nextLine();

        HillelFileWriter bb=new HillelFileWriter();
        bb.writeToFile(fileName,content);
    }
}




