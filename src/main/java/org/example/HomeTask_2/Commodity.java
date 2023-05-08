package org.example.HomeTask_2;

import java.util.Objects;

/*2. Сведения о товаре состоят из наименования, страны-производителя, веса, цены, сорта.
Получить наименования товаров заданного сорта с наименьшей ценой.
 */
public class Commodity {
    private final String denomination;
    private final String originCountry;
    private final Double weight;
    private Double price;
    private Integer grade;


    public Commodity ( String denomination , String originCountry , Double weight , Double price , Integer grade ) {
        this.denomination = denomination;
        this.originCountry = originCountry;
        this.weight = weight;
        this.price = price;
        this.grade = grade;
    }

    public String getDenomination ( ) {
        return denomination;
    }

    public String getOriginCountry ( ) {
        return originCountry;
    }

    public Double getWeight ( ) {
        return weight;
    }

    public Double getPrice ( ) {
        return price;
    }

    public Integer getGrade ( ) {
        return grade;
    }

    @Override
    public String toString ( ) {
        return "Commodity{" +
                "denomination='" + denomination + '\'' +
                ", originCountry='" + originCountry + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                ", grade=" + grade +
                '}';
    }

    @Override
    public boolean equals ( Object o ) {
        if ( this == o ) return true;
        if ( o == null || getClass ( ) != o.getClass ( ) ) return false;
        Commodity commodity = (Commodity) o;
        return getDenomination ( ).equals ( commodity.getDenomination ( ) )
                && getOriginCountry ( ).equals ( commodity.getOriginCountry ( ) )
                && getWeight ( ).equals ( commodity.getWeight ( ) )
                && getPrice ( ).equals ( commodity.getPrice ( ) )
                && getGrade ( ).equals ( commodity.getGrade ( ) );
    }

    @Override
    public int hashCode ( ) {
        return Objects.hash ( this.denomination) ;
    }

    public void setPrice ( Double price ) {
        this.price = price;
    }

    public void setGrade ( Integer grade ) {
        this.grade = grade;
    }
}
