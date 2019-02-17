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
public class PercentToken implements Token{
    @Override
    public int hashCode() { return 22; }
    @Override
    public boolean equals(final Object other) {
        return other instanceof PercentToken;
    }
    @Override
    public String toString() {
        return "%";
    }
    
}
