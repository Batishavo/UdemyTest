package org.romero.junit5.ejemplos.models;

import java.math.BigDecimal;


public class Cuenta {
    private String persona;
    private BigDecimal saldo;

    public java.lang.String getPersona() {
        return persona;
    }

    public void setPersona(java.lang.String persona) {
        this.persona = persona;
    }

	public BigDecimal getSaldo() {
		return saldo;
	}

	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}

}
