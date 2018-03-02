/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jaspertest;

import frames.testFrame;

/**
 *
 * @author Sandman
 */
public class JasperTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        try {
//            JasperReport compilereport= JasperCompileManager.compileReport(JasperTest.class.getResourceAsStream("/jasper/reports/helloJasper.jrxml"));
//            JasperPrint fillReport = JasperFillManager.fillReport(compilereport, new HashMap<>(), new JREmptyDataSource());
//            JasperViewer.viewReport(fillReport);
//        } catch (JRException ex) {
//            Logger.getLogger(JasperTest.class.getName()).log(Level.SEVERE, null, ex);
//        }
new testFrame().setVisible(true);
        
    }
    
}
