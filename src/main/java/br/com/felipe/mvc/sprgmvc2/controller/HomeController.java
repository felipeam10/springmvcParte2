package br.com.felipe.mvc.sprgmvc2.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.felipe.mvc.sprgmvc2.model.Pedido;
import br.com.felipe.mvc.sprgmvc2.model.StatusPedido;
import br.com.felipe.mvc.sprgmvc2.repository.PedidoRepository;

@Controller
@RequestMapping("/home")
public class HomeController {
	
	@Autowired
	private PedidoRepository repository;
	
	@GetMapping()
	public String home(Model model, Principal principal) {
		List<Pedido> pedidos = repository.findByStatus(StatusPedido.ENTREGUE);
		model.addAttribute("pedidos", pedidos);
		return "home"; 
	}
}
