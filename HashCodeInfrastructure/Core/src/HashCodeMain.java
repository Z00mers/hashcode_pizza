import com.google.hashcode.utils.*;

public class HashCodeMain{

  public static void main(String args[]){

    System.out.println("Christos, I'll slap you!!!");

    String inputFile = "C:\\HashCode\\example.in";

    FileParser fileParser = new FileParser(inputFile);

    InputData inputData = fileParser.parseFile();
    char[][] inputMatrix = inputData.getDataMatrix();



  }

}