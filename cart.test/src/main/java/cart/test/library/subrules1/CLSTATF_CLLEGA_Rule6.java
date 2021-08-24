package cart.test.library.subrules1;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;
import com.deliveredtechnologies.rulebook.annotation.Result;

import java.util.List;

import cart.test.CaratteristicaBean;

@Rule(order = 1005) //order specifies the order the rule should execute in; if not specified, any order may be used
public class CLSTATF_CLLEGA_Rule6{
  
	private static final RuleState BREAK = null;

@Given
  private List<CaratteristicaBean> caratteristiche; //Annotated Lists get injected with all Facts of the declared generic type

  @Result
  private boolean validate = Boolean.FALSE;
  
  @When
  public boolean when() {
	  System.out.println("Executing rule 6 package subrules1");
	  return Boolean.TRUE;
  }
  @Then
  public RuleState then() {
	  System.out.println("Executed rule 6 package subrules1");
	  validate = Boolean.FALSE ;
	  return BREAK;
  }
 
}
