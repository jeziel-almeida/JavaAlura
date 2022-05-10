public class TesteReferencias {
    public static void main(String[] args) {

    Gerente g1 = new Gerente();    
    g1.setSalario(2200);

    EditorVideo ev = new EditorVideo();
    ev.setSalario(4040);

    ControleBonficacao controle = new ControleBonficacao();
    controle.registra(g1);
    controle.registra(ev);

    System.out.println(controle.getSoma());
    
    }
}
