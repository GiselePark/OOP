package model;

public class SubjectDto {
    public SubjectDto(double korean, double english, double math) {
        this.korean = korean;
        this.english = english;
        this.math = math;
    }

    private double korean;
    private double english;
    private double math;

    public double getkorean() {
        return korean;
    }

    public void setkorean(double korean) {
        this.korean = korean;
    }

    public double getenglish() {
        return english;
    }

    public void setenglish(double english) {
        this.english = english;
    }

    public double getmath() {
        return math;
    }

    public void setmath(double math) {
        this.math = math;
    }

    @Override
    public String toString() {
        return "SubjectDto{" +
                "korean=" + korean +
                ", english=" + english +
                ", math=" + math +
                '}';
    }



    }
