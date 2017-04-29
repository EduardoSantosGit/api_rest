package br.com.api.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

import br.com.api.enums.StatusCartao;
import br.com.api.vo.RequestWrapperVO;

@RestController
@RequestMapping("pagamento")
public class PagamentoCartaoController {
	
	@ResponseBody
	@RequestMapping(method=RequestMethod.POST,produces="application/json; charset=UTF-8")
	public ResponseEntity<String> realizaPagamento(@RequestBody RequestWrapperVO requestWrapperVO){
		
		Map<String, Object> retorno = new HashMap<String, Object>();
		Gson gson = new Gson();
		
		requestWrapperVO.setStatusCartao(StatusCartao.APROVADO);
		
		retorno.put("ok", "200");
		retorno.put("resposta", requestWrapperVO);
		return new ResponseEntity<String>(gson.toJson(retorno) , HttpStatus.OK);
		
	}
	
	
	
	
}
