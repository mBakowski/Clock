
package Clock;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Logic extends JFrame{
    
    JPanel clockPanel = new JPanel();
    JLabel label = new JLabel("Czas:");
    JLabel time = new JLabel(getTheTime());
 
    
    public Logic()
    {
        this.setVisible(true);
        this.setDefaultCloseOperation(3);
        this.setTitle("Zegarek");
        initComponents();
    }
    
    public void initComponents()
    {
        this.getContentPane().add(clockPanel);
        clockPanel.add(label);
        clockPanel.add(time);
        
        
        ActionListener clock = new Listener(this);
        Timer timer = new Timer(1000,clock);
        timer.start();
        
        pack();
    }
    
    public String getTheTime()
    {
        GregorianCalendar calendar = new GregorianCalendar();
        
        String hour = ""+calendar.get(Calendar.HOUR_OF_DAY);
        String minute = ""+calendar.get(Calendar.MINUTE);
        String second = ""+calendar.get(Calendar.SECOND);

        if(Integer.parseInt(hour)<10)
            hour = "0"+hour;
        if(Integer.parseInt(minute)<10)
            minute = "0"+minute;
        if(Integer.parseInt(second)<10)
            second = "0"+second;
        
        return hour+":"+minute+":"+second;        
    }
    
//    private class Listener implements ActionListener
//    {
//
//        @Override
//        public void actionPerformed(ActionEvent ae) 
//        {
//            time.setText(getTheTime());
//        }
//        
//    }
    
    
}
