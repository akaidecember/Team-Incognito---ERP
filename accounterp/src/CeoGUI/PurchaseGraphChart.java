package CeoGUI;

import javax.swing.JFrame;

public class PurchaseGraphChart
{
    
    public void intiateSimulation()
    {
        
           PurchaseChartApplet theApplet = new PurchaseChartApplet();
        theApplet.init();         // Needed if overridden in applet
        theApplet.start();        // Needed if overridden in applet

        JFrame window = new JFrame(PurchaseChartApplet.message);
        window.setContentPane(theApplet);
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        window.pack();

        window.setSize(1000, 600);
        window.setLocationRelativeTo(null);

        window.setVisible(true);
    }
}
