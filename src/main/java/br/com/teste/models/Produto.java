package br.com.teste.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;



@Entity
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "produto_id")
	private Long id;
	
	@Column(name = "cod_barras")
	private String codBarras;
	
	@ManyToMany
	@JoinTable
	private List<Categoria> categoria;
	
	@Column(name = "qtd_estoque")
	private Double qtdEstoque;
	
	@ManyToOne
	@JoinColumn
	private TipoUnidade tipoUnidade;
	
	@Column(name = "tamanho_unidade")
	private Double tamanhoUnidade;
	
	@Column(name = "comercializavel")
	private boolean comercializavel;
	
	@Column(name = "valor_usuario_venda")
	private Double valorUsuarioVenda;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodBarras() {
		return codBarras;
	}

	public void setCodBarras(String codBarras) {
		this.codBarras = codBarras;
	}

	public List<Categoria> getCategoria() {
		return categoria;
	}

	public void setCategoria(List<Categoria> categoria) {
		this.categoria = categoria;
	}

	public Double getQtdEstoque() {
		return qtdEstoque;
	}

	public void setQtdEstoque(Double qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}

	public TipoUnidade getTipoUnidade() {
		return tipoUnidade;
	}

	public void setTipoUnidade(TipoUnidade tipoUnidade) {
		this.tipoUnidade = tipoUnidade;
	}

	public Double getTamanhoUnidade() {
		return tamanhoUnidade;
	}

	public void setTamanhoUnidade(Double tamanhoUnidade) {
		this.tamanhoUnidade = tamanhoUnidade;
	}

	public boolean isComercializavel() {
		return comercializavel;
	}

	public void setComercializavel(boolean comercializavel) {
		this.comercializavel = comercializavel;
	}

	public Double getValorUsuarioVenda() {
		return valorUsuarioVenda;
	}

	public void setValorUsuarioVenda(Double valorUsuarioVenda) {
		this.valorUsuarioVenda = valorUsuarioVenda;
	}
	
	
	
}
