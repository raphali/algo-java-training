public class Main {
    public static void main(String[] args) {
        int[] nombres = { 3, 7, 2, 8, 5, 1, 9, 4 };

        System.out.println("moyenneInef : " + moyenneInef(nombres));
        System.out.println("contientDoublonInef : " + contientDoublonInef(nombres));
        System.out.println("premierEtDernierInef : " + premierEtDernierInef(nombres));
        System.out.println("rechercheInef(5) : " + rechercheInef(nombres, 5));
    }

    // PROBLEME 1 : Calcule la somme à chaque itération
    public static double moyenneInef(int[] t) {
        int somme = 0;
        for (int i = 0; i < t.length; i++) {
            somme += t[i];
        }
        return (double) somme / t.length;
    }

    // PROBLEME 2 : Compare chaque paire deux fois
    public static boolean contientDoublonInef(int[] t) {
        for (int i = 0; i < t.length; i++) {
            for (int j = i + 1; j < t.length; j++) {
                if (t[i] == t[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    // PROBLEME 3 : Parcourt le tableau deux fois
    public static String premierEtDernierInef(int[] t) {
        int premier = t[0];
        int dernier = t[t.length - 1];
        return premier + " et " + dernier;
    }

    // PROBLEME 4 : Continue après avoir trouvé
    public static int rechercheInef(int[] t, int val) {
        for (int i = 0; i < t.length; i++) {
            if (t[i] == val) {
                return i;
            }
        }
        return -1;
    }
}
