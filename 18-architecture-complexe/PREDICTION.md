# Ma prédiction - Exercice 18

## Architecture

**Classes présentes :**
- Main → appelle les autres classe
- Banque → crée une identité à la banque et s'occupe des clients
- Client → s'occupe des informations et des choix des clients
- Compte → contient le solde des client

**Qui contient quoi ?**
- Banque contient : un constructeur avec une variable nom en privé, une liste de client ainsi que le nombre de client ayant un compte. Il y a également une fonction pour ajouter des clients, une autre pour afficher les infos d'un client et une dernière pour voir le solde complet de la banque. 
- Client contient : un constructeur avec une variable nom en privé, une instance de compte privé, une fonction pour récupérer le nom du client, une autre pour récuperer le solde du compte, une troisième pour déposer un montant, une quatrième pour retirer de l'argent et une dernière pour transferer de l'argent. 
- Compte contient : un constructeur avec une variable solde privé, une fonction renvoyant le solde du compte, une autre pour crediter un montant au solde et une dernière pour debiter un montant.

---

## Traçage de l'exécution

### Création des objets

**Ligne 3 :** `new Banque("MaBanque")`
- Crée une Banque avec clients[] vide

**Lignes 5-6 :** `new Client(...)`
- Alice créé avec un Compte (solde = 0)
- Bob créé avec un Compte (solde = 0)

**Lignes 8-9 :** `ajouterClient(...)`
- clients[0] = alice, nbClients = 1
- clients[1] = bob, nbClients = 2

---

### Dépôts

**Ligne 11 :** `alice.deposer(100)`
- Appelle compte.crediter(100)
- Alice.compte.solde = 100

**Ligne 12 :** `bob.deposer(50)`
- Bob.compte.solde = 50

---

### Affichage initial

```
alice : 100
bob : 50
```

---

### Transfert

**Ligne 17 :** `alice.transferer(bob, 30)`

Que se passe-t-il dans transferer() ?
1. `this.retirer(30)` → Alice.compte.solde = 100-30=70
2. `destinataire.deposer(30)` → Bob.compte.solde = 50+30=80

---

### Affichage après transfert

```
alice : 70
bob : 80
```

---

### Total en banque

**Ligne 22 :** `banque.totalDepots()`
- total = 70 + 80 = 150

```
Total : 150
```
