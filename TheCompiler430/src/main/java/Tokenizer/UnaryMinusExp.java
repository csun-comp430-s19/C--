/*
 * modified from code in class
 */
package Tokenizer;

/**
 *
 * @author Victoria
 */
public class UnaryMinusExp implements Exp
{

    public final Exp child;

    public UnaryMinusExp(final Exp child)
    {
        this.child = child;
    }
}
