package br.com.teste.models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class EstoqueEntrada {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "estoque_entrada_id")
	private Long id;
	
	@OneToOne
	private Produto produto;
	
	@Column(name = "data")
	private Date data;
	
	@Column(name = "qtd_entrada")
	private Integer qtdEntrada;
	
	@Column(name = "valor_pago")
	private Integer valorPago;
	
	@ManyToOne
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

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Integer getQtdEntrada() {
		return qtdEntrada;
	}

	public void setQtdEntrada(Integer qtdEntrada) {
		this.qtdEntrada = qtdEntrada;
	}

	public Integer getValorPago() {
		return valorPago;
	}

	public void setValorPago(Integer valorPago) {
		this.valorPago = valorPago;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
	
}
