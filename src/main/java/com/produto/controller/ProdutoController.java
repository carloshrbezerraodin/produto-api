package com.produto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.produto.model.Produto;
import com.produto.service.ProdutoService;

@CrossOrigin("*")
@RestController
@RequestMapping("/produto")
public class ProdutoController {
	
	@Autowired
	ProdutoService produtoService;
	
	@PostMapping("/salvar")
    public Produto salvar(@RequestBody Produto produto) throws Exception {
        try {
            return this.produtoService.salvarOrAtualizar(produto);
        } catch (Exception e) {
            throw new Exception();
        }
    }
	
	@PutMapping("/atualizar")
    public Produto atualizar(@RequestBody Produto produto) throws Exception {
        try {
            return this.produtoService.salvarOrAtualizar(produto);
        } catch (Exception e) {
            throw new Exception();
        }
    }
	
    @GetMapping("/listar")
    public List<Produto> listar() throws Exception {
        try {
            return this.produtoService.listar();
        } catch (Exception e) {
            throw new Exception();
        }
    }
    
    @GetMapping("/buscar/{id}")
    public Produto buscar(@PathVariable Long id) throws Exception {
        try {
            return this.produtoService.buscar(id);
        } catch (Exception e) {
            throw new Exception();
        }
    }
    
    
    @DeleteMapping("/deletar")
    public void excluri(@RequestBody Produto produto) throws Exception {
        try {
            this.produtoService.excluir(produto);
        } catch (Exception e) {
            throw new Exception();
        }
    }

}
