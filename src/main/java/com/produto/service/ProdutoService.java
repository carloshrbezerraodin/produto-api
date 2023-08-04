package com.produto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.produto.model.Produto;
import com.produto.repository.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	ProdutoRepository produtoRepository;

	public void excluir(Produto produto) throws Exception {
		produtoRepository.delete(produto);
	}

	public Produto salvarOrAtualizar(Produto produto) throws Exception {
		return produtoRepository.save(produto);
	}

	public List<Produto> listar() throws Exception {
		return produtoRepository.findAll();
	}
	
	
	public Produto buscar(Long id) throws Exception {
		return produtoRepository.findById(id).get();
	}

}
