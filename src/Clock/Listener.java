package Clock;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Listener implements ActionListener{
    
    private final Logic mView;
    public Listener(Logic mView)
    {
        this.mView = mView;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        mView.time.setText(mView.getTheTime());   
    }
    
    
}