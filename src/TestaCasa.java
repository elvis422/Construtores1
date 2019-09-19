
public class TestaCasa
{
    public static void main (String [] args)
    {
        Porta p1 = new Porta("rosa",1,2,3);
        p1.abre();
        Porta p2 = new Porta("cinza",2,3,4);
        p2.fecha();
        Porta p3 = new Porta("azul",4,5,6);
        p3.abre();
        Casa c1 = new Casa("preto",p1,p2,p3);
        
        
        System.out.println(c1.quantasPortasEstaoAbertas());
        
    }
}
