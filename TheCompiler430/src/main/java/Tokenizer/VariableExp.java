/*
 * modified from code in class
 */
package Tokenizer;

/**
 *
 * @author Victoria
 */
public class VariableExp implements Exp
{

    public final String name;

    public VariableExp(final String name)
    {
        this.name = name;
    }
}
