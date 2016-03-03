package com.lifuz.validator;

import com.lifuz.utils.IDCard;
import com.opensymphony.xwork2.validator.ValidationException;
import com.opensymphony.xwork2.validator.validators.FieldValidatorSupport;

public class IdCardValidator extends FieldValidatorSupport {

	@Override
	public void validate(Object arg0) throws ValidationException {
		String fieldName = getFieldName();
		Object value = getFieldValue(fieldName, arg0);
		
		IDCard idCard = new IDCard();
		
		if(value != null) {
			boolean result = idCard.Verify((String) value);
			
			if (!result) {
				addFieldError(fieldName, arg0);
			}
		}

	}

}
