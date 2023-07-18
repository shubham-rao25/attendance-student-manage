/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vitmarksmanage;

import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class Main {
    public static void main(String[] args) throws InterruptedException{
        Welcome we=new Welcome();
        we.setVisible(true);
        try{
            for(int i=0;i<=100;i++){
                Thread.sleep(40);
                we.loadValue.setText(Integer.toString(i)+"%");
                
                Signup su=new Signup();
                if(i==10)
                    we.load.setText("Reaching modules...");
                if(i==20)
                    we.load.setText("Opening modules...");
                if(i==50)
                    we.load.setText("Connecting Database...");
                if(i==70)
                    we.load.setText("Database connected...");
                if(i==80)
                    we.load.setText("Opening Application");
                if(i==100){
                    we.dispose();
                    su.show();
                }
                we.loader.setValue(i);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
       
        
    }
}
