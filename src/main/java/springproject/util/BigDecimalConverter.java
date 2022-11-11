package springproject.util;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;


@Component
public class BigDecimalConverter {


    //Recebe string em formato monetario e converte
    public BigDecimal converter(String value){

        if ( value == null){
            return  null;
        }
        value = value.replace(".", "").replace(",", ".");
        return new BigDecimal(value);
    }


}
