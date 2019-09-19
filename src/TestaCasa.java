
public class TestaCasa
{
    public static void main (String [] args)
    {
        Porta p1 = new Porta(true,"rosa",1,2,3);
        p1.fecha();
        Porta p2 = new Porta(false,"cinza",2,3,4);
        p2.fecha();
        Porta p3 = new Porta(true,"azul",4,5,6);
        p3.abre();
        Casa c1 = new Casa("preto",p1,p2,p3);
        
        c1.setCor(" Rosa ");
        
        
        
        c1.setPorta1(p1);
        c1.setPorta2(p2);
        c1.setPorta3(p3);
        
        System.out.println(c1.quantasPortasEstaoAbertas());
        
    }
}
