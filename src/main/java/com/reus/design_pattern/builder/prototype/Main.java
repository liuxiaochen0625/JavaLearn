/**
 * Weidai
 * Copyright (C), 2011 - 2018, 微贷网.
 */
package com.reus.design_pattern.builder.prototype;

/**
 * @author reus
 * @version $Id: Main.java, v 0.1 2018-03-21 reus Exp $
 */
public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Author author = new Author();
        author.setName("tengj");
        Book book = new Book();
        book.setBookName("Java设计模式");
        book.setPrice(99);
        book.setAuthor(author);
        Book book2 = book.clone();
        System.out.println(book == book2); // false
        System.out.println(book.getBookName() == book2.getBookName()); // false
        System.out.println(book.getAuthor() == book2.getAuthor()); // false

        Author author1 = (Author) author.clone();
        System.out.println(author.getName());
        System.out.println(author1.getName());
        author1.setName("lxq");
        System.out.println(author.getName());
        System.out.println(author1.getName());

    }
}