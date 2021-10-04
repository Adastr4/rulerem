package cart.test.constraints.cs2;

import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import test.test.CaratteristicaBean;

@Rule(order = 2) // order specifies the order the rule should execute in; if not specified, any
					// order may be used
public class CLFINI_Rule2 {
	private static final RuleState BREAK = null;

	@Given
	private List<CaratteristicaBean> caratteristiche; // Annotated Lists get injected with all Facts of the declared
														// generic type

	@Result
	private boolean validate;

	@When
	public boolean when() {
		System.out.println("executing rule 2 no package");
		return getClasse().equalsIgnoreCase("EDT");
	}

	@Then
	public RuleState then() {
		System.out.println("executed rule 2 no package");
		validate = Boolean.FALSE;
		return RuleState.BREAK;
	}
	private String getClasse() {
		String classe;// = ReadDB.readClasse();
		classe = "EDT";
		return classe;
	}

}
