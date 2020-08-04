/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.scabhopal.scamanagementsystem.common;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author HP
 */
public class Configurations {
    private static Configurations self;
    public static ConfigurationParameters configurationParameters;
    public static Configurations getInstance(){
        if(self==null){
            self=new Configurations();
        }
        return self;
    }    
   private Configurations(){
        File file = new File("src/main/resources/config/configurations.xml");  
        JAXBContext jaxbContext;  
        try {
            jaxbContext = JAXBContext.newInstance(ConfigurationParameters.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller(); 
            configurationParameters= (ConfigurationParameters) jaxbUnmarshaller.unmarshal(file);  
        } catch (JAXBException ex) {
            Logger.getLogger(Configurations.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
   @XmlRootElement  
   static class ConfigurationParameters{     
       @XmlElement
       public String dbUrl; 
       @XmlElement
       public String userName; 
   }
    public static void main(String[] args) {
        Configurations.getInstance();
    }
}
