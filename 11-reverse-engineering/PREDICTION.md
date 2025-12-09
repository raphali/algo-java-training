# Ma prédiction - Exercice 11

## Analyse des fonctions

### Fonction `xxx(int[] t)`

**Que fait cette fonction ?**
- Analyse le code ligne par ligne :
  - r = t[0] → 3
  - Boucle : si t[i] > r alors r = t[i] → 9
  - return r → 9

**En une phrase, cette fonction :** Cette fonction renvoie le plus grand entier du tableau

**xxx({3, 7, 2, 9, 1, 5}) = 9**

---

### Fonction `yyy(int[] t)`

**Que fait cette fonction ?**
- Analyse :
  - r = 0 → 0
  - Boucle : r = r + t[i] → 27
  - return r → 27

**En une phrase, cette fonction :** Cette fonction additionne tout les entiers d'un tableau

**yyy({3, 7, 2, 9, 1, 5}) = 27**

---

### Fonction `zzz(int[] t, int v)`

**Que fait cette fonction ?**
- Première boucle : compte les éléments où t[i] < v → 3
- Crée un nouveau tableau de taille c → []
- Deuxième boucle : remplit le tableau avec les éléments < v → [3, 2, 1]

**En une phrase, cette fonction :** Cette fonction compile les entiers inférieurs à une valeur donnée

**zzz({3, 7, 2, 9, 1, 5}, 4) = {3, 2, 1}**

---

### Fonction `aaa(int[] t)`

**Que fait cette fonction ?**
- Double boucle imbriquée → Parcours le tableau `t`avec l'index `i` puis parcours à nouveau `t` depuis `i`   
- Compare t[j] et t[j+1], échange si t[j] > t[j+1] → [1, 2, 3, 5, 7, 9]

**En une phrase, cette fonction :** Cette fonction trie un tableau dans l'ordre croissant

**Après aaa({3, 7, 2, 9, 1, 5}) : {1, 2, 3, 5, 7, 9}**
