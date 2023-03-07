package taskSong;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        try (FileWriter fileWriter = new FileWriter("Song.txt");) {

            fileWriter.write("""
                    Author: Абу Таййиб Табари                                  
                    Title:  ЫР УГУУНУН ЖАКШЫ ЭМЕСТИГИ  
                                                       
                    Text:
                    Абу Таййиб Табари: «Шафийдин жолдошторунун айтуусу боюнча эркек киши жат аялдын ырдаганын угуусу жакшы эмес» - деген.                                        
                    Абу Таййиб Имам Шафийдин дагы бир сѳзүн эскертет: «Элди чогултуп, күңүн ырдаткан киши акылсыз, ал күбѳлүккѳ ѳтѳ албайт».                                        
                    Абу Таййибдин айтуусу боюнча Имам Шафий ошол кездеги таяктарды ыргак менен уруу оюнун да макүрөө деп эсептеген. 
                    Бул усулду мурдагы замандын ыймансыздары Куранды угууга тоскоол болуу үчүн ойлоп тапкандарын буга себеп кылып кѳрсѳткѳн.
                    """);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        Song song = new Song();
        try (FileReader reader = new FileReader("Song.txt");) {
            Scanner scanner = new Scanner(reader);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }



    }
}
