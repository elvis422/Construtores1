
public class TestaAluno {
    
    
    public static void main (String [] args)
    {
        Data d1= new Data(03,10,1998);
        Aluno a1= new Aluno("Maike Soreas", "000",d1);
        
        System.out.println(a1.imprimir());
    }
  
    
}
