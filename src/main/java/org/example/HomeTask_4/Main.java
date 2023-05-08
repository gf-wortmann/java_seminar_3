package org.example.HomeTask_4;
/*
4. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main ( String[] args ) {

        int intArraySize = new Random ( ).nextInt ( 100 ) + 100;
        ArrayList < Integer > intArray = new ArrayList <> ( intArraySize );
        for ( int i = 0 ; i < intArraySize ; i++ ) {
            intArray.add ( new Random ( ).nextInt ( 1000 ) );
        }
        double meanItem = getMeanItem ( intArray );
        Integer maxItem = Collections.max ( intArray );
        Integer minItem = Collections.min ( intArray );

        System.out.println ( "max Item = " + maxItem );
        System.out.println ( "min Item = " + minItem );
        System.out.println ( "mean Item = " + meanItem );
    }

    private static double getMeanItem ( ArrayList < Integer > intArray ) {
        double meanItem = 0.0;
        for ( int i = 0 ; i < intArray.size ( ) ; i++ ) {
            meanItem += (double) intArray.get ( i ) / intArray.size ( );
        }
        return meanItem;
    }
}
