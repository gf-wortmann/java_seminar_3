package org.example.HomeTask_2;
/*2. Сведения о товаре состоят из наименования, страны-производителя, веса, цены, сорта.
Получить наименования товаров заданного сорта с наименьшей ценой.
 */

import java.util.*;

public class Main {
    public static void main ( String[] args ) {
        ArrayList < Commodity > commodities = new ArrayList <> ( );
        fillCommoditiesArray ( commodities );

        Integer targetGrade = 1;
        HashMap <String, Commodity> cheapestCommodities = new HashMap <> (  ) ;
        createUniqueCommoditiesList ( commodities , targetGrade , cheapestCommodities );
        getCheapestCommodities ( commodities , targetGrade , cheapestCommodities );
        PrintHasMap ( cheapestCommodities );
    }

    private static void PrintHasMap ( HashMap < String, Commodity > cheapestCommodities ) {
        System.out.println ( "\nThe cheapest commodities are:" );
        for ( String itemName: cheapestCommodities.keySet () ) {
            System.out.printf ( Locale.GERMANY, "commodity: %s, price = %,.2f, grade: %d\n"
                    , cheapestCommodities.get ( itemName ).getDenomination ()
                    , cheapestCommodities.get ( itemName ).getPrice ()
                    , cheapestCommodities.get ( itemName ).getGrade ()
            );
        }
    }

    private static void getCheapestCommodities ( ArrayList < Commodity > commodities , Integer targetGrade , HashMap < String, Commodity > cheapestCommodities ) {
        for ( Commodity item : commodities ){
            if( item.getGrade ().equals ( targetGrade)
                    && item.getPrice () < cheapestCommodities.get ( item.getDenomination () ).getPrice ()){
                cheapestCommodities.get ( item.getDenomination () ).setPrice ( item.getPrice () );
                cheapestCommodities.get ( item.getDenomination () ).setGrade ( item.getGrade () );
            }
        }
    }

    private static void createUniqueCommoditiesList ( ArrayList < Commodity > commodities , Integer targetGrade , HashMap < String, Commodity > cheapestCommodities ) {
        for ( Commodity item : commodities ){
            if ( item.getGrade ().equals ( targetGrade )){
                cheapestCommodities.put ( item.getDenomination (), item ) ;
            }
        }
    }

    private static void fillCommoditiesArray ( ArrayList < Commodity > commodities ) {
        for ( int i = 0 ; i < 10 ; i++ ) {
            commodities.add ( new Commodity ( "coffee" , "Namibia" , 32000.0
                    , Math.random ( ) * 12 + 30 , new Random ( ).nextInt ( 2 ) + 1 ) );
        }
        for ( int i = 0 ; i < 10 ; i++ ) {
            commodities.add ( new Commodity ( "coffee" , "Zambia" , 32000.0
                    , Math.random ( ) * 12 + 30 , new Random ( ).nextInt ( 2 ) + 1 ) );
        }
        for ( int i = 0 ; i < 10 ; i++ ) {
            commodities.add ( new Commodity ( "coffee" , "Brasilia" , 32000.0
                    , Math.random ( ) * 12 + 30 , new Random ( ).nextInt ( 2 ) + 1 ) );
        }
        for ( int i = 0 ; i < 10 ; i++ ) {
            commodities.add ( new Commodity ( "vodka" , "Russia" , 1000.0
                    , Math.random ( ) * 50 + 100 , new Random ( ).nextInt ( 2 ) + 1 ) );
        }
        for ( int i = 0 ; i < 10 ; i++ ) {
            commodities.add ( new Commodity ( "vodka" , "Finland" , 1000.0
                    , Math.random ( ) * 50 + 100 , new Random ( ).nextInt ( 2 ) + 1 ) );
        }
        for ( int i = 0 ; i < 10 ; i++ ) {
            commodities.add ( new Commodity ( "vodka" , "China" , 1000.0
                    , Math.random ( ) * 50 + 100 , new Random ( ).nextInt ( 2 ) + 1 ) );
        }
        for ( int i = 0 ; i < 10 ; i++ ) {
            commodities.add ( new Commodity ( "Crude oil" , "USA" , 1_000_000.0
                    , Math.random ( ) * 10 + 80 , new Random ( ).nextInt ( 2 ) + 1 ) );
        }
        for ( int i = 0 ; i < 10 ; i++ ) {
            commodities.add ( new Commodity ( "Crude oil" , "Russia" , 1_000_000.0
                    , Math.random ( ) * 10 + 80 , new Random ( ).nextInt ( 2 ) + 1 ) );
        }
        for ( int i = 0 ; i < 10 ; i++ ) {
            commodities.add ( new Commodity ( "Crude oil" , "Emirates" , 1_000_000.0
                    , Math.random ( ) * 10 + 80 , new Random ( ).nextInt ( 2 ) + 1 ) );
        }
        for ( int i = 0 ; i < 10 ; i++ ) {
            commodities.add ( new Commodity ( "Drones" , "Russia" , 1_000.0
                    , Math.random ( ) * 5_000_000 + 5_000_000  , new Random ( ).nextInt ( 2 ) + 1 ) );
        }
        for ( int i = 0 ; i < 10 ; i++ ) {
            commodities.add ( new Commodity ( "Drones" , "China" , 1_000.0
                    , Math.random ( ) * 5_000_000 + 5_000_000 , new Random ( ).nextInt ( 2 ) + 1 ) );
        }
        for ( int i = 0 ; i < 10 ; i++ ) {
            commodities.add ( new Commodity ( "Drones" , "USA" , 1_000.0
                    , Math.random ( ) * 5_000_000 + 5_000_000 , new Random ( ).nextInt ( 2 ) + 1 ) );
        }
    }
}
