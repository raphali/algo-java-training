public class Main {
    public static void main(String[] args) {
        System.out.println("estPositif(5) : " + estPositif(5));
        System.out.println("estPositif(-3) : " + estPositif(-3));

        System.out.println("valeurAbsolue(5) : " + valeurAbsolue(5));
        System.out.println("valeurAbsolue(-3) : " + valeurAbsolue(-3));

        System.out.println("estPair(4) : " + estPair(4));
        System.out.println("estPair(7) : " + estPair(7));

        System.out.println("max(5, 3) : " + max(5, 3));
        System.out.println("max(2, 8) : " + max(2, 8));

        System.out.println("signe(5) : " + signe(5));
        System.out.println("signe(-3) : " + signe(-3));
        System.out.println("signe(0) : " + signe(0));
    }

    // Version verbeuse - à simplifier
    public static boolean estPositif(int n) {
        if (n>0){
        return true;
        }return false;
    }

    // Version verbeuse - à simplifier
    public static int valeurAbsolue(int n) {
        if (n<0) {
        n=n*-1;
    }return n;
    }

    // Version verbeuse - à simplifier
    public static boolean estPair(int n) {
        if (n%2 == 0) {
            return true;
        } 
        return false;
    }

    // Version verbeuse - à simplifier
    public static int max(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    // Version verbeuse - à simplifier
    public static String signe(int n) {
        if (n != 0) {
            if (n > 0) {
                return "Positif";
            }
            return "Negatif";
        } else {
            return "Zero";
        }
    }
}
