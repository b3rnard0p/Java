package jogorapido2;

public class PessoaJuridica extends Pessoa{
	
	protected String cnpj;
	protected String socio;
	protected String dtAbertura;
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getSocio() {
		return socio;
	}
	public void setSocio(String socio) {
		this.socio = socio;
	}
	public String getDtAbertura() {
		return dtAbertura;
	}
	public void setDtAbertura(String dtAbertura) {
		this.dtAbertura = dtAbertura;
	}
	
	
}
