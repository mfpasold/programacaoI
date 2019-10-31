package aula3010;

public class TestePedido {
    
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Jonathan");
        Produto p1 = new Produto("X-Salada", 15.00);
        Itens item1 = new Itens(p1, 2);
        Pedido pedido = new Pedido(1, c1);
        
        pedido.adicionarItem(item1);
        
        System.out.println(pedido);
    }
}
