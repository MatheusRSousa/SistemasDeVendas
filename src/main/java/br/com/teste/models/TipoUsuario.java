package br.com.teste.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TipoUsuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "tipousuario_id")
	private Long id;
	
	@Column(name = "tipo", nullable = false)
	private String tipo;
	
	@Column(name = "gerencia", nullable = false)
	private boolean gerencia;
	
	@Column(name = "caixa")
	private boolean caixa;
	
	@Column(name = "pdv")
	private boolean pdv;
	
	@Column(name = "controle_cliente")
	private boolean controleCliente;

	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public boolean isGerencia() {
		return gerencia;
	}

	public void setGerencia(boolean gerencia) {
		this.gerencia = gerencia;
	}

	public boolean isCaixa() {
		return caixa;
	}

	public void setCaixa(boolean caixa) {
		this.caixa = caixa;
	}

	public boolean isPdv() {
		return pdv;
	}

	public void setPdv(boolean pdv) {
		this.pdv = pdv;
	}

	public boolean isControleCliente() {
		return controleCliente;
	}

	public void setControleCliente(boolean controleCliente) {
		this.controleCliente = controleCliente;
	}

	
	
}
