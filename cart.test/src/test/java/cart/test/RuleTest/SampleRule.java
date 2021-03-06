package cart.test.RuleTest;



import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

import com.deliveredtechnologies.rulebook.Fact;
import com.deliveredtechnologies.rulebook.FactMap;
import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

/**
 * Sample POJO rule with facts and a result.
 */
@Rule(order = 2, name = "Result Rule")
public class SampleRule {

  @Given("fact1")
  private Fact<String> _fact1;

  @Given("fact2")
  private Fact<String> _fact2;

  @Given
  private List<String> _strList;

  @Given
  private Map<String, String> _strMap;

  @Given
  private Set<String> _strSet;

  @Given
  private Queue<String> _queue;

  @Given
  private FactMap<String> _factMap;

  @Given("value1")
  private int _value1;

  @Given
  private Set<Integer> _valueSet;

  @Given
  private List<Integer> _valueList;

  @Given
  private Map<String, Integer> _valueMap;

  @Result
  private String _result;

  public String getFact1() {
    return _fact1.getValue();
  }

  public String getFact2() {
    return _fact2.getValue();
  }

  public FactMap<String> getFactMap() {
    return _factMap;
  }

  public Queue<String> getQueue() {
    return _queue;
  }

  public String getResult() {
    return _result;
  }

  public List<String> getStrList() {
    return _strList;
  }

  public Map<String, String> getStrMap() {
    return _strMap;
  }

  public Set<String> getStrSet() {
    return _strSet;
  }

  public int getValue1() {
    return _value1;
  }

  public List<Integer> getValueList() {
    return _valueList;
  }

  public Map<String, Integer> getValueMap() {
    return _valueMap;
  }

  public Set<Integer> getValueSet() {
    return _valueSet;
  }

  /**
   * Method then() performs the rule's action.
   * @return  RuleState.NEXT to continue to the next rule in the chain
   */
  @Then
  public RuleState then() {
    _fact2.setValue("So Factual Too!");
    _fact1.setValue("So Factual Too!");
    _result = _result != null && (_result.equals("default") || _result.equals("Equivalence Default"))
        ? "Equivalence Default" : "Equivalence, Bitches!";
    return RuleState.NEXT;
  }

  @When
  public boolean when() {
    return _fact1.getValue().equals(_fact2.getValue());
  }
}

