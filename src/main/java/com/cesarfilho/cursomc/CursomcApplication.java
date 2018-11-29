package com.cesarfilho.cursomc;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cesarfilho.cursomc.dominio.Categoria;
import com.cesarfilho.cursomc.dominio.Cidade;
import com.cesarfilho.cursomc.dominio.Cliente;
import com.cesarfilho.cursomc.dominio.Endereco;
import com.cesarfilho.cursomc.dominio.Estado;
import com.cesarfilho.cursomc.dominio.Produto;
import com.cesarfilho.cursomc.dominio.enums.TipoCliente;
import com.cesarfilho.cursomc.repositories.CategoriaRepository;
import com.cesarfilho.cursomc.repositories.CidadeRepository;
import com.cesarfilho.cursomc.repositories.ClienteRepository;
import com.cesarfilho.cursomc.repositories.EnderecoRepository;
import com.cesarfilho.cursomc.repositories.EstadoRepository;
import com.cesarfilho.cursomc.repositories.ProdutoRepository;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {
	
	@Autowired
	CategoriaRepository categoriaRepository;
	@Autowired
	ProdutoRepository produtoRepository;
	@Autowired
	EstadoRepository estadoRepository;
	@Autowired
	CidadeRepository cidadeRepository;
	@Autowired
	ClienteRepository clienteRepository;
	@Autowired
	EnderecoRepository enderecoRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	
	public void run(String... args) throws Exception {
		
		Categoria cat1 = new Categoria(null, "Informática");
		Categoria cat2 = new Categoria(null, "Escritório");
		
		
		Produto p1 = new Produto(null, "Computador", 2000.00);
		Produto p2 = new Produto(null, "Impressora", 800.00);
		Produto p3 = new Produto(null, "Mouse", 80.00);
		
		p1.getCategorias().addAll(Arrays.asList(cat1));
		p2.getCategorias().addAll(Arrays.asList(cat1,cat2));
		p3.getCategorias().addAll(Arrays.asList(cat1));
		
		cat1.getProdutos().addAll(Arrays.asList(p1,p2,p3));
		cat2.getProdutos().addAll(Arrays.asList(p1));
		
		categoriaRepository.saveAll(Arrays.asList(cat1,cat2));
		produtoRepository.saveAll(Arrays.asList(p1,p2,p3));
		

		
		Estado est1 = new Estado(null,"Minas Gerais");
		Estado est2 = new Estado(null,"Ceará");
		
		Cidade c1 = new Cidade(null, "Uberlandia", est1);
		Cidade c2 = new Cidade(null, "Fortaleza", est2);
		Cidade c3 = new Cidade(null, "Aracati", est2);
		
		est1.getCidades().add(c1);
		est2.getCidades().addAll(Arrays.asList(c2,c3));
		
		estadoRepository.saveAll(Arrays.asList(est1,est2));
		cidadeRepository.saveAll(Arrays.asList(c1,c2,c3));
		
		Cliente cli1 = new Cliente(null, "Maria da Silva", "maria@gmail.com", "12345678909", TipoCliente.PESSOAFISICA);
		cli1.getTelefones().addAll(Arrays.asList("234234234","987987987"));
		
		Endereco e1 = new Endereco(null, "Rua Flores", "300", "Apto 303", "Jardim", "38220834", cli1, c1);
		Endereco e2 = new Endereco(null, "Avenida Matos", "105", "Sala 800", "Centro", "38777012", cli1, c2);
		
		cli1.getEnderecos().addAll(Arrays.asList(e1,e2));
		
		clienteRepository.saveAll(Arrays.asList(cli1));
		enderecoRepository.saveAll(Arrays.asList(e1,e2));
	}
}
