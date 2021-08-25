package cart.test.library.subrules1;

import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.When;

import cart.test.CaratteristicaBean;

@Rule //order specifies the order the rule should execute in; if not specified, any order may be used
public class CLSTATF_CLLEGA_Rule4 {

	private static final RuleState BREAK = null;

@Given
  private List<CaratteristicaBean> caratteristiche; //Annotated Lists get injected with all Facts of the declared generic type

//  @Result
//  private boolean validate = Boolean.FALSE;

  @When
  public boolean when() {
	System.out.println("Exceuting rule 4 package subrules1");

    boolean res =
    		( caratteristiche.stream().anyMatch(caratteristica -> caratteristica.getCLSTATF().equalsIgnoreCase("h00")) ||
    		  caratteristiche.stream().anyMatch(caratteristica -> caratteristica.getCLSTATF().equalsIgnoreCase("ha1")) ||
    	      caratteristiche.stream().anyMatch(caratteristica -> caratteristica.getCLSTATF().equalsIgnoreCase("h12")) ||
    	      caratteristiche.stream().anyMatch(caratteristica -> caratteristica.getCLSTATF().equalsIgnoreCase("h15")) ||
    	      caratteristiche.stream().anyMatch(caratteristica -> caratteristica.getCLSTATF().equalsIgnoreCase("h16")) ||
    	      caratteristiche.stream().anyMatch(caratteristica -> caratteristica.getCLSTATF().equalsIgnoreCase("h17")) ||
    	      caratteristiche.stream().anyMatch(caratteristica -> caratteristica.getCLSTATF().equalsIgnoreCase("h14"))
    				) ;

    return res;
  }
//	  @Then
//  public RuleState then() {
	  //     System.out.println("Exceuted rule 4");
//	  validate = Boolean.TRUE ;
	  //	  return RuleState.NEXT;
	  //  }

}
