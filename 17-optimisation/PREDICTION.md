# Ma prédiction - Exercice 17

## Fonction `moyenneInef`

**Problème identifié :** La fonction recalcule la somme complète à chaque itération plutot que d'ajouter t[i] à une somme globale

**Nombre d'opérations actuelles (pour n éléments) :** n×n/2

**Version optimisée :**
```java
public static double moyenneEff(int[] t) {
    int somme = 0;
    for (int i = 0; i < t.length; i++) {
        somme += t[i];
    }
    return (double) somme / t.length;
}
```

---

## Fonction `contientDoublonInef`

**Problème identifié :** La fonction compare chaque paire 2 fois (i/j puis j/i)

**Version optimisée :**
```java
public static boolean contientDoublonEff(int[] t) {
    for (int i = 0; i < t.length; i++) {
        for (int j = i + 1; j < t.length; j++) {
            if (t[i] == t[j]) {
                return true;
            }
        }
    }
    return false;
}
```

---

## Fonction `premierEtDernierInef`

**Problème identifié :** La fonction parcourt 2 fois le tableau alors qu'il n'est même pas nécessaire de faire une boucle pour récupérer les informations demandées

**Version optimisée :**
```java
public static String premierEtDernierEff(int[] t) {
    int premier=t[0];
    int dernier=t[t.length-1];
    return premier + " et " + dernier;
}
```

---

## Fonction `rechercheInef`

**Problème identifié :** La fonction continue même si le résultat demandé est apparu, et si il apparait plusieurs fois, c'est l'index de la dernière occurence qui sera retenu

**Version optimisée :**
```java
public static int rechercheEff(int[] t, int val) {
    for (int i = 0; i < t.length; i++) {
        if (t[i] == val) {
            return i;
        }
    }
    return -1;
}
```
