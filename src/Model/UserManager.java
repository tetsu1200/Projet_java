/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author PROBOOK 450 I7
 */
public class UserManager {
    
    private static String email;
    private static String password;
    private static int verif;

    public static String getEmail() {
        return email;
    }

    public static void setEmail(String email) {
        UserManager.email = email;
    }

    public static void setVerif(int verif) {
        UserManager.verif = verif;
    }
    
    

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        UserManager.password = password;
    }

    public static int getVerif() {
        return verif;
    }
    
    
}
