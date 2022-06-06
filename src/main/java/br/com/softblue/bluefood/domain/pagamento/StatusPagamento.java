package br.com.softblue.bluefood.domain.pagamento;

public enum StatusPagamento {
		
		Autorizado("Autorizado"),
		NaoAutorizado("N�o autorizado pela isntitui��o financeira"),
		CartaoInvalido("Cart�o inv�lido ou bloqueado");
		
		String descricao;
		
		StatusPagamento(String descricao){
			
			this.descricao = descricao;
		}
		
		public String getDescricao() {
			
			return descricao;
		}
}
