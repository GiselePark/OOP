package serviceImpl;

import service.GradeService;

public class GradeServiceImpl implements GradeService {
    private static GradeServiceImpl instance = new GradeServiceImpl();
    private GradeServiceImpl(){}
    public static GradeServiceImpl getInstance(){
        return instance;
    }
    public int getTotal(int korean, int english, int math) {
        int total=0;
        total=korean+english+math;
        return total;
    }
    public double getAverage(int korean, int english,  int math) {
        double average=0;
        average=(double)(korean+english+math)/3;
        return average;
    }
}
