// .ui.xml template last modified: 1507724507000
package org.insset.client.calculator;

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

public class CalculatorDecimalPresenter_MainUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.HTMLPanel, org.insset.client.calculator.CalculatorDecimalPresenter>, org.insset.client.calculator.CalculatorDecimalPresenter.MainUiBinder {

  interface Template extends SafeHtmlTemplates {
    @Template("<span id='{0}'></span> <h1>Projet de mise en pratique Scrum</h1>  <div class='bs-section'> <span id='{1}'></span> <span id='{2}'></span> <span id='{3}'></span> <span id='{4}'></span> <span id='{5}'></span>  </div>")
    SafeHtml html1(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5);
     
  }

  Template template = GWT.create(Template.class);


  public com.google.gwt.user.client.ui.HTMLPanel createAndBindUi(final org.insset.client.calculator.CalculatorDecimalPresenter owner) {


    return new Widgets(owner).get_f_HTMLPanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final org.insset.client.calculator.CalculatorDecimalPresenter owner;


    public Widgets(final org.insset.client.calculator.CalculatorDecimalPresenter owner) {
      this.owner = owner;
      build_domId0();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId1();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId2();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId3();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId4();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId5();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId0Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId1Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId2Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId3Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId4Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId5Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
    }

    SafeHtml template_html1() {
      return template.html1(get_domId0(), get_domId1(), get_domId2(), get_domId3(), get_domId4(), get_domId5());
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 0 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private org.insset.client.calculator.CalculatorDecimalPresenter_MainUiBinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private org.insset.client.calculator.CalculatorDecimalPresenter_MainUiBinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final org.insset.client.calculator.CalculatorDecimalPresenter_MainUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (org.insset.client.calculator.CalculatorDecimalPresenter_MainUiBinderImpl_GenBundle) GWT.create(org.insset.client.calculator.CalculatorDecimalPresenter_MainUiBinderImpl_GenBundle.class);
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
        get_domId2Element().get();
        get_domId3Element().get();
        get_domId4Element().get();
        get_domId5Element().get();

        // Detach section.
        __attachRecord__.detach();
      }
      f_HTMLPanel1.addAndReplaceElement(get_menu(), get_domId0Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_f_FlowPanel2(), get_domId1Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_f_FlowPanel8(), get_domId2Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_f_FlowPanel9(), get_domId3Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_f_FlowPanel15(), get_domId4Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_f_FlowPanel16(), get_domId5Element().get());

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
      f_FlowPanel2.add(get_f_FlowPanel3());
      f_FlowPanel2.add(get_f_FlowPanel5());
      f_FlowPanel2.add(get_f_FlowPanel6());
      f_FlowPanel2.add(get_f_FlowPanel7());

      return f_FlowPanel2;
    }

