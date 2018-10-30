package nl.kristalsoftware.springdecorator.springdecorator;

import org.springframework.stereotype.Service;

//@Service
public class InsuranceDecoratorMapper extends InsuranceMapper {

    @Override
    public Insurances build() {
        Insurances insurances = super.build();
        insurances.setName("Deze zeza mag niet getoond worden");
        return insurances;
    }

}
