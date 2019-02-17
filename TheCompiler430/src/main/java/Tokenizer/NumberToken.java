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
public class NumberToken implements Token {
    public final int number;

    public NumberToken(int number) {
        this.number = number;
    }

    @Override
    public int hashCode() { return number; }
    @Override
    public boolean equals(final Object other) {
        return (other instanceof NumberToken &&
                ((NumberToken)other).number == number);
    }
    @Override
    public String toString() {
        return Integer.toString(number);
    }
}
