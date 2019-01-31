package es.ulpgc;

public class Kata {
    public static String accum(String chain) {

        if (chain.isEmpty()) return "";

        String tranformedChain = "";

        for (int i = 0; i < chain.length(); i++) {

            tranformedChain += Character.toUpperCase(chain.charAt(i));

            for (int j = 0; j < i; j++) {
                tranformedChain += Character.toLowerCase(chain.charAt(i));
            }

            if (i < chain.length()-1) tranformedChain += "-";
        }
        return tranformedChain;
    }
}
