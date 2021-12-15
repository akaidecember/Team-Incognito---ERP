package CeoGUI;

import javax.swing.JFrame;

public class SaleGraphChart
{
    
    public void intiateSimulation()
    {
        
           SaleChartApplet theApplet = new SaleChartApplet();
        theApplet.init();         // Needed if overridden in applet
        theApplet.start();        // Needed if overridden in applet

        JFrame window = new JFrame(SaleChartApplet.message);
        window.setContentPane(theApplet);
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        window.pack();
        window.setSize(1000, 600);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
}
