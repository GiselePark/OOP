package service;

import model.User;

public interface KaupService {
    public String createBMI();
    public String createBodyMass();

    String createBMI(User user);

    String createBodyMass(String bmi);
}
