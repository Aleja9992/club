/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customException;

/**
 *
 * @author Usuario
 */


// Custom Exception
public class PartnerNotFoundException extends Exception{
    public PartnerNotFoundException(String message) {
        super(message);
    }
}
