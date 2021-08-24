package cart.test.library.subrules1;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;
import com.deliveredtechnologies.rulebook.annotation.Result;

import java.util.List;

import cart.test.CaratteristicaBean;

@Rule(order = 1003) //order specifies the order the rule should execute in; if not specified, any order may be used
public class CLSTATF_CLLEGA_Rule5 extends CLSTATF_CLLEGA_Rule4{
  
	private static final RuleState BREAK = null;

@Given
  private List<CaratteristicaBean> caratteristiche; //Annotated Lists get injected with all Facts of the declared generic type

  @Result
  private boolean validate = Boolean.FALSE;
  
  @When
  public boolean when() {
	  System.out.println("Exceuting rule 5 package subrules1");
	  boolean superRes = super.when();
	  
    boolean res = 
    		(
    		  caratteristiche.stream().anyMatch(caratteristica -> caratteristica.getSLBPTE().equalsIgnoreCase("b07187")) ||
    		  caratteristiche.stream().anyMatch(caratteristica -> caratteristica.getSLBPTE().equalsIgnoreCase("b03835")) ||		  
    	      caratteristiche.stream().anyMatch(caratteristica -> caratteristica.getSLBPTE().equalsIgnoreCase("b07434"))	
    		)
    		
    		&& superRes;	
       
       return res;
  }
  @Then
  public RuleState then() {
	  System.out.println("executed rule 5 package subrules1");
	  validate = Boolean.TRUE ;
	  return RuleState.BREAK;
  }
 
}