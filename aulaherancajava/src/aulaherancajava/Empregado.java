package aulaherancajava;
import java.util.Date;
import java.util.GregorianCalendar;


public class Empregado {
    
    String nome;
    double salario;
    private Date dataContratacao;

    public Empregado(String n, double s, int ano, int mes, int dia) {
        this.nome = n;
        this.salario = s;
        GregorianCalendar calendar = new GregorianCalendar(ano, mes - 1, dia);
            dataContratacao = calendar.getTime();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Date getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(Date dataContratacao) {
        this.dataContratacao = dataContratacao;
    }
    public void promocao(double porcentagem)
    {
        double novoSalario = salario * porcentagem / 100;
        salario += novoSalario;
        }
    
    
    
}
