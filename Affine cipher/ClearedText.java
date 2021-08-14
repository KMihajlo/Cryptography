import java.io.*;

public class ClearedText {
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\computer\\Desktop./Uncleared-Text.txt");
        //System.out.println(f.exists());
        File file = new File("C:\\Users\\computer\\Desktop./Cleared-Text.txt");
        boolean create = file.createNewFile();
        ClearText(f, file);
    }

    private static void ClearText(File f, File file) throws IOException {
        String text = null;
        BufferedReader reader = null;
        BufferedWriter writer = null;

        reader = new BufferedReader(new FileReader(f));

        text = reader.readLine();

        System.out.println(text);
        text = text.replaceAll("\\s+", "");
        text = text.replaceAll("[^а-шА-Шa-zA-Z0-9јќљњ]", "");

        //-+.,^:;!?()
        System.out.println(text);

        writer = new BufferedWriter(new FileWriter(file));
        writer.write(text);

        reader.close();
        writer.flush();
        writer.close();
    }
}
