package br.com.casadocodigo.loja.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import br.com.casadocodigo.loja.models.Produto;

public class ProdutoValidation implements Validator{

	private static final String CAMPO_REQUERIDO = "field.required";

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return Produto.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		
		ValidationUtils.rejectIfEmpty(errors, "titulo", CAMPO_REQUERIDO);
		ValidationUtils.rejectIfEmpty(errors, "descricao",CAMPO_REQUERIDO);
		Produto produto = (Produto) target;
		
		if(produto.getPaginas()<=0) {
			errors.rejectValue("paginas", CAMPO_REQUERIDO);
		}
		
	}
}
