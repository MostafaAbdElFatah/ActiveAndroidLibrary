package com.alsabha.fci.activeandroidlibrary;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import com.activeandroid.query.Delete;
import com.activeandroid.query.Select;

import java.util.List;

/**
 * Created by FCI on 2018-06-22.
 */
@Table(name = "Items")
public class Book extends Model {
    // If name is omitted, then the field name is used.
    @Column(name = "Name")
    public String name;

    @Column(name = "Category")
    public String author;

    public Book() {
        super();
    }

    public Book(String name, String auther) {
        super();
        this.name = name;
        this.author = auther;
    }

    public static List<Book> getname(String name) {

        return new Select()
                .from(Book.class)
                .where("name = ?", name )
                .orderBy("Name ASC")
                .execute();

    }

    /**
     * return all data
     * */
    public static List<Book> getAll() {
        return new Select()
                .from(Book.class)
                .orderBy("Name ASC")
                .execute();
    }
    /**
     * to delete item
     * */
    public  static void deleteItem(String name){

        /**
         *Book item = Book.load(Book.class, id);
         *item.delete();
         */
        /**
         * or
         */

        new Delete().from(Book.class).where("name = ?", name).execute();
    }
}