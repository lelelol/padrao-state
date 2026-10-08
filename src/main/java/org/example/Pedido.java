package org.example;

public class Pedido {
    
    private String codigo;
    private PedidoEstado estado;    

    public Pedido() {
        this.estado = PedidoEstadoPendente.getInstance();
    }
    
    public void setEstado(PedidoEstado estado) {
        this.estado = estado;
    }
    
    public boolean pagar() {
        return estado.pagar(this);
    }
    
    public boolean enviar() {
        return estado.enviar(this);
    }
    
    public boolean cancelar() {
        return estado.cancelar(this);
    }

    public String getNomeEstado() {
        return estado.getEstado();
    }
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public PedidoEstado getEstado() {
        return estado;
    }    
}
