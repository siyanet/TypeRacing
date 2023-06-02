import java.io.BufferedReader;
import java.io.FileReader;

public class Fileread {
    private static String words [] = new String[50];
    public static void main(String[] args){

/*
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Siyan\\IdeaProjects\\TypeRacer\\src\\Quotes.txt"));
            String line;

            try {
                int i = 0;
                while (((line = reader.readLine()) != null) && (i < 49)) {

                    words[i] = line;
                    i++;
                }
            } catch (Exception e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
            try {
                reader.close();
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }*/
        String wordone[] = getWords();
        for(int i = 0; i <50; i++) {
            System.out.println(wordone[i]);
        }
    }
    public static String[] getWords(){
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Siyan\\IdeaProjects\\TypeRacer\\src\\Quotes.txt"));
            String line;

            try {
                int i = 0;
                while (((line = reader.readLine()) != null) && (i < 50)) {

                    words[i] = line;
                    i++;
                }
            } catch (Exception e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
            try {
                reader.close();
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return words;
    }
}
