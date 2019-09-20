public class TestaPessoa{
    
    public static void main(String [] args){
        Pessoa p1= new Pessoa("Elvis",20);
        p1.setNome("Elvis Cadorso");
        
        p1.fazAniversario();
        p1.fazAniversario();
        p1.fazAniversario();
        
        String dados = p1.getNome()+"\n"+p1.getIdade();
        System.out.println(dados);
    }
}