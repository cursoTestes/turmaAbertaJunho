package br.scrumban;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class TestCalculadoraComissao {
	
	@Test
	public void calcula_comissao_venda_zeroreais_espera_zero_de_comissao() {
		float valorVenda = 0.f;
		float valorComissaoEsperado = 0;
		
		float comissao = CalculadoraComissao.calcula(valorVenda);
		
		assertEquals(valorComissaoEsperado, comissao, 0.0f);
	}
	
	@Test
	public void calcula_comissao_venda_10000reais_espera_500_de_comissao() {
		float valorVenda = 10000;
		float valorComissaoEsperado = 500;
		
		float comissao = CalculadoraComissao.calcula(valorVenda);
		
		assertEquals(valorComissaoEsperado, comissao, 0.0f);
	}
	
	@Test
	public void calcula_comissao_venda_10reais_espera_50_centavos_de_comissao() {
		float valorVenda = 10;
		float valorComissaoEsperado = 0.5f;
		
		float comissao = CalculadoraComissao.calcula(valorVenda);
		
		assertEquals(valorComissaoEsperado, comissao, 0.0f);
	}
	
	@Test
	public void calcula_comissao_venda_100000reais_espera_6000_de_comissao() {
		float valorVenda = 100000;
		float valorComissaoEsperado = 6000;
		
		float comissao = CalculadoraComissao.calcula(valorVenda);
		
		assertEquals(valorComissaoEsperado, comissao, 0.0f);
	}
	
	@Test
	public void calcula_comissao_venda_1000000reais_espera_60000_de_comissao() {
		float valorVenda = 1000000;
		float valorComissaoEsperado = 60000;
		
		float comissao = CalculadoraComissao.calcula(valorVenda);
		
		assertEquals(valorComissaoEsperado, comissao, 0.0f);
	}
	
	@Test
	public void calcula_comissao_venda_55reais_59centavos_espera_2reais_77centavos_de_comissao() {
		float valorVenda = 55.59f;
		float valorComissaoEsperado = 2.77f;
		
		float comissao = CalculadoraComissao.calcula(valorVenda);
		
		assertEquals(valorComissaoEsperado, comissao, 0.0f);
	}
}
