package aulaherancajava;
public class Gerente extends Empregado {
    private double bonus;

    public Gerente(String n, double s, int ano, int mes, int dia) {
        super(n, s, ano, mes, dia);
        
        bonus =0;
    } 

 
    @Override // reescrita.
     public double getSalario()
    {
     this.salario= salario+ bonus;           
        return salario;
    }
    public void setBonus(double b)
    {
    bonus = b;
}
} 

    

