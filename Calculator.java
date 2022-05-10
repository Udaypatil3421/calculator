/*
        creating Calculator in java

    By Uday Patil
*/
// importing packages
import java.awt.*;
import java.awt.event.*;

// code started here
public class Calculator extends WindowAdapter implements ActionListener
{

    Frame f = new Frame("Calculator");
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0;
    Button badd,bsub,bmul,bdiv,bmod,bpt,clear,equal;

    TextField tf = new TextField(30);
    double xd,num1,num2,check;

    Label l,l1;
    //FOR CLOSING THE WINDOW
    public void windowClosing(WindowEvent e) {
       f.dispose();
    }
                      
    // constructor
    public Calculator()
    {
            

    
    // creating buttons
    b1 = new Button("1");
        b1.setBounds(50,150,50,50);
    b2 = new Button("2");
        b2.setBounds(100,150,50,50);
    b3 = new Button("3");
        b3.setBounds(150,150,50,50);
    b4 = new Button("4");
        b4.setBounds(50,200,50,50);
    b5 = new Button("5");
        b5.setBounds(100,200,50,50);
    b6 = new Button("6");
        b6.setBounds(150,200,50,50);
    b7 = new Button("7");
        b7.setBounds(50,250,50,50);
    b8 = new Button("8");
        b8.setBounds(100,250,50,50);
    b9 = new Button("9");
        b9.setBounds(150,250,50,50);
    b0 = new Button("0");
        b0.setBounds(100,300,50,50);

    badd = new Button("+");
        badd.setBounds(200,150,50,50);
    bsub = new Button("-");
        bsub.setBounds(200,200,50,50);
    bmul = new Button("*");
        bmul.setBounds(200,250,50,50);
    bdiv = new Button("/");
        bdiv.setBounds(200,300,50,50);
    bmod = new Button("%");
        bmod.setBounds(50,300,50,50);
    bpt = new Button(".");
        bpt.setBounds(150,300,50,50);

    clear = new Button("Clear");
        clear.setBounds(50,350,100,50);
    
    equal = new Button("Equal");
        equal.setBounds(150,350,100,50);
    
        tf.setBounds(23,80,250,50);


        // setting size and title
        f.setVisible(true);
        f.setSize(300,450);
        f.setLayout(null);
        f.setTitle("calculator by uday patil");
        
        // editing label
        l = new Label("My Simple Calculator");
            l.setBounds(70,20,150,50);
        l1 = new Label("");
            l1.setBounds(50,80,250,50);
        

        // adding lable on frame
        f.add(l);
        // adding another label on frame
        f.add(l1);
        // adding textfield on panel
        // f.add(tf);
        // adding buttons on panel
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);
        f.add(b8);
        f.add(b9);
        f.add(b0);

        f.add(badd);
        f.add(bsub);
        f.add(bmul);
        f.add(bdiv);
        f.add(bmod);
        f.add(bpt);
        f.add(clear);
        f.add(equal);

        // registration of buttons for actionListner

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);

        badd.addActionListener(this);
        bsub.addActionListener(this);
        bmul.addActionListener(this);
        bdiv.addActionListener(this);
        bmod.addActionListener(this);
        bpt.addActionListener(this);
        clear.addActionListener(this);
        equal.addActionListener(this);



        
    }

    // Abstract method
    public void actionPerformed(ActionEvent e)
    {

        String z,zt;

        if(e.getSource()==b1){
            zt=l1.getText();
             z=zt+"1";
             l1.setText(z);
           }
           if(e.getSource()==b2){
           zt=l1.getText();
           z=zt+"2";
           l1.setText(z);
           }
           if(e.getSource()==b3){
             zt=l1.getText();
             z=zt+"3";
             l1.setText(z);
           }
           if(e.getSource()==b4){
             zt=l1.getText();
             z=zt+"4";
             l1.setText(z);
           }
           if(e.getSource()==b5){
             zt=l1.getText();
             z=zt+"5";
             l1.setText(z);
           }
           if(e.getSource()==b6){
             zt=l1.getText();
             z=zt+"6";
             l1.setText(z);
           }
           if(e.getSource()==b7){
             zt=l1.getText();
             z=zt+"7";
             l1.setText(z);
           }
           if(e.getSource()==b8){
             zt=l1.getText();
             z=zt+"8";
             l1.setText(z);
           }
           if(e.getSource()==b9){
             zt=l1.getText();
             z=zt+"9";
             l1.setText(z);
           }
           if(e.getSource()==b0){
             zt=l1.getText();
             z=zt+"0";
             l1.setText(z);
           }
           if(e.getSource()==bpt){  //ADD DECIMAL PTS
            zt=l1.getText();
            z=zt+".";
            l1.setText(z);
          }
          /*
          if(e.getSource()==bback){  // FOR  BACKSPACE
            zt=l1.getText();
            try{
              z=zt.substring(0, zt.length()-1);
              }catch(StringIndexOutOfBoundsException f){return;}
            l1.setText(z);
          }*/

              //AIRTHMETIC BUTTON
              if(e.getSource()==badd){                     //FOR ADDITION
                try{
                  num1=Double.parseDouble(l1.getText());
                  }catch(NumberFormatException f){
                    l1.setText("Invalid Format");
                    return;
                  }
                z="";
                l1.setText(z);
                check=1;
              }
              if(e.getSource()==bsub){                    //FOR SUBTRACTION
                try{
                  num1=Double.parseDouble(l1.getText());
                  }catch(NumberFormatException f){
                    l1.setText("Invalid Format");
                    return;
                  }
                z="";
                l1.setText(z);
                check=2;
              }
              if(e.getSource()==bmul){                   //FOR MULTIPLICATION
                try{
                  num1=Double.parseDouble(l1.getText());
                  }catch(NumberFormatException f){
                    l1.setText("Invalid Format");
                    return;
                  }
                z="";
                l1.setText(z);
                check=3;
              }
              if(e.getSource()==bdiv){                   //FOR DIVISION
                try{
                  num1=Double.parseDouble(l1.getText());
                  }catch(NumberFormatException f){
                    l1.setText("Invalid Format");
                    return;
                  }
                z="";
                l1.setText(z);
                check=4;
              }
              if(e.getSource()==bmod){                  //FOR MOD/REMAINDER
                try{
                  num1=Double.parseDouble(l1.getText());
                  }catch(NumberFormatException f){
                    l1.setText("Invalid Format");
                    return;
                  }
                z="";
                l1.setText(z);
                check=5;
              }
                                       //RESULT BUTTON
              if(e.getSource()==equal){          
                try{
                  num2=Double.parseDouble(l1.getText());
                  }catch(Exception f){
                    l1.setText("ENTER NUMBER FIRST ");
                    return;
                  }
                if(check==1)
                  xd =num1+num2;
                if(check==2)
                  xd =num1-num2;
                if(check==3)
                  xd =num1*num2;
                if(check==4)
                  xd =num1/num2; 
                if(check==5)
                  xd =num1%num2;    
                l1.setText(String.valueOf(xd));
              }
                                      //FOR CLEARING THE LABEL and Memory
              if(e.getSource()==clear){
                num1=0;
                num2=0;
                check=0;
                xd=0;
                 z="";
                 l1.setText(z);
                } 
              
    }


    public void close(){}
    // main method
    public static void main(String[] args) {
        Calculator c = new Calculator();


        c.close();
    }
}
