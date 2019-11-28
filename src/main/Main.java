/*
 *   Created by IntelliJ IDEA.
 *   User: divyanshb
 *   Date: 28/11/19
 *   Time: 3:11 PM
 */

package main;

import connection.DatabaseConnection;
import data.Book;
import databaseHelper.BookEntry;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        DatabaseConnection connection = new DatabaseConnection();
        connection.attemptConnection();
        System.out.println("Enter book ID: ");
        final Scanner scanner = new Scanner(System.in);
        int bookID = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter book name: ");
        String name = scanner.nextLine();
        Book book = new Book(bookID, name);
        BookEntry entry = new BookEntry();
        if (entry.addNewBookInDatabase(connection.getConnection()
                , book)) {
            System.out.println("Successful");

        } else {
            System.out.println("Failed");
        }

    }
}
