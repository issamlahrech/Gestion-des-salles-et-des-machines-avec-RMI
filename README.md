# Gestion des salles et des machines en utilisant RMI


La gestion des salles et des machines en utilisant RMI (Remote Method Invocation), Hibernate et Swing peut être un projet de développement logiciel complexe, mais il peut être divisé en plusieurs composants clés. Voici une description de chaque composant et comment ils interagissent :

Hibernate : Hibernate est un framework de persistance pour Java qui permet de mapper des objets Java à des tables de base de données. Dans ce contexte, il est utilisé pour représenter les données relatives aux salles et aux machines dans une base de données.

Swing : Swing est une bibliothèque graphique Java pour la création d'interfaces utilisateur (UI). Il est utilisé pour créer l'interface utilisateur de l'application de gestion des salles et des machines, y compris des formulaires pour ajouter, modifier et supprimer des salles et des machines, des listes, des tableaux, etc.

RMI (Remote Method Invocation) : RMI est une technologie Java qui permet l'appel de méthodes sur des objets distants. Il est utilisé pour gérer les communications entre le client (l'interface utilisateur Swing) et le serveur (où se trouvent les opérations métier et l'accès à la base de données via Hibernate). Le serveur expose des interfaces distantes que le client peut appeler.

Base de données : Une base de données est utilisée pour stocker les informations relatives aux salles et aux machines. Hibernate est utilisé pour mapper les objets Java aux tables de la base de données et gérer les opérations de création, lecture, mise à jour et suppression (CRUD).

Le flux de travail général fonctionne de la manière suivante :

Le client Swing affiche les données de la base de données et permet aux utilisateurs d'effectuer des opérations CRUD sur les salles et les machines (ajout, modification, suppression, lecture).
Lorsque l'utilisateur effectue une opération, par exemple, ajoute une salle, le client Swing appelle une méthode distante sur le serveur RMI.
Le serveur RMI reçoit l'appel et utilise Hibernate pour effectuer l'opération sur la base de données.
Le serveur RMI renvoie une réponse au client, indiquant le succès ou l'échec de l'opération.
Le client Swing met à jour l'interface utilisateur en fonction de la réponse.
Il est important de configurer correctement Hibernate pour qu'il puisse se connecter à la base de données, gérer les transactions et effectuer les requêtes nécessaires pour interagir avec les données des salles et des machines. Ce projet nécessite une bonne planification et une compréhension des concepts de base de Hibernate, RMI et de la création d'interfaces utilisateur Swing. Il est essentiel de concevoir l'architecture pour gérer efficacement les appels distants, les transactions de base de données et la gestion des erreurs

# Schema relationnel de la base de données

![image](https://github.com/issamlahrech/tpRMI/assets/147448984/a0f41f47-2770-46bb-abd4-7d17f87b97d4)

# Videos explicatives du fonctionnement de l`application


https://github.com/issamlahrech/tpRMI/assets/147448984/da808797-8da7-4dbf-a69f-f34e0faead81




https://github.com/issamlahrech/tpRMI/assets/147448984/ebb25a56-8b62-4c0c-9b86-4cc82c24f24a

# Structure du projet
- ServeurRMI

  ![image](https://github.com/issamlahrech/tpRMI/assets/147448984/6035e8ce-a8e1-4850-b5e0-2f8923b2fcfb)

- ClientRMI

  ![image](https://github.com/issamlahrech/tpRMI/assets/147448984/dce0978b-276e-418d-b78a-32eda1fb7b52)

  # Technologies :
- Java
- MySQL 
- Hibernate
- RMI 






