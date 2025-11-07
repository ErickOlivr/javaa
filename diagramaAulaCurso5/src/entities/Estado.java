package entities;

public class Estado {
	private Estado aoLerZero;
	private Estado aoLerUm;
	private boolean ehEstadoAceitacao;
	private Estado proximoEstado;
	
	public Estado(boolean ehEstadoAceitacao) {
		this.ehEstadoAceitacao = ehEstadoAceitacao;
	}

	public Estado getAoLerZero() {
		return aoLerZero;
	}

	public void setAoLerZero(Estado aoLerZero) {
		this.aoLerZero = aoLerZero;
	}

	public Estado getAoLerUm() {
		return aoLerUm;
	}

	public void setAoLerUm(Estado aoLerUm) {
		this.aoLerUm = aoLerUm;
	}

	public boolean isEhEstadoAceitacao() {
		return ehEstadoAceitacao;
	}

	public void setEhEstadoAceitacao(boolean ehEstadoAceitacao) {
		this.ehEstadoAceitacao = ehEstadoAceitacao;
	}

	public Estado getProximoEstado(char c) {
		Estado resp = null;
		if(c == '0') {
			resp = aoLerZero;
		}else if(c == '1') {
			resp =aoLerUm;
		}
		return resp;
	}

	public void setProximoEstado(Estado proximoEstado) {
		this.proximoEstado = proximoEstado;
	}
	
}
