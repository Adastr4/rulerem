package cart.test.constraints.cs2;

import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import test.test.CaratteristicaBean;

@Rule(order = 7) // order specifies the order the rule should execute in; if not specified, any
					// order may be used
public class CLFINI_Rule7 {
	private static final RuleState BREAK = null;

	@Given
	private List<CaratteristicaBean> caratteristiche; // Annotated Lists get injected with all Facts of the declared
														// generic type

	@Result
	private boolean validate;

	@When
	public boolean when() {
		System.out.println("executing rule 7 no package");
		return ( caratteristiche.stream()
				.anyMatch(caratteristica -> caratteristica.getCLFINI().equalsIgnoreCase("i")) ||
				caratteristiche.stream()
				.anyMatch(caratteristica -> caratteristica.getCLFINI().equalsIgnoreCase("t")) ||
				caratteristiche.stream()
				.anyMatch(caratteristica -> caratteristica.getCLFINI().equalsIgnoreCase("u")) ||
				caratteristiche.stream()
				.anyMatch(caratteristica -> caratteristica.getCLFINI().equalsIgnoreCase("y")) ||
				caratteristiche.stream()
				.anyMatch(caratteristica -> caratteristica.getCLFINI().equalsIgnoreCase("o")) )
				&&
				(caratteristiche.stream().anyMatch(caratteristica -> caratteristica.getCLSTATF().substring(0, 2).equalsIgnoreCase("a1"))
				|| caratteristiche.stream().anyMatch(caratteristica -> caratteristica.getCLSTATF().substring(0, 2).equalsIgnoreCase("00")) )
				&&
				(caratteristiche.stream().anyMatch(caratteristica -> caratteristica.getCLLEGA().equalsIgnoreCase("3b")) ||
						caratteristiche.stream().anyMatch(caratteristica -> caratteristica.getCLLEGA().equalsIgnoreCase("3m")) ||
						caratteristiche.stream().anyMatch(caratteristica -> caratteristica.getCLLEGA().equalsIgnoreCase("3o"))

						);
	}

	@Then
	public RuleState then() {
		System.out.println("executed rule 7 no package");
		validate = Boolean.FALSE;
		return RuleState.BREAK;
	}


}
