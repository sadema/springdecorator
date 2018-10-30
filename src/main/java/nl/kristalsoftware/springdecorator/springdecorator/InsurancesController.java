package nl.kristalsoftware.springdecorator.springdecorator;

import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@NoArgsConstructor
@RestController
public class InsurancesController {

    @Autowired
//    @Qualifier("zeza_toggle_on")
    private InsuranceMapper insuranceMapper;

    @GetMapping(value = "/insurances")
    public Insurances getInsurances() {
        return insuranceMapper.build();
    }
}
