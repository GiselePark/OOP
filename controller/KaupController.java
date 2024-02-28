package controller;

import service.KaupService;
import serviceImpl.KaupServiceImpl;

public class KaupController {
    KaupService service;
    public KaupController(){this.service= KaupServiceImpl.getInstance();

    }

}
