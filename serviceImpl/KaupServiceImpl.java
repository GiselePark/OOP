package serviceImpl;

import service.KaupService;

public class KaupServiceImpl implements KaupService {
    private static KaupServiceImpl instance = new KaupServiceImpl();
    private KaupServiceImpl(){}
    public static KaupServiceImpl getInstance(){
        return instance;
    }
    @Override
    public String createBMI() {
        return null;
    }
    @Override
    public String createBodyMass() {
        return null;
    }
}
