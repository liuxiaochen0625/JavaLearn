/**
 * Weidai
 * Copyright (C), 2011 - 2018, 微贷网.
 */
package com.reus.design_pattern.builder.prototype;

import java.io.*;

/**
 * @author reus
 * @version $Id: Book.java, v 0.1 2018-03-21 reus Exp $
 */
public class Book implements Serializable {

    private String bookName;

    private int    price;

    private Author author;

    public Book clone() {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        try {
            ObjectOutputStream os = new ObjectOutputStream(bos);
            os.writeObject(this);
            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            Book book = (Book) ois.readObject();
            return book;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Getter method for property <tt>bookName</tt>.
     *
     * @return property value of bookName
     */
    public String getBookName() {
        return bookName;
    }

    /**
     * Setter method for property <tt>bookName</tt>.
     *
     * @param bookName value to be assigned to property bookName
     */
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    /**
     * Getter method for property <tt>price</tt>.
     *
     * @return property value of price
     */
    public int getPrice() {
        return price;
    }

    /**
     * Setter method for property <tt>price</tt>.
     *
     * @param price value to be assigned to property price
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * Getter method for property <tt>author</tt>.
     *
     * @return property value of author
     */
    public Author getAuthor() {
        return author;
    }

    /**
     * Setter method for property <tt>author</tt>.
     *
     * @param author value to be assigned to property author
     */
    public void setAuthor(Author author) {
        this.author = author;
    }
}