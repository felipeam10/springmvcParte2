package br.com.felipe.mvc.sprgmvc2.api;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.felipe.mvc.sprgmvc2.interceptor.InterceptadorDeAcessos;
import br.com.felipe.mvc.sprgmvc2.interceptor.InterceptadorDeAcessos.Acesso;

@RequestMapping("acessos")
@RestController
public class AcessosRest {

	@GetMapping
	public List<Acesso> getAcessos() {
		return InterceptadorDeAcessos.acessos;
	}
}
