/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator;

/**
 *
 * @author Carlos
 */
public interface Iterador
{
    public Object primero();
    public Object siguiente();
    public boolean hayMas();
    public Object actual();
}