package com.familiasteste.familiasteste.vo;

import java.math.BigDecimal;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class FamiliaVO {
	

	
	 private String nomeFamilia;
	 private BigDecimal rendaFamilia;
	 private List<DependetesVO> depedentes;
	 private Long pontuacao;
	 
	
}
