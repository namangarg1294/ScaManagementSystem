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
public class RequestResponseChannel {
    public Response processRequest(Request request){
        return CommunicationManager.getInstance().processRequest(request);
    }
}
