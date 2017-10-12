package org.insset.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.History;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class calculatorInsset implements EntryPoint {

    /**
     * This is the entry point method.
     */
    public void onModuleLoad() {

        String initToken = History.getToken();

        if (initToken.length() == 0) {
            History.newItem("exemple");
        }

        History.addValueChangeHandler(new HistoryListener());
        History.fireCurrentHistoryState();

//        RootPanel.get().add(new CalculatorPresenter());
    }
}
