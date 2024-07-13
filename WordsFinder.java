
import java.util.Arrays;
import java.util.Scanner;

public class WordsFinder{
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a text: ");
        String text = scanner.nextLine();
        text = text.toLowerCase();
        String[] words = text.split(" ");
        String[] modifyWords = new String[words.length];
        Integer initial=null, end=null;

        System.out.println("Enter a word to search: ");
        String wordToSearch = scanner.nextLine();

        for (int i=0; i<words.length; i++){
            modifyWords[i] = words[i].replace(",", "");
        }
        for (int i=0; i<words.length; i++){
            modifyWords[i] = modifyWords[i].replace(".", "");
        }
    
        for (int i=0, j = modifyWords.length-1; i<modifyWords.length; i++, j--){
            if (modifyWords[i].equals(wordToSearch) && initial == null) {
                initial = i;
            } else if (modifyWords[j].equals(wordToSearch) && end == null){
                end = j;
            } else if(initial!= null && end != null){
                break;
            }


        }

        System.out.println("El rango de la palabra buscada es [" + initial + ", " + end+"]");
        System.out.println(Arrays.toString(modifyWords));


        scanner.close();


    }
} 