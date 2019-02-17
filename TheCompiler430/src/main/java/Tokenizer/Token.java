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
public interface Token {
    // not needed; used to indicate that these should be overridden
    @Override
    public int hashCode();
    @Override
    public boolean equals(Object other);
    @Override
    public String toString();
}
