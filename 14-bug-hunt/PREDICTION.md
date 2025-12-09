# Ma prédiction - Exercice 14

## BUG 1 : fonction `moyenne`

**Ligne suspecte :** 28

**Description du bug :** la boucle continue jusqu'à i=t.length hors i ne peut aller que jusque t.length - 1 

**Ce qui va se passer :** Une erreur ArrayIndexOutOfBoundsException

**Correction proposée :** public static int moyenne(int[] t) {
                            int somme = 0;
                            for (int i = 0; i < t.length; i++) {
                                somme = somme + t[i];
                            }
                            return somme / t.length;
                        }

---

## BUG 2 : fonction `estTrie`

**Ligne suspecte :** 36

**Description du bug :** Dans la boucle, nous cherchons à accéder à `t[i+1]` donc quand on atteint `i=t.length-1`, on cherche à accéder à `t[t.length]`, ce qui est impossible

**Ce qui va se passer :** une erreur ArrayIndexOutOfBoundsException

**Correction proposée :** public static boolean estTrie(int[] t) {
                            for (int i = 0; i < t.length - 1; i++) {
                                if (t[i] > t[i + 1]) {
                                    return false;
                                }
                            }
                            return true;
                        }

---

## BUG 3 : fonction `inverse`

**Ligne suspecte :** 46

**Description du bug :** `i < t.length` fait que le tableau est parcouru dans son intégralité

**Ce qui va se passer :** La boucle va parcourir tout le tableau et donc intervetir 2 fois chaque élément, remettant le tableau dans son état d'origine.

**Correction proposée :** public static void inverse(int[] t) {
                            for (int i = 0; i < t.length; i++) {
                                int temp = t[i];
                                t[i] = t[t.length - 1 - i];
                                t[t.length - 1 - i] = temp;
                            }
                        }

---

## BUG 4 : fonction `compter`

**Ligne suspecte :** 59

**Description du bug :** `count` est renvoyer dès la première occurence

**Ce qui va se passer :** `count` va être renvoyé dès la première occurence est le tableau ne va donc pas être parcouru dans son intégralité

**Correction proposée :** public static int compter(int[] t, int val) {
                            int count = 0;
                            for (int i = 0; i < t.length; i++) {
                                if (t[i] == val) {
                                    count++;
                                }
                            }
                            return count;
                        }
