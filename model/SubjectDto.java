package model;

public class SubjectDto {
    private int korean;
    private int english;
    private int math;

    public int getKorean() {
        return this.korean;
    }
    public void setKorean(int korean) {
        this.korean = korean;
    }
    public int getEnglish() {
        return this.english;
    }
    public void setEnglish(int english) {
        this.english = english;
    }
    public  int getMath() {
        return this.math;
    }
    public void setMath(int math) {
        this.math = math;
    }
    public SubjectDto(int korean, int math, int english){
        this.korean=korean;
        this.english=english;
        this.math=math;
    }

    public String toString(){
        return "SubjectDto{" +
                "Korean='" + korean + '\'' +
                ", English='" + english + '\'' +
                ", Math='" + math + '\'' +
                '}';
    }

}
