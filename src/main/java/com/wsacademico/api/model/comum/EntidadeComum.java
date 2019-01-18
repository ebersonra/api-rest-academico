package com.wsacademico.api.model.comum;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@MappedSuperclass
public abstract class EntidadeComum {
	
	private Long ident;
	private Long idUsuarioCadastrou;
	private LocalDate dataCadastro;
	private LocalDate dataExclusao;
	private LocalDate dataUltimoAcesso;
	private LocalDate dataDesativacao;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="IDENT")
	public Long getIdent() {
		return ident;
	}
	public void setIdent(Long ident) {
		this.ident = ident;
	}
	
	@Column(name="ID_USUARIO_CADASTROU")
	public Long getIdUsuarioCadastrou() {
		return idUsuarioCadastrou;
	}
	public void setIdUsuarioCadastrou(Long idUsuarioCadastrou) {
		this.idUsuarioCadastrou = idUsuarioCadastrou;
	}
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@Column(name="DATA_CADASTRO")
	@Temporal(TemporalType.DATE)
	public LocalDate getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@Column(name="DATA_EXCLUSAO")
	@Temporal(TemporalType.DATE)
	public LocalDate getDataExclusao() {
		return dataExclusao;
	}
	public void setDataExclusao(LocalDate dataExclusao) {
		this.dataExclusao = dataExclusao;
	}
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@Column(name="DATA_ULTIMO_ACESSO")
	@Temporal(TemporalType.DATE)
	public LocalDate getDataUltimoAcesso() {
		return dataUltimoAcesso;
	}
	public void setDataUltimoAcesso(LocalDate dataUltimoAcesso) {
		this.dataUltimoAcesso = dataUltimoAcesso;
	}
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@Column(name="DATA_DESATIVACAO")
	@Temporal(TemporalType.DATE)
	public LocalDate getDataDesativacao() {
		return dataDesativacao;
	}
	public void setDataDesativacao(LocalDate dataDesativacao) {
		this.dataDesativacao = dataDesativacao;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ident == null) ? 0 : ident.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EntidadeComum other = (EntidadeComum) obj;
		if (ident == null) {
			if (other.ident != null)
				return false;
		} else if (!ident.equals(other.ident))
			return false;
		return true;
	}
}
