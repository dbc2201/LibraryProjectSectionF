/*
 *   Created by IntelliJ IDEA.
 *   User: divyanshb
 *   Date: 28/11/19
 *   Time: 2:49 PM
 */

package data;

public class Book {
    private int id;
    private String name;

    public Book(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
