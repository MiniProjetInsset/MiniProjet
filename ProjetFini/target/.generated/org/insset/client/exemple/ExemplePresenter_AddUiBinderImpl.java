// .ui.xml template last modified: 1507724507000
package org.insset.client.exemple;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.safehtml.client.SafeHtmlTemplates;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlUtils;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.safehtml.shared.SafeUri;
import com.google.gwt.safehtml.shared.UriUtils;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.HTMLPanel;

public class ExemplePresenter_AddUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.HTMLPanel, org.insset.client.exemple.ExemplePresenter>, org.insset.client.exemple.ExemplePresenter.AddUiBinder {

  interface Template extends SafeHtmlTemplates {
    @Template("<span id='{0}'></span> <h1>Projet de mise en pratique Scrum</h1>  <div class='bs-section'> <span id='{1}'></span> </div>")
    SafeHtml html1(String arg0, String arg1);
     
  }

  Template template = GWT.create(Template.class);


  public com.google.gwt.user.client.ui.HTMLPanel createAndBindUi(final org.insset.client.exemple.ExemplePresenter owner) {


    return new Widgets(owner).get_f_HTMLPanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final org.insset.client.exemple.ExemplePresenter owner;


    public Widgets(final org.insset.client.exemple.ExemplePresenter owner) {
      this.owner = owner;
      build_domId0();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId1();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId0Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId1Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
    }

    SafeHtml template_html1() {
      return template.html1(get_domId0(), get_domId1());
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 0 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private org.insset.client.exemple.ExemplePresenter_AddUiBinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private org.insset.client.exemple.ExemplePresenter_AddUiBinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final org.insset.client.exemple.ExemplePresenter_AddUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (org.insset.client.exemple.ExemplePresenter_AddUiBinderImpl_GenBundle) GWT.create(org.insset.client.exemple.ExemplePresenter_AddUiBinderImpl_GenBundle.class);
      // Setup section.

      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for f_HTMLPanel1 called 1 times. Type: DEFAULT. Build precedence: 1.
     */
    private com.google.gwt.user.client.ui.HTMLPanel get_f_HTMLPanel1() {
      return build_f_HTMLPanel1();
    }
    private com.google.gwt.user.client.ui.HTMLPanel build_f_HTMLPanel1() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel(template_html1().asString());
      // Setup section.

      {
        // Attach section.
        UiBinderUtil.TempAttachment __attachRecord__ = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());

        get_domId0Element().get();
        get_domId1Element().get();

        // Detach section.
        __attachRecord__.detach();
      }
      f_HTMLPanel1.addAndReplaceElement(get_menu(), get_domId0Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_f_FlowPanel2(), get_domId1Element().get());

      return f_HTMLPanel1;
    }

