package homework08.calculator;

public interface IOperation<operation> {
    public <N extends Number> double operation(N a, N b);
}
