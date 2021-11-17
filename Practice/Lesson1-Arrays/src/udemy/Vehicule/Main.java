package udemy.Vehicule;

import javax.swing.*;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        if (carEntryWindow.tankSizetextField.getText().isEmpty() || carEntryWindow.tankSizetextField.getText().isBlank()) {
            try {
                if (Integer.parseInt(carEntryWindow.tankSizetextField.getText()) > 0) {
                    tanksise = Integer.parseInt(carEntryWindow.tankSizetextField.getText());
                } else {
                    JOptionPane.showMessageDialog(null, "Tank size must be great than 0");
                    return;

                }

            } catch (Exception w) {


                JOptionPane.showMessageDialog(carEntryWindow.submitButton, "Tank size must be a numeric value");
                return;
            }
        }else{
            JOptionPane.showMessageDialog(carEntryWindow.submitButton, "Tank size cannot be empty");
            return;
        }










    }
}
