package Clock;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Listener implements ActionListener{
    Logic logic = new Logic();

    @Override
    public void actionPerformed(ActionEvent ae) {
        logic.time.setText(logic.getTheTime());
    }
    
    
}