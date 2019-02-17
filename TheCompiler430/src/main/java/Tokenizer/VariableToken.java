/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tokenizer;

/**
 *
 * @author Quelyn
 */
public class VariableToken implements Token {
    public final String name;

    public VariableToken(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() { return name.hashCode(); }
    @Override
    public boolean equals(final Object other) {
        return (other instanceof VariableToken &&
                ((VariableToken)other).name.equals(name));
    }
    @Override
    public String toString() {
        return name;
    }
}
