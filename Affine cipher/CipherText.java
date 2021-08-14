import java.io.*;

public class CipherText {
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\computer\\Desktop./Cleared-Text.txt");
        File cipher = new File("C:\\Users\\computer\\Desktop./Ciphered-Text.txt");

        boolean create = cipher.createNewFile();
        TextCipher(f, cipher);

    }

    private static void TextCipher(File f, File cipher) throws IOException {
        BufferedReader reader = null;
        BufferedWriter writer = null;
        int a = 5, b = 7;
        String text = null;


            reader = new BufferedReader(new FileReader(f));
            writer = new BufferedWriter(new FileWriter(cipher));

            text = reader.readLine();
            for(int i = 0; i < text.length(); i++) {
                int x = 0, y = 0;

                if(text.charAt(i) == 'а' || text.charAt(i) == 'А') x = 0;
                if(text.charAt(i) == 'б' || text.charAt(i) == 'Б') x = 1;
                if(text.charAt(i) == 'в' || text.charAt(i) == 'В') x = 2;
                if(text.charAt(i) == 'г' || text.charAt(i) == 'Г') x = 3;
                if(text.charAt(i) == 'д' || text.charAt(i) == 'Д') x = 4;
                if(text.charAt(i) == 'ѓ' || text.charAt(i) == 'Ѓ') x = 5;
                if(text.charAt(i) == 'е' || text.charAt(i) == 'Е') x = 6;
                if(text.charAt(i) == 'ж' || text.charAt(i) == 'Ж') x = 7;
                if(text.charAt(i) == 'з' || text.charAt(i) == 'З') x = 8;
                if(text.charAt(i) == 'ѕ' || text.charAt(i) == 'Ѕ') x = 9;
                if(text.charAt(i) == 'и' || text.charAt(i) == 'И') x = 10;
                if(text.charAt(i) == 'ј' || text.charAt(i) == 'Ј') x = 11;
                if(text.charAt(i) == 'к' || text.charAt(i) == 'К') x = 12;
                if(text.charAt(i) == 'л' || text.charAt(i) == 'Л') x = 13;
                if(text.charAt(i) == 'љ' || text.charAt(i) == 'Љ') x = 14;
                if(text.charAt(i) == 'м' || text.charAt(i) == 'М') x = 15;
                if(text.charAt(i) == 'н' || text.charAt(i) == 'Н') x = 16;
                if(text.charAt(i) == 'њ' || text.charAt(i) == 'Њ') x = 17;
                if(text.charAt(i) == 'о' || text.charAt(i) == 'О') x = 18;
                if(text.charAt(i) == 'п' || text.charAt(i) == 'П') x = 19;
                if(text.charAt(i) == 'р' || text.charAt(i) == 'Р') x = 20;
                if(text.charAt(i) == 'с' || text.charAt(i) == 'С') x = 21;
                if(text.charAt(i) == 'т' || text.charAt(i) == 'Т') x = 22;
                if(text.charAt(i) == 'ќ' || text.charAt(i) == 'Ќ') x = 23;
                if(text.charAt(i) == 'у' || text.charAt(i) == 'У') x = 24;
                if(text.charAt(i) == 'ф' || text.charAt(i) == 'Ф') x = 25;
                if(text.charAt(i) == 'х' || text.charAt(i) == 'Х') x = 26;
                if(text.charAt(i) == 'ц' || text.charAt(i) == 'Ц') x = 27;
                if(text.charAt(i) == 'ч' || text.charAt(i) == 'Ч') x = 28;
                if(text.charAt(i) == 'џ' || text.charAt(i) == 'Џ') x = 29;
                if(text.charAt(i) == 'ш' || text.charAt(i) == 'Ш') x = 30;

                y = ((x * a) + b) % 31;

                if(y == 0) writer.append('А');
                if(y == 1) writer.append('Б');
                if(y == 2) writer.append('В');
                if(y == 3) writer.append('Г');
                if(y == 4) writer.append('Д');
                if(y == 5) writer.append('Ѓ');
                if(y == 6) writer.append('Е');
                if(y == 7) writer.append('Ж');
                if(y == 8) writer.append('З');
                if(y == 9) writer.append('Ѕ');
                if(y == 10) writer.append('И');
                if(y == 11) writer.append('Ј');
                if(y == 12) writer.append('К');
                if(y == 13) writer.append('Л');
                if(y == 14) writer.append('Љ');
                if(y == 15) writer.append('М');
                if(y == 16) writer.append('Н');
                if(y == 17) writer.append('Њ');
                if(y == 18) writer.append('О');
                if(y == 19) writer.append('П');
                if(y == 20) writer.append('Р');
                if(y == 21) writer.append('С');
                if(y == 22) writer.append('Т');
                if(y == 23) writer.append('Ќ');
                if(y == 24) writer.append('У');
                if(y == 25) writer.append('Ф');
                if(y == 26) writer.append('Х');
                if(y == 27) writer.append('Ц');
                if(y == 28) writer.append('Ч');
                if(y == 29) writer.append('Џ');
                if(y == 30) writer.append('Ш');
            }
            System.out.println("Текстот е успешно шифриран.");
            reader.close();
            writer.flush();
            writer.close();

    }

}
