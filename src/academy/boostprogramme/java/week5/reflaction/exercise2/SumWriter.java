package academy.boostprogramme.java.week5.reflaction.exercise2;

import academy.boostprogramme.java.week5.set2.exercise1.FileReader;
import academy.boostprogramme.java.week5.set2.exercise2.FileWriter;

import java.util.List;


public class SumWriter {

   private FileReader reader = new FileReader();
   private FileWriter writer = new FileWriter();
   private String contentRootPath = "src/academy/boostprogramme/java/week5/reflaction/file/input.csv";

   public void write() {
       List<String> lines = reader.read(contentRootPath);
       
   }



}
