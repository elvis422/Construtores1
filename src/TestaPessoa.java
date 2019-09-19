public class TestaPessoa{
    
    public static void main(String [] args){
        Pessoa p1= new Pessoa("Maike",20);
        p1.setNome(" Maike Soares ");
        
        p1.fazAniversario();
        p1.fazAniversario();
        p1.fazAniversario();
        
        String dados = p1.getNome()+"\n"+p1.getIdade();
        System.out.println(dados);
    }
}