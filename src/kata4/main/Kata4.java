/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata4.main;

import java.io.IOException;
import java.util.List;
import kata4.model.Histogram;
import kata4.model.Mail;
import kata4.view.HistogramDisplay;
import kata4.view.MailHistogramBuilder;
import kata4.view.MailListReader;

/**
 *
 * @author Usuario
 */
public class Kata4 {
    public static void main(String[] args) throws IOException{
        String fileName = "C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Kata4\\email.txt";
        //MailListReader a = 
        List<Mail> mailList = new MailListReader().read(fileName);
        Histogram<String> histogram = new MailHistogramBuilder().build(mailList);
        HistogramDisplay histoDisplat = new HistogramDisplay(histogram);
        new HistogramDisplay(histogram).execute();
    }
    
}
