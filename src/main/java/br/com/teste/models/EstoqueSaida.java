package br.com.teste.models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class EstoqueSaida {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "estoque_saida_id")
	private Long id;
	
	@ManyToOne
	@JoinColumn
	private Produto produto;
	
	@Column(name = "justificativa")
	private String justificativa;
	
	@Column(name = "data")
	private Date data;
	
	@Column(name = "voltou_estoque")
	private boolean voltouEstoque;
	
	@ManyToOne
	@JoinColumn
	private Usuario usuario;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public String getJustificativa() {
		return justificativa;
	}

	public void setJustificativa(String justificativa) {
		this.justificativa = justificativa;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public boolean isVoltouEstoque() {
		return voltouEstoque;
	}

	public void setVoltouEstoque(boolean voltouEstoque) {
		this.voltouEstoque = voltouEstoque;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
	
}
