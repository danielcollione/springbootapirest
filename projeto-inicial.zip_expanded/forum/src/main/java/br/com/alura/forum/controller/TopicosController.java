package br.com.alura.forum.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.forum.controller.dto.TopicoDto;
import br.com.alura.forum.modelo.Curso;
import br.com.alura.forum.modelo.Topico;

@RestController //Tells spring not to browse as page in every method
public class TopicosController {
	
	@RequestMapping("/topicos")
	//@ResponseBody Tells spring not to browse as page
	public List<TopicoDto> lista() {
		Topico topico = new Topico("Duvidas", "Duvida com Java", new Curso("Spring", "Programacao"));
		
		return TopicoDto.converter(Arrays.asList(topico, topico, topico));
	}
	
}
