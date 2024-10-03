package com.tricount;

import java.util.Scanner;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demander l'ID
        System.out.print("Entrez l'ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consommer la nouvelle ligne laissée par nextInt()

        // Demander le prénom
        System.out.print("Entrez le prénom: ");
        String firstName = scanner.nextLine();

        // Demander le nom
        System.out.print("Entrez le nom: ");
        String lastName = scanner.nextLine();

        // Demander le numéro de téléphone
        System.out.print("Entrez le numéro de téléphone: ");
        String tel = scanner.nextLine();

        // Demander le mot de passe
        System.out.print("Entrez le mot de passe: ");
        String password = scanner.nextLine();

        // Hacher le mot de passe
        String hashedPassword = hashPassword(password);

        // Demander le rôle
        System.out.print("Entrez le rôle: ");
        String roles = scanner.nextLine();

        // Créer un objet User avec les informations fournies
        User user = new User(id, firstName, lastName, tel, hashedPassword, roles);

        // Afficher les informations de l'utilisateur
        System.out.println("Les informations de l'utilisateur sont : " + user.getFullName());

        scanner.close();
    }

    // Méthode pour hacher un mot de passe en utilisant SHA-256
    public static String hashPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hashedBytes = md.digest(password.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : hashedBytes) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Erreur lors du hachage du mot de passe", e);
        }
    }
}
