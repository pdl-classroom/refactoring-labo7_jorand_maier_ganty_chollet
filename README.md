[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/bapiq04Q)
# Refactoring

## Introduction

Un bon refactoring est un refactoring qui ne change pas le comportement du code.
De plus, un bon refactoring est effectué en plusieurs étapes, chacune d'entre elles étant validée par des tests unitaires.
Dans ce laboratoire, vous allez appliquer des refactorings un par un sur un code existant en vous assurant que son comportement ne change pas et que les tests unitaires passent toujours.

Avant d'effectuer ce travail, prenez le temps de parcourir les pages suivantes du site Refactoring Guru :

- [Clean code](https://refactoring.guru/refactoring/what-is-refactoring)
- [Code Smells](https://refactoring.guru/refactoring/smells)
- [Refactoring](https://refactoring.guru/refactoring/techniques)

Ensuite, sur la base de ce que vous avez appris, planifiez et exécutez votre refactoring en groupe.

## Travail à réaliser

Les objectifs de ce laboratoire sont de:

1. Configurer une action github pour exécuter les tests unitaires à chaque push.
2. Configurer sonar cloud pour analyser le code à chaque push et corriger les éventuels problèmes qui apparaitraient au cours ce laboratoire.
3. Appliquer les refactorings un par un en committant chaque changement:
   - Identifier un "code smell";
   - Créer une branche pour corriger le "code smell";
   - Corriger le "code smell";
   - Vérifier que les tests unitaires passent toujours;
   - Ajouter un test unitaire (si cela est justifié);
   - Committer votre changement et ajouter un message justifiant le changement ("code smell" identifié, description du changement, code impacté, etc.);
   PS. Faire une correction par commit.
   - Pousser votre changement sur github;
   - Vérifier que l'action github a bien été exécutée et que les tests unitaires passent;
   - Merger votre branche dans la branche `main`;
   - Recommencer jusqu'à ce qu'il n'y ait plus de "code smell" à corriger.

Nous nous attendons à ce vous effectuiez une dizaine de commits pour ce laboratoire.

## Environnement de développement

Java 17, Maven, et un IDE sont nécessaires pour réaliser ce travail.
