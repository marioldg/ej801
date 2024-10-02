package Ejercicio_Inicial;

public enum TipoPago {
	    TARJETA('T', "Tarjeta de Crédito", 1),
	    EFECTIVO('E', "Pago en Efectivo"),
	    TRANSFERENCIA('R', "Transferencia Bancaria");

	    private char codigo;
	    private String descripcion;
	    private int num;

	    // Constructor
	    TipoPago(char codigo, String descripcion, int num) {
	        this.codigo = codigo;
	        this.descripcion = descripcion;
	        this.num=num;
	    }

	    // Getter para código
	    public char getCodigo() {
	        return codigo;
	    }

	    // Getter para descripción
	    public String getDescripcion() {
	        return descripcion;
	    }
	}

