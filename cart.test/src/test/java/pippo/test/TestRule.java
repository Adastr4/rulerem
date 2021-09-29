package pippo.test;

import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import cart.test.CaratteristicaBean;
import cart.test.Macchina;

@Rule(order = 1, name="Rule5") // order specifies the order the rule should execute in; if not specified, any
					// order may be used
public class TestRule {
	private static final RuleState BREAK = null;

	@Given
	private List<CaratteristicaBean> caratteristiche; // Annotated Lists get injected with all Facts of the declared
														// generic type

	@Result
	private List<Macchina> macchine;

	@When
	public boolean when() {
	    System.out.println("ZZZZZZZZZZ");
		return true;
	}

	@Then
	public RuleState then() {
		macchine.add(new Macchina("123"));
		System.out.println("pippo");
		return RuleState.BREAK;
	}

}
