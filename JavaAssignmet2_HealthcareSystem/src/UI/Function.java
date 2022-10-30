/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UI;

/**
 *
 * @author admin
 */
public abstract class Function {
    Function(){

    }

    boolean illegalUserTextInput(String text){
        if(text.equals("")){
            return true;
        }

        return false;
    }

}