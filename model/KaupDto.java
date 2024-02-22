package model;

import builder.KaupBuilder;

public class KaupDto {
    private double height;  //초기화 선언 x
    private double weight;
    private double bmi;
    private String bodyMass;
    private String name;


    public KaupBuilder height(double height){
        this.height=height;
        return this;
    }
    public KaupBuilder weight(double weight){
        this.weight=weight;
        return this;
    }
    public KaupBuilder name(String name){
        this.name=name;
        return this;
    }

    public KaupDto build(){
        return new KaupDto(height,weight,bmi,bodyMass,name);
    }

}
