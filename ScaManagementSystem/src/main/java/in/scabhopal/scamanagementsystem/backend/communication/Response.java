/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.scabhopal.scamanagementsystem.backend.communication;

import in.scabhopal.scamanagementsystem.common.Constants;

/**
 *
 * @author HP
 */
public class Response {
    Constants.RequestId requestId;

    public Constants.RequestId getRequestId() {
        return requestId;
    }

    public void setRequestId(Constants.RequestId requestId) {
        this.requestId = requestId;
    }
}
