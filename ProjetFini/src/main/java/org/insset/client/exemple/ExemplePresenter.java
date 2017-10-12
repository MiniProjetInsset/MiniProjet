/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.insset.client.exemple;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ResetButton;
import com.google.gwt.user.client.ui.SubmitButton;
import com.google.gwt.user.client.ui.TextBox;
import org.insset.client.message.Messages;
import org.insset.client.message.dialogbox.DialogBoxInssetPresenter;
import org.insset.client.service.ExempleService;
import org.insset.client.service.ExempleServiceAsync;
import org.insset.shared.FieldVerifier;

/**
 *
 * @author user
 */
public class ExemplePresenter extends Composite {

    @UiField
    public ResetButton boutonClear;
    @UiField
    public SubmitButton boutonEnregistrer;
    @UiField
    public TextBox nom;
    @UiField
    public Label errorLabel;

    /**
     * The message displayed to the user when the server cannot be reached or
     * returns an error.
     */
    private static final String SERVER_ERROR = "An error occurred while "
            + "attempting to contact the server. Please check your network "
            + "connection and try again.";

    /**
     * Create a remote service proxy to talk to the server-side Greeting
     * service.
     */
    private final ExempleServiceAsync service = GWT.create(ExempleService.class);

    private final Messages messages = GWT.create(Messages.class);

    interface AddUiBinder extends UiBinder<HTMLPanel, ExemplePresenter> {
    }

    /**
     * Create UiBinder for the view
     */
    private static AddUiBinder ourUiBinder = GWT.create(AddUiBinder.class);

    /**
     * Constructeur
     */
    public ExemplePresenter() {
        //bind de la page
        initWidget(ourUiBinder.createAndBindUi(this));
        initHandler();
    }

    /**
     * Methode qui innitialise les handler pour les cliques sur les boutons
     */
    protected void initHandler() {
        boutonClear.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                nom.setText("");
                errorLabel.setText("");
            }
        });
        boutonEnregistrer.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                contacterService();
            }

        });
    }

    private void contacterService() {
        errorLabel.setText("");
        final String textToServer = nom.getText();
        if (!FieldVerifier.isValidName(textToServer)) {
            errorLabel.addStyleName("serverResponseLabelError");
            errorLabel.setText("Aucun texte entré!!");
            return;
        }
        service.inverserChaine(textToServer, new AsyncCallback<String>() {
            public void onFailure(Throwable caught) {
                // Show the RPC error message to the user
                Window.alert(SERVER_ERROR);
            }

            public void onSuccess(String result) {
                new DialogBoxInssetPresenter("Votre nom inversé :", textToServer, result);
            }
        });
    }
}
