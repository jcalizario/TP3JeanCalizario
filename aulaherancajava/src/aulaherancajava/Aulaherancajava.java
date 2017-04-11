
package aulaherancajava;


/** * @author JEAN */
public class Aulaherancajava {
    
    public static void main(String[] args) {
     
   
        Gerente gerente = new Gerente("Andre", 3000, 1981, 12, 8);
        gerente.setBonus(10000);
        
        //EXERCICIO 3 
        Empregado Motorista= new Empregado("João", 1200, 2000, 7, 25);
        Empregado Secretaria = new Empregado ("Marcia", 1150, 2007, 3, 2);
        Empregado Contador = new Empregado ("Julio", 2700, 2007, 10, 15);
        
        Supervisor supervisor = new Supervisor("Marcos", 2500, 1992, 11, 29);
        Presidente presidente= new Presidente("José", 15000);
                
            
        System.out.println(gerente.salario);;
    }
    
}
