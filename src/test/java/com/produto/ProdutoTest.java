package com.produto;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.produto.model.Produto;
import com.produto.service.ProdutoService;

@SpringBootTest
public class ProdutoTest {
	
	
	@Autowired
	ProdutoService produtoSerivce;
	

	@Test
	public void testSalvarProduto() throws Exception {

		Produto produto = Produto.builder().nome("Teste produto").quantidade(12).build();
		Produto produtoDB = produtoSerivce.salvarOrAtualizar(produto);
		assertEquals(produto.getNome(), produtoDB.getNome());
	}

	@Test
	public void testListarProduto() throws Exception {
		
		List<Produto> listarProduto = produtoSerivce.listar();
		
		assertTrue(listarProduto.size() > 0);

	}
	
}
