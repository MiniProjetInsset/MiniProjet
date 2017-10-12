package org.insset.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import org.insset.client.service.ExempleService;

/**
 * The server side implementation of the RPC service.
 */
@SuppressWarnings("serial")
public class ExempleServiceImpl extends RemoteServiceServlet implements
        ExempleService {

    public String inverserChaine(String input) throws IllegalArgumentException {
        int longueur = input.length();
        StringBuffer envers = new StringBuffer();
        int i;

        for (i = 0; i < longueur; i++) {
            envers.append(input.charAt(longueur - i - 1));
        }
        return new String(envers);
    }

}
