package service;

import repository.GradeRepository;

public interface GradeService {
    public int getTotal(int korean, int english, int math);

    public double getAverage(int korean, int english, int math);

}