    /**
     * Getter for f_FlowPanel3 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.FlowPanel get_f_FlowPanel3() {
      return build_f_FlowPanel3();
    }
    private com.google.gwt.user.client.ui.FlowPanel build_f_FlowPanel3() {
      // Creation section.
      final com.google.gwt.user.client.ui.FlowPanel f_FlowPanel3 = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
      // Setup section.
      f_FlowPanel3.add(get_f_Label4());

      return f_FlowPanel3;
    }

    /**
     * Getter for f_Label4 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label4() {
      return build_f_Label4();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label4() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label4 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label4.setText("Quelle valeur voulez-vous convertir en decimal");

      return f_Label4;
    }

    /**
     * Getter for f_FlowPanel5 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.FlowPanel get_f_FlowPanel5() {
      return build_f_FlowPanel5();
    }
    private com.google.gwt.user.client.ui.FlowPanel build_f_FlowPanel5() {
      // Creation section.
      final com.google.gwt.user.client.ui.FlowPanel f_FlowPanel5 = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
      // Setup section.
      f_FlowPanel5.add(get_valR());
      f_FlowPanel5.add(get_boutonConvertRToA());

      return f_FlowPanel5;
    }

    /**
     * Getter for valR called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.TextBox get_valR() {
      return build_valR();
    }
    private com.google.gwt.user.client.ui.TextBox build_valR() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextBox valR = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.
      valR.setText("Entrer une valeur");

      this.owner.valR = valR;

      return valR;
    }

    /**
     * Getter for boutonConvertRToA called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.SubmitButton get_boutonConvertRToA() {
      return build_boutonConvertRToA();
    }
    private com.google.gwt.user.client.ui.SubmitButton build_boutonConvertRToA() {
      // Creation section.
      final com.google.gwt.user.client.ui.SubmitButton boutonConvertRToA = (com.google.gwt.user.client.ui.SubmitButton) GWT.create(com.google.gwt.user.client.ui.SubmitButton.class);
      // Setup section.
      boutonConvertRToA.setText("Convertir");

      this.owner.boutonConvertRToA = boutonConvertRToA;

      return boutonConvertRToA;
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
      f_FlowPanel6.add(get_errorLabelRToA());

      return f_FlowPanel6;
    }

    /**
     * Getter for errorLabelRToA called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.Label get_errorLabelRToA() {
      return build_errorLabelRToA();
    }
    private com.google.gwt.user.client.ui.Label build_errorLabelRToA() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label errorLabelRToA = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.

      this.owner.errorLabelRToA = errorLabelRToA;

      return errorLabelRToA;
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
      f_FlowPanel7.add(get_boutonClearR());

      return f_FlowPanel7;
    }

    /**
     * Getter for boutonClearR called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.ResetButton get_boutonClearR() {
      return build_boutonClearR();
    }
    private com.google.gwt.user.client.ui.ResetButton build_boutonClearR() {
      // Creation section.
      final com.google.gwt.user.client.ui.ResetButton boutonClearR = (com.google.gwt.user.client.ui.ResetButton) GWT.create(com.google.gwt.user.client.ui.ResetButton.class);
      // Setup section.
      boutonClearR.setText("Clear");

      this.owner.boutonClearR = boutonClearR;

      return boutonClearR;
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

    /**
     * Getter for domId2 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId2;
    private java.lang.String get_domId2() {
      return domId2;
    }
    private java.lang.String build_domId2() {
      // Creation section.
      domId2 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.

      return domId2;
    }

    /**
     * Getter for f_FlowPanel8 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.FlowPanel get_f_FlowPanel8() {
      return build_f_FlowPanel8();
    }
    private com.google.gwt.user.client.ui.FlowPanel build_f_FlowPanel8() {
      // Creation section.
      final com.google.gwt.user.client.ui.FlowPanel f_FlowPanel8 = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
      // Setup section.

      return f_FlowPanel8;
    }

    /**
     * Getter for domId2Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId2Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId2Element() {
      return domId2Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId2Element() {
      // Creation section.
      domId2Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId2());
      // Setup section.

      return domId2Element;
    }

    /**
     * Getter for domId3 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId3;
    private java.lang.String get_domId3() {
      return domId3;
    }
    private java.lang.String build_domId3() {
      // Creation section.
      domId3 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.

      return domId3;
    }

    /**
     * Getter for f_FlowPanel9 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.FlowPanel get_f_FlowPanel9() {
      return build_f_FlowPanel9();
    }
    private com.google.gwt.user.client.ui.FlowPanel build_f_FlowPanel9() {
      // Creation section.
      final com.google.gwt.user.client.ui.FlowPanel f_FlowPanel9 = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
      // Setup section.
      f_FlowPanel9.add(get_f_FlowPanel10());
      f_FlowPanel9.add(get_f_FlowPanel12());
      f_FlowPanel9.add(get_f_FlowPanel13());
      f_FlowPanel9.add(get_f_FlowPanel14());

      return f_FlowPanel9;
    }

    /**
     * Getter for f_FlowPanel10 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.FlowPanel get_f_FlowPanel10() {
      return build_f_FlowPanel10();
    }
    private com.google.gwt.user.client.ui.FlowPanel build_f_FlowPanel10() {
      // Creation section.
      final com.google.gwt.user.client.ui.FlowPanel f_FlowPanel10 = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
      // Setup section.
      f_FlowPanel10.add(get_f_Label11());

      return f_FlowPanel10;
    }

    /**
     * Getter for f_Label11 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label11() {
      return build_f_Label11();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label11() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label11 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label11.setText("Quelle valeur voulez-vous convertir en chiffre romain");

      return f_Label11;
    }

    /**
     * Getter for f_FlowPanel12 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.FlowPanel get_f_FlowPanel12() {
      return build_f_FlowPanel12();
    }
    private com.google.gwt.user.client.ui.FlowPanel build_f_FlowPanel12() {
      // Creation section.
      final com.google.gwt.user.client.ui.FlowPanel f_FlowPanel12 = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
      // Setup section.
      f_FlowPanel12.add(get_valA());
      f_FlowPanel12.add(get_boutonConvertAToR());

      return f_FlowPanel12;
    }

    /**
     * Getter for valA called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.TextBox get_valA() {
      return build_valA();
    }
    private com.google.gwt.user.client.ui.TextBox build_valA() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextBox valA = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.
      valA.setText("Entrer une valeur");

      this.owner.valA = valA;

      return valA;
    }

    /**
     * Getter for boutonConvertAToR called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.SubmitButton get_boutonConvertAToR() {
      return build_boutonConvertAToR();
    }
    private com.google.gwt.user.client.ui.SubmitButton build_boutonConvertAToR() {
      // Creation section.
      final com.google.gwt.user.client.ui.SubmitButton boutonConvertAToR = (com.google.gwt.user.client.ui.SubmitButton) GWT.create(com.google.gwt.user.client.ui.SubmitButton.class);
      // Setup section.
      boutonConvertAToR.setText("Convertir");

      this.owner.boutonConvertAToR = boutonConvertAToR;

      return boutonConvertAToR;
    }

    /**
     * Getter for f_FlowPanel13 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.FlowPanel get_f_FlowPanel13() {
      return build_f_FlowPanel13();
    }
    private com.google.gwt.user.client.ui.FlowPanel build_f_FlowPanel13() {
      // Creation section.
      final com.google.gwt.user.client.ui.FlowPanel f_FlowPanel13 = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
      // Setup section.
      f_FlowPanel13.add(get_errorLabelAToR());

      return f_FlowPanel13;
    }

    /**
     * Getter for errorLabelAToR called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.Label get_errorLabelAToR() {
      return build_errorLabelAToR();
    }
    private com.google.gwt.user.client.ui.Label build_errorLabelAToR() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label errorLabelAToR = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.

      this.owner.errorLabelAToR = errorLabelAToR;

      return errorLabelAToR;
    }

    /**
     * Getter for f_FlowPanel14 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.FlowPanel get_f_FlowPanel14() {
      return build_f_FlowPanel14();
    }
    private com.google.gwt.user.client.ui.FlowPanel build_f_FlowPanel14() {
      // Creation section.
      final com.google.gwt.user.client.ui.FlowPanel f_FlowPanel14 = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
      // Setup section.
      f_FlowPanel14.add(get_boutonClearA());

      return f_FlowPanel14;
    }

    /**
     * Getter for boutonClearA called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.ResetButton get_boutonClearA() {
      return build_boutonClearA();
    }
    private com.google.gwt.user.client.ui.ResetButton build_boutonClearA() {
      // Creation section.
      final com.google.gwt.user.client.ui.ResetButton boutonClearA = (com.google.gwt.user.client.ui.ResetButton) GWT.create(com.google.gwt.user.client.ui.ResetButton.class);
      // Setup section.
      boutonClearA.setText("Clear");

      this.owner.boutonClearA = boutonClearA;

      return boutonClearA;
    }

    /**
     * Getter for domId3Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId3Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId3Element() {
      return domId3Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId3Element() {
      // Creation section.
      domId3Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId3());
      // Setup section.

      return domId3Element;
    }

    /**
     * Getter for domId4 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId4;
    private java.lang.String get_domId4() {
      return domId4;
    }
    private java.lang.String build_domId4() {
      // Creation section.
      domId4 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.

      return domId4;
    }

    /**
     * Getter for f_FlowPanel15 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.FlowPanel get_f_FlowPanel15() {
      return build_f_FlowPanel15();
    }
    private com.google.gwt.user.client.ui.FlowPanel build_f_FlowPanel15() {
      // Creation section.
      final com.google.gwt.user.client.ui.FlowPanel f_FlowPanel15 = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
      // Setup section.

      return f_FlowPanel15;
    }

    /**
     * Getter for domId4Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId4Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId4Element() {
      return domId4Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId4Element() {
      // Creation section.
      domId4Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId4());
      // Setup section.

      return domId4Element;
    }

    /**
     * Getter for domId5 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId5;
    private java.lang.String get_domId5() {
      return domId5;
    }
    private java.lang.String build_domId5() {
      // Creation section.
      domId5 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.

      return domId5;
    }

    /**
     * Getter for f_FlowPanel16 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.FlowPanel get_f_FlowPanel16() {
      return build_f_FlowPanel16();
    }
    private com.google.gwt.user.client.ui.FlowPanel build_f_FlowPanel16() {
      // Creation section.
      final com.google.gwt.user.client.ui.FlowPanel f_FlowPanel16 = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
      // Setup section.
      f_FlowPanel16.add(get_f_FlowPanel17());
      f_FlowPanel16.add(get_f_FlowPanel19());
      f_FlowPanel16.add(get_f_FlowPanel20());
      f_FlowPanel16.add(get_f_FlowPanel21());

      return f_FlowPanel16;
    }

    /**
     * Getter for f_FlowPanel17 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.FlowPanel get_f_FlowPanel17() {
      return build_f_FlowPanel17();
    }
    private com.google.gwt.user.client.ui.FlowPanel build_f_FlowPanel17() {
      // Creation section.
      final com.google.gwt.user.client.ui.FlowPanel f_FlowPanel17 = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
      // Setup section.
      f_FlowPanel17.add(get_f_Label18());

      return f_FlowPanel17;
    }

    /**
     * Getter for f_Label18 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label18() {
      return build_f_Label18();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label18() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label18 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label18.setText("Quelle date voulez-vous convertir?");

      return f_Label18;
    }

    /**
     * Getter for f_FlowPanel19 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.FlowPanel get_f_FlowPanel19() {
      return build_f_FlowPanel19();
    }
    private com.google.gwt.user.client.ui.FlowPanel build_f_FlowPanel19() {
      // Creation section.
      final com.google.gwt.user.client.ui.FlowPanel f_FlowPanel19 = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
      // Setup section.
      f_FlowPanel19.add(get_valD());
      f_FlowPanel19.add(get_boutonConvertD());

      return f_FlowPanel19;
    }

    /**
     * Getter for valD called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.TextBox get_valD() {
      return build_valD();
    }
    private com.google.gwt.user.client.ui.TextBox build_valD() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextBox valD = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.
      valD.setText("Entrer une valeur");

      this.owner.valD = valD;

      return valD;
    }

    /**
     * Getter for boutonConvertD called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.SubmitButton get_boutonConvertD() {
      return build_boutonConvertD();
    }
    private com.google.gwt.user.client.ui.SubmitButton build_boutonConvertD() {
      // Creation section.
      final com.google.gwt.user.client.ui.SubmitButton boutonConvertD = (com.google.gwt.user.client.ui.SubmitButton) GWT.create(com.google.gwt.user.client.ui.SubmitButton.class);
      // Setup section.
      boutonConvertD.setText("Convertir");

      this.owner.boutonConvertD = boutonConvertD;

      return boutonConvertD;
    }

    /**
     * Getter for f_FlowPanel20 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.FlowPanel get_f_FlowPanel20() {
      return build_f_FlowPanel20();
    }
    private com.google.gwt.user.client.ui.FlowPanel build_f_FlowPanel20() {
      // Creation section.
      final com.google.gwt.user.client.ui.FlowPanel f_FlowPanel20 = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
      // Setup section.
      f_FlowPanel20.add(get_errorLabelD());

      return f_FlowPanel20;
    }

    /**
     * Getter for errorLabelD called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.Label get_errorLabelD() {
      return build_errorLabelD();
    }
    private com.google.gwt.user.client.ui.Label build_errorLabelD() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label errorLabelD = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.

      this.owner.errorLabelD = errorLabelD;

      return errorLabelD;
    }

    /**
     * Getter for f_FlowPanel21 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.FlowPanel get_f_FlowPanel21() {
      return build_f_FlowPanel21();
    }
    private com.google.gwt.user.client.ui.FlowPanel build_f_FlowPanel21() {
      // Creation section.
      final com.google.gwt.user.client.ui.FlowPanel f_FlowPanel21 = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
      // Setup section.
      f_FlowPanel21.add(get_boutonClearD());

      return f_FlowPanel21;
    }

    /**
     * Getter for boutonClearD called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.ResetButton get_boutonClearD() {
      return build_boutonClearD();
    }
    private com.google.gwt.user.client.ui.ResetButton build_boutonClearD() {
      // Creation section.
      final com.google.gwt.user.client.ui.ResetButton boutonClearD = (com.google.gwt.user.client.ui.ResetButton) GWT.create(com.google.gwt.user.client.ui.ResetButton.class);
      // Setup section.
      boutonClearD.setText("Clear");

      this.owner.boutonClearD = boutonClearD;

      return boutonClearD;
    }

    /**
     * Getter for domId5Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId5Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId5Element() {
      return domId5Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId5Element() {
      // Creation section.
      domId5Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId5());
      // Setup section.

      return domId5Element;
    }
  }
}
