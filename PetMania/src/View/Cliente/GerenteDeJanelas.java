
package View.Cliente;

import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

public class GerenteDeJanelas {
    
    private static JDesktopPane jDP_User;
    
    public GerenteDeJanelas (JDesktopPane JDesktopPane){
        GerenteDeJanelas.jDP_User=JDesktopPane;
    }
    
    public void abrirJanela(JInternalFrame JInternalFrame){
        if(JInternalFrame.isVisible()){
           JInternalFrame.toFront();
           JInternalFrame.requestFocus();
        }else{
           jDP_User.add(JInternalFrame);
           JInternalFrame.setVisible(true);
        }
    }
    
}
