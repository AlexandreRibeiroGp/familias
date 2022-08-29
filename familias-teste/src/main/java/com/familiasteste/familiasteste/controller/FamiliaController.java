package com.familiasteste.familiasteste.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.familiasteste.familiasteste.service.FamiliaService;
import com.familiasteste.familiasteste.vo.FamiliaVO;
import com.familiasteste.familiasteste.vo.params.FamiliaParamVO;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(path = "/v1/familia", produces = { MediaType.APPLICATION_JSON_VALUE })

@Api(tags = "Familia (/familia)", description = "Lista de endpoints para utilização de pontução de famílias")
public class FamiliaController {

	@Autowired
	private FamiliaService familiaService;

	@PostMapping
	@ApiOperation(value = "informa familias para classificação", nickname = "familia")
	public List<FamiliaVO> classificar(@RequestBody final FamiliaParamVO params) throws Exception {
		final List<FamiliaVO> response = this.familiaService.classificar(params);
		return response;
	}

}
