package org.example.HomeTask_3;

import java.util.Objects;

/*3. Сведения о книге состоят из названия, фамилии автора, цены, года издания и количества страниц.
 Найти названия книг, в которых простое количество страниц, фамилия автора содержит «А»
 и год издания после 2010 г, включительно.
 */
public class Book {
    private final String title;
    private final String author;
    private final Double price;
    private final Integer publicationYear;
    private final Integer pagesCount;

    public Book ( String title , String author , Double price , Integer publicationYear , Integer pagesCount ) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.publicationYear = publicationYear;
        this.pagesCount = pagesCount;
    }

    public String getTitle ( ) {
        return title;
    }

    public String getAuthor ( ) {
        return author;
    }

    public Double getPrice ( ) {
        return price;
    }

    public Integer getPublicationYear ( ) {
        return publicationYear;
    }

    public Integer getPagesCount ( ) {
        return pagesCount;
    }

    @Override
    public boolean equals ( Object o ) {
        if ( this == o ) return true;
        if ( o == null || getClass ( ) != o.getClass ( ) ) return false;
        Book book = (Book) o;
        return title.equals ( book.title ) && Objects.equals ( author , book.author )
                && Objects.equals ( price , book.price )
                && Objects.equals ( publicationYear , book.publicationYear )
                && Objects.equals ( pagesCount , book.pagesCount );
    }

    @Override
    public int hashCode ( ) {
        return Objects.hash ( title , author , price , publicationYear , pagesCount );
    }

    @Override
    public String toString ( ) {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", publicationYear=" + publicationYear +
                ", pagesCount=" + pagesCount +
                '}';
    }
}
