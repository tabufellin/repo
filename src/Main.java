import java.util.ArrayList;

public class Main {
    public static void main (String[] args) {

        // declaration of objects
        //Texter myTexter = new Texter();
        Sort sorty = new Sort();
        Texter texter = new Texter();
        Machine machine = new Machine();

        String a = machine.createArrayAleatory(100);
        texter.escribirEnTxt("./text.txt", a);

        ArrayList<Integer> x = texter.importText("./text.txt");

        int[] arrayAnalizar = new int[x.size()-1];


        for (int i = 0 ; i < x.size()-1; i++){
            arrayAnalizar[i] = x.get(i);
        }










    }

}