package nl.kristalsoftware.springdecorator.springdecorator;

import org.springframework.stereotype.Service;

//@Service
public class InsuranceMapper {

    public Insurances build() {
        return new Insurances();
    }

}
