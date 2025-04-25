package view;
import models.*;
import controllers.*;

public class viewConsole {
    
    public void printArray(Persona[] personas){
        for (Persona b : personas){
            System.out.println(b);
        }
    }

    public void showMessage(String message){
        System.out.println(message);
    }
}
