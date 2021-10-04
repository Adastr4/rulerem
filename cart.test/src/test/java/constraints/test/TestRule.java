package constraints.test;

import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import cart.test.Macchina;
import it.profilglass.classmodel.ICaratteristica;

@Rule(order = 1, name="Rule5") // order specifies the order the rule should execute in; if not specified, any
					// order may be used
public class TestRule {
	private static final RuleState BREAK = null;

	@Given
	private List<ICaratteristica> caratteristiche; // Annotated Lists get injected with all Facts of the declared
														// generic type

	@Given
	private List<Macchina> macchine;

	@Result
	private List<Macchina> macchineRes;

	@When
	public boolean when() {

		return true;
	}

	@Then
	public RuleState then() {
		macchine.add(new Macchina("123"));
		System.out.println("pippo");
		macchineRes = macchine;
		return RuleState.BREAK;
	}

}
