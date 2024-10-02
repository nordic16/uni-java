import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class TerceiroDesafio {
 
    // note: não gostei desta solução, might figure out better solution later.
    public static void main(String[] args) {    
        HashMap<Integer, String> dezenas = new HashMap<>();
        HashMap<Integer, String> unidades = new HashMap<>();
        HashMap<Integer, String> dez = new HashMap<>();

        unidades.put(0, "");
        unidades.put(1, "um");
        unidades.put(2, "dois");
        unidades.put(3, "tres");
        unidades.put(4, "quatro");
        unidades.put(5, "cinco");
        unidades.put(6, "seis");
        unidades.put(7, "sete");
        unidades.put(8, "oito");
        unidades.put(9, "nove");

        dez.put(10, "dez");
        dez.put(11, "onze");
        dez.put(12, "doze");
        dez.put(13, "treze");
        dez.put(14, "catorze");
        dez.put(15, "quinze");
        dez.put(16, "dezasseis");
        dez.put(17, "dezassete");
        dez.put(18, "dezoito");
        dez.put(19, "dezanove");

        dezenas.put(2, "vinte");
        dezenas.put(3, "trinta");
        dezenas.put(4, "quarenta");
        dezenas.put(5, "cinquenta");
        dezenas.put(6, "sessenta");
        dezenas.put(7, "setenta");
        dezenas.put(8, "oitenta");
        dezenas.put(9, "noventa");

        int rand = ThreadLocalRandom.current().nextInt(1, 100);
        int dezena = rand / 10;
        int unidade = rand % 10;

        System.out.println("Num: " + rand);
        
        String num = "";

        if (dezena == 1) {
            num += dez.get(rand);
            System.out.println(num);
            return;
        
        } else if (dezena != 0) {
            num += dezenas.get(dezena);

            if (unidade != 0) {
                num += " e ";
            }
        }
        num += unidades.get(unidade);
        System.out.println(num);
    }
}
