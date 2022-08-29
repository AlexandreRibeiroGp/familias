package com.familiasteste.familiasteste.repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.familiasteste.familiasteste.vo.DependetesVO;
import com.familiasteste.familiasteste.vo.FamiliaVO;
import com.familiasteste.familiasteste.vo.params.FamiliaParamVO;

@Service
public class FamiliaClasificaoService extends FamiliaClassificacao {

	public List<FamiliaVO> classificarFamilia(FamiliaParamVO params) {
		List<FamiliaVO> listFamilia = new ArrayList<FamiliaVO>();

		params.getListaFamilia().forEach(i -> {
			listFamilia.add(FamiliaVO.builder().nomeFamilia(i.getNomeFamilia()).depedentes(i.getDepedentes())
					.rendaFamilia(i.getRendaFamilia()).build());
		});

		for (FamiliaVO familiaVO : listFamilia) {
			int contadorDependentesMaior = 0;
			for (DependetesVO dependetesVo : familiaVO.getDepedentes()) {
				if (dependetesVo.getIdade() < 18 && familiaVO.getDepedentes().size() >= 3) {
					contadorDependentesMaior = contadorDependentesMaior + 1;
				}
			}
			if (familiaVO.getRendaFamilia().compareTo(new BigDecimal(900)) <= 0) {
				familiaVO.setPontuacao(5L);
			} else {
				familiaVO.setPontuacao(3L);
			}
			if (contadorDependentesMaior >= 3) {
				familiaVO.setPontuacao(familiaVO.getPontuacao() + 3L);
			} else {
				familiaVO.setPontuacao(familiaVO.getPontuacao() + 2L);
			}

		}

		return listFamilia;
	}

}
