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
public class RightParenToken implements Token {
    @Override
    public int hashCode() { return 8; }
    @Override
    public boolean equals(final Object other) {
        return other instanceof RightParenToken;
    }
    @Override
    public String toString() {
        return ")";
    }
}