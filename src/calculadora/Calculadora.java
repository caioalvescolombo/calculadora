package calculadora;
import javax.swing.JOptionPane;

public class Calculadora {

    public static void main(String[] args) {
      double contador=1,r=0;
        while(contador!=0){
        double x = Double.parseDouble(JOptionPane.showInputDialog("informe o primeiro numero!"));
       String operador= JOptionPane.showInputDialog("informe o operador!");
       double y = Double.parseDouble(JOptionPane.showInputDialog("informe o segundo numero!"));
        
           r= calculador(y, y, operador);
//       switch(operador){
//           case "+":
//              r=x+y; 
//              break;
//           case "-":
//              r=x-y; 
//              break;
//           case "*":
//              r=x*y; 
//              break;
//           case "/":
//              r=x/y; 
//              break;
//                            
//       }
       JOptionPane.showMessageDialog (null, "O resultado de sua operacao e : "+r);
       int opcao= JOptionPane.showConfirmDialog(null,"Deseja Efetuar outra operacao?","Sair",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
    
        if(opcao==0){
            
            JOptionPane.showMessageDialog(null,"Informe a proxima operação!");
        }
        else{
            contador=0;
            JOptionPane.showMessageDialog(null,"Saida do programa efetuada com sucesso");
            
            
        }
            
        }
    }
    
    public static double calculador(double num1,double num2,String operation){
        double resultado=0;
        switch(operation){
           case "+":
              resultado=num1+num2; 
              break;
           case "-":
               resultado=num1-num2;
              break;
           case "*":
               resultado=num1*num2;
              break;
           case "/":
               resultado=num1/num2; 
              break;
                            
       }
        return resultado;
    }
    
}
