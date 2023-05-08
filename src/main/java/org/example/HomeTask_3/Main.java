package org.example.HomeTask_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*3. Сведения о книге состоят из названия, фамилии автора, цены, года издания и количества страниц.
 Найти названия книг, в которых простое количество страниц, фамилия автора содержит «А»
 и год издания после 2010 г, включительно.
 */
public class Main {
    public static void main ( String[] args ) {

        ArrayList < Book > books;
        books = fillBookArray ( );
        ArrayList < Book > filteredBooks = new ArrayList <> ( );

        for ( Book book : books ) {
            if ( isSimple ( book.getPagesCount ( ) )
                    && book.getAuthor ( ).toLowerCase ( ).contains ( "а" )
                    && book.getPublicationYear ( ) >= 2010 ) {
                filteredBooks.add ( book );
            }
        }

        if ( filteredBooks.size ( ) == 0 ) {
            System.out.println ( "\nПохоже, книг, соответствующих запросу, не найдено... :(" );
        } else {
            System.out.printf ( "\nКниги, соответствующие запросу: Всего нашлось %d \n" , filteredBooks.size ( ) );
            for ( Book book : filteredBooks ) {
                System.out.printf ( "Название: %s, автор: %s, цена $%.2f, год издания: %s, страниц: %s \n"
                        , book.getTitle ( )
                        , book.getAuthor ( )
                        , book.getPrice ( )
                        , book.getPublicationYear ( )
                        , book.getPagesCount ( )
                );
            }
        }
    }

    private static boolean isSimple ( int i ) {
        if ( i < 4 ) return true;
        for ( int j = 2 ; j <= Math.sqrt ( i ) ; j++ ) {
            if ( i % j == 0 ) return false;
        }
        return true;
    }

    private static ArrayList < Book > fillBookArray ( ) {
        ArrayList < ArrayList < String > > bookAndAuthorArray = new ArrayList <> ( new ArrayList <> ( ) );
        ArrayList < Book > books = new ArrayList <> ( );

        File file = new File ( "books.txt" );
        Scanner scanner;
        try {
            scanner = new Scanner ( file );
        } catch ( FileNotFoundException e ) {
            throw new RuntimeException ( e );
        }
        while ( scanner.hasNext ( ) ) {
            String[] splittedString = scanner.nextLine ( ).split ( "\t" );
            ArrayList < String > bookAndAuthor = new ArrayList <> ( 2 );
            for ( int i = 0 ; i < splittedString.length ; i++ ) {
                bookAndAuthor.add ( i , splittedString[i] );
            }
            bookAndAuthorArray.add ( bookAndAuthor );
        }
        scanner.close ( );
        for ( ArrayList < String > bookAndAuthor : bookAndAuthorArray ) {
            Book book = new Book
                    ( bookAndAuthor.get ( 0 )
                            , bookAndAuthor.get ( 1 )
                            , Math.random ( ) * 200.0 + 100.0
                            , new Random ( ).nextInt ( 14 ) + 2008
                            , new Random ( ).nextInt ( 200 ) + 100
                    );
            books.add ( book );
        }
        return books;
    }
}