    /**
     * Getter for domId0 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId0;
    private java.lang.String get_domId0() {
      return domId0;
    }
    private java.lang.String build_domId0() {
      // Creation section.
      domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.

      return domId0;
    }

    /**
     * Getter for menu called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private org.insset.client.menu.Menu get_menu() {
      return build_menu();
    }
    private org.insset.client.menu.Menu build_menu() {
      // Creation section.
      final org.insset.client.menu.Menu menu = (org.insset.client.menu.Menu) GWT.create(org.insset.client.menu.Menu.class);
      // Setup section.

      return menu;
    }

    /**
     * Getter for domId0Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId0Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId0Element() {
      return domId0Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId0Element() {
      // Creation section.
      domId0Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId0());
      // Setup section.

      return domId0Element;
    }

    /**
     * Getter for domId1 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId1;
    private java.lang.String get_domId1() {
      return domId1;
    }
    private java.lang.String build_domId1() {
      // Creation section.
      domId1 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.

      return domId1;
    }

    /**
     * Getter for f_FlowPanel2 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.FlowPanel get_f_FlowPanel2() {
      return build_f_FlowPanel2();
    }
    private com.google.gwt.user.client.ui.FlowPanel build_f_FlowPanel2() {
      // Creation section.
      final com.google.gwt.user.client.ui.FlowPanel f_FlowPanel2 = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
      // Setup section.
      f_FlowPanel2.add(get_f_FormPanel3());
      f_FlowPanel2.add(get_f_FlowPanel4());
      f_FlowPanel2.add(get_f_FlowPanel6());
      f_FlowPanel2.add(get_f_FlowPanel7());
      f_FlowPanel2.add(get_formActions());

      return f_FlowPanel2;
    }

    /**
     * Getter for f_FormPanel3 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.FormPanel get_f_FormPanel3() {
      return build_f_FormPanel3();
    }
    private com.google.gwt.user.client.ui.FormPanel build_f_FormPanel3() {
      // Creation section.
      final com.google.gwt.user.client.ui.FormPanel f_FormPanel3 = (com.google.gwt.user.client.ui.FormPanel) GWT.create(com.google.gwt.user.client.ui.FormPanel.class);
      // Setup section.

      return f_FormPanel3;
    }

    /**
     * Getter for f_FlowPanel4 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.FlowPanel get_f_FlowPanel4() {
      return build_f_FlowPanel4();
    }
    private com.google.gwt.user.client.ui.FlowPanel build_f_FlowPanel4() {
      // Creation section.
      final com.google.gwt.user.client.ui.FlowPanel f_FlowPanel4 = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
      // Setup section.
      f_FlowPanel4.add(get_f_Label5());

      return f_FlowPanel4;
    }

    /**
     * Getter for f_Label5 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label5() {
      return build_f_Label5();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label5() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label5 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label5.setText("Quelle est votre nom ?");

      return f_Label5;
    }

    /**
     * Getter for f_FlowPanel6 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.FlowPanel get_f_FlowPanel6() {
      return build_f_FlowPanel6();
    }
    private com.google.gwt.user.client.ui.FlowPanel build_f_FlowPanel6() {
      // Creation section.
      final com.google.gwt.user.client.ui.FlowPanel f_FlowPanel6 = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
      // Setup section.
      f_FlowPanel6.add(get_nom());

      return f_FlowPanel6;
    }

    /**
     * Getter for nom called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.TextBox get_nom() {
      return build_nom();
    }
    private com.google.gwt.user.client.ui.TextBox build_nom() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextBox nom = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.
      nom.setText("Entrer votre nom");

      this.owner.nom = nom;

      return nom;
    }

    /**
     * Getter for f_FlowPanel7 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.FlowPanel get_f_FlowPanel7() {
      return build_f_FlowPanel7();
    }
    private com.google.gwt.user.client.ui.FlowPanel build_f_FlowPanel7() {
      // Creation section.
      final com.google.gwt.user.client.ui.FlowPanel f_FlowPanel7 = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
      // Setup section.
      f_FlowPanel7.add(get_errorLabel());

      return f_FlowPanel7;
    }

    /**
     * Getter for errorLabel called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.Label get_errorLabel() {
      return build_errorLabel();
    }
    private com.google.gwt.user.client.ui.Label build_errorLabel() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label errorLabel = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.

      this.owner.errorLabel = errorLabel;

      return errorLabel;
    }

    /**
     * Getter for formActions called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.FlowPanel get_formActions() {
      return build_formActions();
    }
    private com.google.gwt.user.client.ui.FlowPanel build_formActions() {
      // Creation section.
      final com.google.gwt.user.client.ui.FlowPanel formActions = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
      // Setup section.
      formActions.add(get_boutonEnregistrer());
      formActions.add(get_boutonClear());

      return formActions;
    }

    /**
     * Getter for boutonEnregistrer called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.SubmitButton get_boutonEnregistrer() {
      return build_boutonEnregistrer();
    }
    private com.google.gwt.user.client.ui.SubmitButton build_boutonEnregistrer() {
      // Creation section.
      final com.google.gwt.user.client.ui.SubmitButton boutonEnregistrer = (com.google.gwt.user.client.ui.SubmitButton) GWT.create(com.google.gwt.user.client.ui.SubmitButton.class);
      // Setup section.
      boutonEnregistrer.setText("Envoyer");

      this.owner.boutonEnregistrer = boutonEnregistrer;

      return boutonEnregistrer;
    }

    /**
     * Getter for boutonClear called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.ResetButton get_boutonClear() {
      return build_boutonClear();
    }
    private com.google.gwt.user.client.ui.ResetButton build_boutonClear() {
      // Creation section.
      final com.google.gwt.user.client.ui.ResetButton boutonClear = (com.google.gwt.user.client.ui.ResetButton) GWT.create(com.google.gwt.user.client.ui.ResetButton.class);
      // Setup section.
      boutonClear.setText("Clear");

      this.owner.boutonClear = boutonClear;

      return boutonClear;
    }

    /**
     * Getter for domId1Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId1Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId1Element() {
      return domId1Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId1Element() {
      // Creation section.
      domId1Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId1());
      // Setup section.

      return domId1Element;
    }
  }
}
