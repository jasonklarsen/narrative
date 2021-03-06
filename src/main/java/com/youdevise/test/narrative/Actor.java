package com.youdevise.test.narrative;

/**
 * An entity performing actions during a narrative.
 * @param <T> the type of tool the Actor uses to perform actions
 */
public interface Actor<TYPE, IMPL extends Actor<TYPE, IMPL>> {
	TYPE tool();
	
    void perform(Action<TYPE, IMPL> action);
    <DATA> DATA grabUsing(Extractor<DATA, IMPL> extractor);
}
