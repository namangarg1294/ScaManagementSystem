package in.scabhopal.scamanagementsystem.backend.bussinessmanager;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author HP
 */
public class BussinessManager {

    private BussinessManager self;

    public BussinessManager getInstance() {
        if (self == null) {
            self = new BussinessManager();
        }
        return self;
    }

    private BussinessManager() {

    }
}
