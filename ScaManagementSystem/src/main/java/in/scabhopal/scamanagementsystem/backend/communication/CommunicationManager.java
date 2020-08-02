/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.scabhopal.scamanagementsystem.backend.communication;

/**
 *
 * @author HP
 */
public class CommunicationManager {

    private CommunicationManager() {

    }
    CommunicationManager self = null;

    public CommunicationManager getInstance() {
        if (self == null) {
            self = new CommunicationManager();
        }
        return self;
    }

    public Response processRequest(Request serviceRequest) {
        Response serviceResponse=null;
        switch (serviceRequest.getRequestId()) {
            case ADDBATCH:
                break;
            case ADDSTUDENT:
                break;
            case LOGIN:
                break;
            case LOGOUT:
                break;
        }
        return serviceResponse;
    }
}
