import java.util.Random;

public class Machine {

    public String createArrayAleatory (int cuantos) {
        Random rand = new Random();

        int[] x = new int[cuantos-1];

        for (int i= 0; i < x.length; i++) {
            int rand_int1 = rand.nextInt(cuantos);
            x[i] = rand_int1;
        }

        StringBuilder guardarEnString= new StringBuilder();

        for (int i = 0; i < x.length; i++) {
            guardarEnString.append(x[i]);
            guardarEnString.append(" ");
        }

        return guardarEnString.toString();



    }
}
