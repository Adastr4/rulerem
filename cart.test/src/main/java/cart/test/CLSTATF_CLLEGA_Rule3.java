package cart.test;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;
import com.deliveredtechnologies.rulebook.annotation.Result;

import java.util.List;

@Rule(order = 1) // order specifies the order the rule should execute in; if not specified, any
					// order may be used
public class CLSTATF_CLLEGA_Rule3 {
	private static final RuleState BREAK = null;

	@Given
	private List<CaratteristicaBean> caratteristiche; // Annotated Lists get injected with all Facts of the declared
														// generic type

	@Result
	private boolean validate;

	@When
	public boolean when() {
		System.out.println("executing rule 3 no package");
		return caratteristiche.stream()
				.anyMatch(caratteristica -> caratteristica.getCLLEGA().substring(0, 1).equalsIgnoreCase("8"))
				&& caratteristiche.stream()
						.anyMatch(caratteristica -> caratteristica.getCLSTATF().substring(0, 2).equalsIgnoreCase("h3"));
	}

	@Then
	public RuleState then() {
		System.out.println("executed rule 3 no package");
		validate = Boolean.FALSE;
		return RuleState.BREAK;
	}

}
