package in.scabhopal.scamanagementsystem.backend.communication;

import in.scabhopal.scamanagementsystem.common.Constants.RequestId;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class Request {
    RequestId requestId;

    public RequestId getRequestId() {
        return requestId;
    }

    public void setRequestId(RequestId requestId) {
        this.requestId = requestId;
    }
    
}
