package br.scrumban;

public class CalculadoraComissao {

	public static float calcula(float valorVenda) {
		if (valorVenda == 0)
			return 0;
		
		float comissao=0;
		
		if (valorVenda <= 10000)
			comissao = valorVenda*0.05f;
		else
			comissao =  valorVenda*0.06f;
		
		comissao = ((float)Math.floor(comissao * 100))/100;
		
		return comissao;
		
	}

}
