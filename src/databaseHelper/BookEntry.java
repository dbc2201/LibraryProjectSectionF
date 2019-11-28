/*
 *   Created by IntelliJ IDEA.
 *   User: divyanshb
 *   Date: 28/11/19
 *   Time: 2:57 PM
 */

package databaseHelper;

import com.mysql.cj.jdbc.result.UpdatableResultSet;
import data.Book;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BookEntry {

    public boolean addNewBookInDatabase
            (Connection connection, Book book) throws SQLException {

        int bookID = book.getId();
        String bookName = book.getName();

//        INSERT INTO book (id, name) VALUES (1, 'OOP');

        PreparedStatement p =
                connection.prepareStatement
        ("INSERT INTO book (id, name) VALUES (?, ?);");
        p.setInt(1, bookID);
        p.setString(2, bookName);
        int n = p.executeUpdate();
        return n >= 1;
    }
















}
