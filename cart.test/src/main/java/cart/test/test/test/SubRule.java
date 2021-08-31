package cart.test.test.test;



import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.When;

import cart.test.test.SampleRule;
import cart.test.test.SubRuleAnnotation;

/**
 * Created by clong on 3/12/17.
 */
@SubRuleAnnotation
public class SubRule extends SampleRule {
  @Given("fact1")
  String _subFact;

  @When
  public boolean condition() {
    return getFact1().equals(getFact2());
  }

  public String getSubFact() {
    return _subFact;
  }
}

