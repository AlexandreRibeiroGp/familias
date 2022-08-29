package com.familiasteste.familiasteste.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.familiasteste.familiasteste.repository.FamiliaClassificacao;
import com.familiasteste.familiasteste.vo.FamiliaVO;
import com.familiasteste.familiasteste.vo.params.FamiliaParamVO;

@Service
public class FamiliaService {

	@Autowired
	private FamiliaClassificacao familiaClassificacao;

	public List<FamiliaVO> classificar(FamiliaParamVO params) throws Exception {

		List<FamiliaVO> listaClissificada = this.familiaClassificacao.classificarFamilia(params);
		return listaClissificada;
	}

}
