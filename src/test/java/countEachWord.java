
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class countEachWord {

    public static void main(String[] args) throws FileNotFoundException {
        //Create input stream & scanner
        FileInputStream fin = new FileInputStream("C:\\GitHub\\readFile\\Sample.txt");
        Scanner fileInput = new Scanner(fin);

        //create the arrayList
        ArrayList<String> word = new ArrayList<String>();
        ArrayList<Integer> count = new ArrayList<Integer>();

        ///read through the file and count words
        while (fileInput.hasNext()){
            //get the next word
            String nextWord = fileInput.next();
            //Determine if the word is in the arrayList already
            if(word.contains(nextWord)){
                int index = word.indexOf(nextWord);
                count.set(index, count.get(index)+1);
            }
            else {
                word.add(nextWord);
                count.add(1);
            }
        }
//close
        fileInput.close();
        //fin.close();
        //Print put the results
        for(int i =0;i<word.size(); i++){
            System.out.println(word.get(i) + " " + "occurred" + " " + count.get(i) + " " + "times");
        }
    }
}
