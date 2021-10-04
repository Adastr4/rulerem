package cart.test.library.subrules1;

import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.ICaratteristica;

@Rule(order = 1000) //order specifies the order the rule should execute in; if not specified, any order may be used
public class CLSTATF_CLLEGA_Rule1 {
  private static final RuleState BREAK = null;

@Given
  private List<ICaratteristica> caratteristiche; //Annotated Lists get injected with all Facts of the declared generic type

  @Result
  private boolean validate;

  @Then
  public RuleState then() {
//	  System.out.println("executed rule 1 package subrules1");
	  validate = Boolean.FALSE;
	  return RuleState.BREAK;
  }
  @When
  public boolean when() {
//	System.out.println("executing rule 1 package subrules1");
    return
    		caratteristiche.stream().anyMatch(caratteristica -> caratteristica.getCLLEGA().substring(0, 1).equalsIgnoreCase("3")) &&
    		caratteristiche.stream().anyMatch(caratteristica -> caratteristica.getCLSTATF().substring(0, 2).equalsIgnoreCase("h3"));
  }

}
