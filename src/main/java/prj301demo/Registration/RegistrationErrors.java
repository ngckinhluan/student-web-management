/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prj301demo.Registration;

/**
 *
 * @author LuanTNK
 */
public class RegistrationErrors {
    private String usernameErrs;
    private String passwordErrs;
    private String confirmErrs;
    private String lastnameErrs;
    private String duplicateUsername;

    public RegistrationErrors() {
    }

    public RegistrationErrors(String usernameErrs, String passwordErrs, String confirmErrs, String lastnameErrs, String duplicateUsername) {
        this.usernameErrs = usernameErrs;
        this.passwordErrs = passwordErrs;
        this.confirmErrs = confirmErrs;
        this.lastnameErrs = lastnameErrs;
        this.duplicateUsername = duplicateUsername;
    }

    public String getUsernameErrs() {
        return usernameErrs;
    }

    public void setUsernameErrs(String usernameErrs) {
        this.usernameErrs = usernameErrs;
    }

    public String getPasswordErrs() {
        return passwordErrs;
    }

    public void setPasswordErrs(String passwordErrs) {
        this.passwordErrs = passwordErrs;
    }

    public String getConfirmErrs() {
        return confirmErrs;
    }

    public void setConfirmErrs(String confirmErrs) {
        this.confirmErrs = confirmErrs;
    }

    public String getLastnameErrs() {
        return lastnameErrs;
    }

    public void setLastnameErrs(String lastnameErrs) {
        this.lastnameErrs = lastnameErrs;
    }

    public String getDuplicateUsername() {
        return duplicateUsername;
    }

    public void setDuplicateUsername(String duplicateUsername) {
        this.duplicateUsername = duplicateUsername;
    }
    
    
    
    
    
    
    
}
