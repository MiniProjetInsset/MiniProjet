// .ui.xml template last modified: 1507724507000
package org.insset.client.menu;

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

public class Menu_MenuUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.HTMLPanel, org.insset.client.menu.Menu>, org.insset.client.menu.Menu.MenuUiBinder {

  interface Template extends SafeHtmlTemplates {
    @Template("Exemple")
    SafeHtml html1();
     
    @Template("Romain")
    SafeHtml html2();
     
    @Template("Pourcentage")
    SafeHtml html3();
     
    @Template("<div> <span id='{0}'></span> </div>")
    SafeHtml html4(String arg0);
     
  }

  Template template = GWT.create(Template.class);


  public com.google.gwt.user.client.ui.HTMLPanel createAndBindUi(final org.insset.client.menu.Menu owner) {


    return new Widgets(owner).get_f_HTMLPanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final org.insset.client.menu.Menu owner;


    public Widgets(final org.insset.client.menu.Menu owner) {
      this.owner = owner;
      build_domId0();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId0Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
    }

    SafeHtml template_html1() {
      return template.html1();
    }
    SafeHtml template_html2() {
      return template.html2();
    }
    SafeHtml template_html3() {
      return template.html3();
    }
    SafeHtml template_html4() {
      return template.html4(get_domId0());
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 0 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private org.insset.client.menu.Menu_MenuUiBinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private org.insset.client.menu.Menu_MenuUiBinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final org.insset.client.menu.Menu_MenuUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (org.insset.client.menu.Menu_MenuUiBinderImpl_GenBundle) GWT.create(org.insset.client.menu.Menu_MenuUiBinderImpl_GenBundle.class);
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
      final com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel(template_html4().asString());
      // Setup section.

      {
        // Attach section.
        UiBinderUtil.TempAttachment __attachRecord__ = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());

        get_domId0Element().get();

        // Detach section.
        __attachRecord__.detach();
      }
      f_HTMLPanel1.addAndReplaceElement(get_menu(), get_domId0Element().get());

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
    private com.google.gwt.user.client.ui.MenuBar get_menu() {
      return build_menu();
    }
    private com.google.gwt.user.client.ui.MenuBar build_menu() {
      // Creation section.
      final com.google.gwt.user.client.ui.MenuBar menu = (com.google.gwt.user.client.ui.MenuBar) GWT.create(com.google.gwt.user.client.ui.MenuBar.class);
      // Setup section.
      menu.addItem(get_accueil());
      menu.addItem(get_romain());
      menu.addItem(get_pourcentage());

      return menu;
    }

    /**
     * Getter for accueil called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.MenuItem get_accueil() {
      return build_accueil();
    }
    private com.google.gwt.user.client.ui.MenuItem build_accueil() {
      // Creation section.
      final com.google.gwt.user.client.ui.MenuItem accueil = new com.google.gwt.user.client.ui.MenuItem("", (com.google.gwt.user.client.Command) null);
      // Setup section.
      accueil.setHTML(template_html1().asString());

      this.owner.accueil = accueil;

      return accueil;
    }

    /**
     * Getter for romain called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.MenuItem get_romain() {
      return build_romain();
    }
    private com.google.gwt.user.client.ui.MenuItem build_romain() {
      // Creation section.
      final com.google.gwt.user.client.ui.MenuItem romain = new com.google.gwt.user.client.ui.MenuItem("", (com.google.gwt.user.client.Command) null);
      // Setup section.
      romain.setHTML(template_html2().asString());

      this.owner.romain = romain;

      return romain;
    }

    /**
     * Getter for pourcentage called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.MenuItem get_pourcentage() {
      return build_pourcentage();
    }
    private com.google.gwt.user.client.ui.MenuItem build_pourcentage() {
      // Creation section.
      final com.google.gwt.user.client.ui.MenuItem pourcentage = new com.google.gwt.user.client.ui.MenuItem("", (com.google.gwt.user.client.Command) null);
      // Setup section.
      pourcentage.setHTML(template_html3().asString());

      this.owner.pourcentage = pourcentage;

      return pourcentage;
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
  }
}
