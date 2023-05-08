package org.example.hometask_1;
/*1. Дан массив записей: наименование товара, цена, сорт.
    Найти наибольшую цену товаров 1го или 2го сорта среди товаров, название которых содержит «высший».
 */
import java.util.ArrayList;

public class Main {
    public static void main ( String[] args ) {

        Goods item1 = new Goods ( "ром высший аромат" , 4062.2 , 1 );
        Goods item2 = new Goods ( "ром высший аромат" , 3952.2 , 2 );
        Goods item3 = new Goods ( "сахар высший хруст" , 150.5 , 1 );
        Goods item4 = new Goods ( "сахар высший хруст" , 144.4 , 2 );
        Goods item5 = new Goods ( "сахар высший хруст" , 124.0 , 3 );
        Goods item6 = new Goods ( "гранит высший статус" , 25_056.0 , 1 );
        Goods item7 = new Goods ( "гранит высший статус" , 24_056.0 , 2 );
        Goods item8 = new Goods ( "чай цейлонский" , 155.0 , 1 );
        Goods item9 = new Goods ( "чай цейлонский" , 144.0 , 2 );
        Goods item10 = new Goods ( "чай цейлонский" , 1246.0 , 3 );

        ArrayList < Goods > goodsList = new ArrayList <> ( );

        goodsList.add ( item1 );
        goodsList.add ( item2 );
        goodsList.add ( item3 );
        goodsList.add ( item4 );
        goodsList.add ( item5 );
        goodsList.add ( item6 );
        goodsList.add ( item7 );
        goodsList.add ( item8 );
        goodsList.add ( item9 );
        goodsList.add ( item10 );

        Double highestPriceGrade1 = 0.0;
        Double highestPriceGrade2 = 0.0;

        for ( Goods item : goodsList ) {
            if ( item.getDenomination ( ).contains ( "высший" ) )
                if ( item.getPrice ( ) > highestPriceGrade1 && item.getGrade ( ) == 1 ) {
                    highestPriceGrade1 = item.getPrice ( );
                } else if ( item.getPrice ( ) > highestPriceGrade2 && item.getGrade ( ) == 2 ) {
                    highestPriceGrade2 = item.getPrice ( );

                }
        }
        System.out.println ( "highestPriceGrade1 = " + highestPriceGrade1 );
        System.out.println ( "highestPriceGrade2 = " + highestPriceGrade2 );

    }

}

