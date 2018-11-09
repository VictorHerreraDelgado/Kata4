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
        String fileName = "C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Kata4\\email.txt";
        List<Mail> mailList;
        Histogram<String> histogram;
        HistogramDisplay histoDisplay;
        
    public static void main(String[] args) throws IOException{
        Kata4 k4 = new Kata4();
        k4.execute();
        
        
    }

    private void execute() throws IOException {
        input();
        process();
        output();
    }

    private void input() throws IOException {
       mailList = new MailListReader().read(fileName); 
    }

    private void process() {
        histogram = new MailHistogramBuilder().build(mailList);
        histoDisplay = new HistogramDisplay(histogram);
    }

    private void output() {
        new HistogramDisplay(histogram).execute();
    }
    
}
