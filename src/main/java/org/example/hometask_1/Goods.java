package org.example.hometask_1;

public class Goods {
    private final String denomination;
    private final Double price;
    private final Integer grade;

    public Goods ( String denomination , Double price , Integer grade ) {
        this.denomination = denomination;
        this.price = price;
        this.grade = grade;
    }

    public String getDenomination ( ) {
        return denomination;
    }

    public Double getPrice ( ) {
        return price;
    }

    public Integer getGrade ( ) {
        return grade;
    }

    @Override
    public String toString ( ) {
        return "Goods{" +
                "denomination='" + denomination + '\'' +
                ", price=" + price +
                ", grade=" + grade +
                '}';
    }
}

