package cart.test.library.subrules1;

import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import cart.test.CaratteristicaBean;
import cart.test.test.SubRuleAnnotation;

@Rule(order = 1004) //order specifies the order the rule should execute in; if not specified, any order may be used
@SubRuleAnnotation
public class CLSTATF_CLLEGA_Rule2 extends CLSTATF_CLLEGA_Rule4{
  private static final RuleState BREAK = null;

@Given
  private List<CaratteristicaBean> caratteristiche; //Annotated Lists get injected with all Facts of the declared generic type

  @Result
  private boolean validate;

  @Override
@When
  public boolean when() {
    System.out.println("executing rule 2 package subrules1");

//	  boolean superRes = super.when();
/*
	  boolean superRes = super.when();
*/
	  boolean res =
    		caratteristiche.stream().anyMatch(caratteristica -> caratteristica.getSLBPTE().equalsIgnoreCase(
    				 caratteristica.getSLBP().toLowerCase()
    				)) &&

    		caratteristiche.stream().anyMatch(caratteristica -> caratteristica.getCLSTATF().equalsIgnoreCase("h14"));
	  //&& !superRes;
/*
    		caratteristiche.stream().anyMatch(caratteristica -> caratteristica.getCLSTATF().equalsIgnoreCase("h14"))
	  && !superRes;
*/

	  return res;
  }
  @Then
  public RuleState then() {
	  System.out.println("executed rule 2 package subrules1");
	  validate = Boolean.TRUE;
	  return BREAK;
  }

}
