/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state.wiki;

/**
 *
 * @author FA18-BSE-057
 */
class StateContext {
    private State state;
    
    public StateContext() {
        state = new LowerCaseState();
    }

    void setState(State newState) {
        state = newState;
    }

    public void writeName(String name) {
        state.writeName(this, name);
    }
}
