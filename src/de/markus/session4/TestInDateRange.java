package de.markus.session4;

import java.util.Date;
import java.util.Set;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import org.joda.time.LocalDate;

public class TestInDateRange {
	
private static Validator validator;
    
    @BeforeClass
    public static void setUp() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }
    
    @Test
    public void testDateRange() {
        SomeBean test = new SomeBean();
        test.date = new LocalDate(10001, 01, 01).toDate();
        
        Set<ConstraintViolation<TestClass>> validate = validator.validate(test);
        System.out.println(validate);
        assertEquals(1, validate.size());
        assertEquals("date", validate.iterator().next().getPropertyPath().toString());
    }
    
    
    
    /*
    --> Mit Markus:
    
    https://sterl.org/2015/06/java-jsr-validation-for-dates/
    
    */
    

}
