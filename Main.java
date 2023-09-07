import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {


        String pathName = "C:\\Users\\BE218\\Downloads\\animals\\arrivingAnimals.txt";
        String pathOutput = "C:\\Users\\BE218\\Downloads\\animals\\myNewFile.txt";
        BufferedReader reader = null;
        String line = "";
        BufferedWriter writer = new BufferedWriter(new FileWriter(pathOutput));
        try {
            reader = new BufferedReader(new FileReader(pathName));
            while ((line = reader.readLine()) != null ) {
                String[] row = line.split(",");

                for (String i : row){

                    System.out.println("\n" + i);
                    writer.write("\n" + i);
                }
            }
        }

        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            reader.close();

        }

        //write to a file named: myNewFile.txt

        // Create a file writer



        try {

            writer.write("This is a line of animals...");
            //Write to out file with a for loop
            for (int i=0; i<10; i++){
                writer.write("\n i is" + i);
            }

        }


        catch(Exception e) {
            e.printStackTrace();


        }
        finally {
           writer.close();
        }





    }
}
