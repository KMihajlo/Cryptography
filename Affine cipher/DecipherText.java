import java.io.*;
import java.util.*;
import java.io.IOException;

public class DecipherText {
    public static void main(String[] args) throws IOException {
        File f1 = new File("C:\\Users\\computer\\Desktop./kriptiran-tekst.txt");
        File f2 = new File("C:\\Users\\computer\\Desktop./Deciphered-Text.txt");

        boolean create = f2.createNewFile();

        TextDecipher(f1, f2);

        BufferedReader read = null;
        String decrypt = null;
        read = new BufferedReader(new FileReader(f2));
        decrypt = read.readLine();

        System.out.println("Декриптиран текст: ");
        System.out.println(decrypt);

        read.close();
    }

    private static void TextDecipher(File f1, File f2) throws IOException {
        BufferedReader reader = null;
        BufferedWriter writer = null;
        String text = null;

        reader = new BufferedReader(new FileReader(f1));
        writer = new BufferedWriter(new FileWriter(f2));
        text = reader.readLine();

        /*int[] freq = new int[31];
        for(char ch:text.toCharArray()){
            if(Character.isLetter(ch)) freq[ch - 'A']++;
        }

        System.out.println(Arrays.toString(freq));*/

        char[] c = text.toCharArray();
        String alphabet = "абвгдѓежзѕијклљмнњопрстќуфхцчџш";
        int[] countArray = new int[31];
        for(char x : c){
            for(int i = 0; i < alphabet.length(); i++){
                if(alphabet.charAt(i) == x) countArray[i]++;
            }
        }

        HashMap<Integer, Character> map = new HashMap<Integer, Character>();
        for(int i = 0; i < alphabet.length(); i++){
            map.put(countArray[i], alphabet.charAt(i));
        }
        java.util.Arrays.sort(countArray);

        System.out.println(map);
        System.out.println("1. " + countArray[30] + "\n2. " + countArray[29] + "\n3. " + countArray[28] + "\n4. " + countArray[27]);

        for(int i = 0; i < text.length(); i++){
            if(text.charAt(i) == 'а') writer.append('ф');
            if(text.charAt(i) == 'б') writer.append('х');
            if(text.charAt(i) == 'в') writer.append('ц');
            if(text.charAt(i) == 'г') writer.append('ч');
            if(text.charAt(i) == 'д') writer.append('џ');
            if(text.charAt(i) == 'ѓ') writer.append('ш');
            if(text.charAt(i) == 'е') writer.append('а');
            if(text.charAt(i) == 'ж') writer.append('б');
            if(text.charAt(i) == 'з') writer.append('в');
            if(text.charAt(i) == 'ѕ') writer.append('г');
            if(text.charAt(i) == 'и') writer.append('д');
            if(text.charAt(i) == 'ј') writer.append('ѓ');
            if(text.charAt(i) == 'к') writer.append('е');
            if(text.charAt(i) == 'л') writer.append('ж');
            if(text.charAt(i) == 'љ') writer.append('з');
            if(text.charAt(i) == 'м') writer.append('ѕ');
            if(text.charAt(i) == 'н') writer.append('и');
            if(text.charAt(i) == 'њ') writer.append('ј');
            if(text.charAt(i) == 'о') writer.append('к');
            if(text.charAt(i) == 'п') writer.append('л');
            if(text.charAt(i) == 'р') writer.append('љ');
            if(text.charAt(i) == 'с') writer.append('м');
            if(text.charAt(i) == 'т') writer.append('н');
            if(text.charAt(i) == 'ќ') writer.append('њ');
            if(text.charAt(i) == 'у') writer.append('о');
            if(text.charAt(i) == 'ф') writer.append('п');
            if(text.charAt(i) == 'х') writer.append('р');
            if(text.charAt(i) == 'ц') writer.append('с');
            if(text.charAt(i) == 'ч') writer.append('т');
            if(text.charAt(i) == 'џ') writer.append('ќ');
            if(text.charAt(i) == 'ш') writer.append('у');
        }
        
        System.out.println("Криптиран текст: ");
        System.out.println(text);

        reader.close();
        writer.flush();
        writer.close();
    }
}
