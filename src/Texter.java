import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import static java.lang.Integer.parseInt;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Texter {

    public ArrayList<Integer> importText(String address) {

        String dataDocument = readTxt(address);
        String[] array = dataDocument.split(" ");

        ArrayList<Integer> datosEnArrayList = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            datosEnArrayList.add(parseInt(array[i]));
        }

        return datosEnArrayList;

    }

    private String readTxt (String direccion) {

        String texto = "";
        try {

            BufferedReader bf = new BufferedReader(new FileReader(direccion));
            StringBuilder temp = new StringBuilder();
            String bfRead;

            while((bfRead = bf.readLine()) != null) {

                temp.append(bfRead); // aquí lo guarda en temp
            }

            texto = temp.toString();

        } catch (Exception e) {
            System.err.println("No se encontro un archivo");

        }

        return texto;
    }

    public void escribirEnTxt (String direccion, String whatWrite) {
        try {
            File file = new File(direccion);
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(whatWrite);
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
